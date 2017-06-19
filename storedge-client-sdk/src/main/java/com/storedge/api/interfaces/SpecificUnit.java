package main.java.com.storedge.api.interfaces;

import main.java.com.storedge.api.models.Unit;

/**
 * Created by rnlintern1 on 6/16/17.
 * Wrapper for unit returned by http request
 */
public class SpecificUnit {
    /**
     * Unit object
     */
    private Unit unit;

    /**
     * Parameterized Constructor
     * @param unit
     */
    public SpecificUnit(Unit unit) {
        this.unit = unit;
    }

    /**
     * Getter for unit
     * @return
     */
    public Unit getUnit() {
        return unit;
    }

    /**
     * Setter for unit
     * @param unit
     */
    public void setUnit(Unit unit) {
        this.unit = unit;
    }
}
