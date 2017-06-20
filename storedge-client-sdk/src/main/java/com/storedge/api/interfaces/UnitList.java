package main.java.com.storedge.api.interfaces;

import main.java.com.storedge.api.models.Unit;

import java.util.List;

/**
 * Created by rnlintern1 on 6/15/17.
 * Wrapper class for list of units returned from http request
 */
public class UnitList {
    /**
     * List of units
     */
    private List<Unit> units;

    /**
     * Parameterized Constructor
     * @param units
     */
    public UnitList(List<Unit> units) {
        this.units = units;
    }

    /**
     * Getter for list of units
     * @return list of units
     */
    public List<Unit> getUnits() {
        return units;
    }

    /**
     * Setter for list of units
     * @param units
     */
    public void setUnits(List<Unit> units) {
        this.units = units;
    }
}
