package main.java.com.storedge.api;

/**
 * Created by rnlintern1 on 6/15/17.
 * Sample test class
 */

import main.java.com.storedge.api.interfaces.*;
import main.java.com.storedge.api.models.*;

public class Test {
    public static void main(String args[]) {
        //Sample consumer key, secret, and facility id
        final String KEY = "XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX";
        final String SECRET = "XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX";
        final String FACILITY_ID = "9df67dc0-293c-0135-3eed-10ddb1b10572";

        //Create new storedge client
        StoredgeClient client = new StoredgeClient(KEY, SECRET, FACILITY_ID);

        //Test client
        try {
            UnitList list = client.getAllUnits();

            for (Unit element : list.getUnits()) {
                System.out.println("Unit - " + element.getName());
            }

            SpecificUnit unit = client.getSpecificUnit("9e017df0-293c-0135-3eed-10ddb1b10572");
            System.out.println("\nUnit " + unit.getUnit().getName() + " - group id: " + unit.getUnit().getUnit_group_id());

            UnitList list2 = client.getAvailableUnits();

            System.out.println("\nAvailable units: ");
            for (Unit element : list2.getUnits()) {
                System.out.println("• " + element.getName());
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
