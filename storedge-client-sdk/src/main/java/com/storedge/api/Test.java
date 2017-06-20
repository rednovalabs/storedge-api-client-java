package main.java.com.storedge.api;

/**
 * Created by rnlintern1 on 6/15/17.
 * Sample test class
 */

import main.java.com.storedge.api.models.*;

import java.util.List;

public class Test {
    public static void main(String args[]) {
        //Sample consumer key and secret
        final String KEY = "XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX";
        final String SECRET = "XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX";

        //Sample ids
        final String FACILITY_ID = "9df67dc0-293c-0135-3eed-10ddb1b10572";
        final String UNIT_ID = "9e017df0-293c-0135-3eed-10ddb1b10572";
        final String TENANT_ID = "16863143-056f-4c7b-babd-1b0d7dab55a7";

        //Create new storedge client
        StoredgeClient client = new StoredgeClient(KEY, SECRET, FACILITY_ID);

        //Test client
        try {
            //GET request
            List<Unit> list = client.getAllUnits();

            for (Unit element : list) {
                System.out.println("Unit - " + element.getName());
            }

            Unit unit = client.getSpecificUnit(UNIT_ID);
            System.out.println("\nUnit " + unit.getName() + " - group id: " + unit.getUnit_group_id());

            List<Unit> list2 = client.getAvailableUnits();

            System.out.println("\nAvailable units: ");
            for (Unit element : list2) {
                System.out.println("• " + element.getName());
            }

            //POST request
            //Create tenant object to pass as json data in body of request
            Tenant tenant = new Tenant();
            tenant.setUsername("awesome_o_5000");
            tenant.setPassword("supersecretpassword");

            //Execute request
            Tenant newTenant = client.tenantSignUp(TENANT_ID, tenant);
            System.out.println("\n" + newTenant.getUsername() + " has signed up!");

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
