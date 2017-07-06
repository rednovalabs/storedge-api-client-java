package main.java.com.storedge.api;

/**
 * Created by vchadha on 6/15/17.
 * Sample test class
 */

import main.java.com.storedge.api.interfaces.*;
import main.java.com.storedge.api.models.*;
import main.java.com.storedge.api.requests.*;

import java.util.ArrayList;
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

        //Create new storedge client
        StoredgeClient client = new StoredgeClient(KEY, SECRET, BASE_URL);

        //Test client
        try {
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

            //You don't have to include options
            Unit unit = client.getSpecificUnit(FACILITY_ID, UNIT_ID, null).getUnit();
            System.out.println("\nUnit " + unit.getName() + " - group id: " + unit.getUnit_group_id());

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

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
