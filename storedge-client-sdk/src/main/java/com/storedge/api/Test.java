package main.java.com.storedge.api;

/**
 * Created by vchadha on 6/15/17.
 * Sample test class
 */

import main.java.com.storedge.api.helpers.*;
import main.java.com.storedge.api.interfaces.*;
import main.java.com.storedge.api.models.*;
import main.java.com.storedge.api.requests.*;

import java.util.List;

public class Test {
    public static void main(String args[]) {
       //Sample consumer key and secret
       final String KEY = "XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX";
       final String SECRET = "XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX";
       final String BASE_URL = "https://api.storedgefms.com/v1/";

       // Sample ids
       final String FACILITY_ID = "9df67dc0-293c-0135-3eed-10ddb1b10572";
       final String UNIT_ID = "9e017df0-293c-0135-3eed-10ddb1b10572";
       final String TENANT_ID = "16863143-056f-4c7b-babd-1b0d7dab55a7";
       final String UNIT_GROUP_ID = "3623b02f-e41c-4f21-8db1-c9a79c73ae85";
       final String LEAD_ID = "16a4a566-c3da-42d0-a73e-fbedc4dfdb33";

       //Create new storedge client
       StoredgeClient client = new StoredgeClient(KEY, SECRET, BASE_URL);

       //GET request
       //Options (You can use the premade options or add custom options (params for get methods work here too [startDate etc])
       Options options = new Options();
       options.setPageNum(2);
       options.setPerPage(5);
       UnitList list = client.getAllUnits(FACILITY_ID, options);

       System.out.println("\nUnits (Page " + list.getMeta().getPagination().getCurrent_page() + "/" + list.getMeta().getPagination().getTotal_pages()+ "):");
       for (Unit element : list.getUnits()) {
           System.out.println("• " + element.getName());
       }

       Unit unit = client.getSpecificUnit(FACILITY_ID, UNIT_ID, null).getUnit();
       System.out.println("\nUnit " + unit.getName() + " - group id: " + unit.getUnit_group_id());

       //You don't have to include options
       List<Unit> list2 = client.getAvailableUnits(FACILITY_ID, null).getUnits();

       System.out.println("\nAvailable units: ");
       for (Unit element : list2) {
           System.out.println("• " + element.getName());
       }

       //POST request
       Tenant tenant = new Tenant();
       tenant.setUsername("awesome_o_5000");
       tenant.setPassword("supersecretpassword");

       //You can resuse the same options object
       options.clear();
       options.setSparseFields("fields[tenant]", "id,username");
       Tenant newTenant = client.tenantSignUp(FACILITY_ID, TENANT_ID, tenant, options).getTenant();
       System.out.println("\n" + newTenant.getUsername() + " has signed up!");

       //GET request
       UnitList unitGroupUnits = client.getUnitGroupUnits(FACILITY_ID, UNIT_GROUP_ID, null);
       System.out.println("\nUnits (Page " + unitGroupUnits.getMeta().getPagination().getCurrent_page() + "/" + unitGroupUnits.getMeta().getPagination().getTotal_pages()+ "):");
       for (Unit element : unitGroupUnits.getUnits()) {
           System.out.println("• " + element.getName());
       }

       SpecificUnitGroup unitGroup = client.getSpecificUnitGroup(FACILITY_ID, UNIT_GROUP_ID, null);
       System.out.println("\nUnit group amenity 1 id: " + unitGroup.getunit_group().getUnit_amenities()[0].getId());

       UnitGroupList groupList = client.getUnitGroups(FACILITY_ID, null);
       System.out.println("\n5th unit group name: " + groupList.getunit_groups().get(5).getName());

       LeadList leads = client.getLeads(FACILITY_ID, null);
       System.out.println("\n1st lead desired move in data: " + leads.getLeads().get(1).getDesired_move_in_date());

       //POST request
       PaymentMethod method = new PaymentMethod();
         method.setKind("credit_card");
         method.setFirst_name("John");
         method.setCard_type("visa");
         method.setCard_number("00000000");
         method.setSecurity_code("123");
         method.setExpiration_date("10/24");
       BillingAddress billing_address_attributes = new BillingAddress();
         billing_address_attributes.setAddress1("123 Main");
         billing_address_attributes.setCity("Somecity");
         billing_address_attributes.setState("AL");
         billing_address_attributes.setPostal("12345");
         billing_address_attributes.setCountry("US");
       method.setBilling_address(billing_address_attributes);

       Lead lead = new Lead();
         lead.setIs_reservation(true);
         lead.setDesired_move_in_date("2017-07-12");
         lead.setUnit_id(UNIT_ID);
       PhoneNumber number = new PhoneNumber();
        number.setNumber("3333333333");
       PhoneNumber[] attributes = new PhoneNumber[]{number};
       TenantAttributes tenantAttributes = new TenantAttributes();
         tenantAttributes.setFirst_name("John");
         tenantAttributes.setLast_name("Doe");
         tenantAttributes.setPhone_numbers_attributes(attributes);
       lead.setTenant_attributes(tenantAttributes);

       SpecificLead newLead = client.createLead(FACILITY_ID, method, lead, null);
       System.out.println("\nNew lead, first name: " + newLead.getLead().getTenant().getFirst_name());
      }
    }
}
