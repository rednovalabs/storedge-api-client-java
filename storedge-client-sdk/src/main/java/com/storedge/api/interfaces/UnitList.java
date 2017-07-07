package main.java.com.storedge.api.interfaces;

import main.java.com.storedge.api.helpers.Meta;
import main.java.com.storedge.api.models.Unit;

import java.util.List;

/**
 * Created by vchadha on 6/15/17.
 * Wrapper class for list of units returned from http request
 */
public class UnitList {
    /**
     * List of units
     */
    private List<Unit> units;

    /**
     * Meta object
     */
    private Meta meta;

    /**
     * Parameterized Constructor
     * @param units
     * @param meta
     */
    public UnitList(List<Unit> units, Meta meta) {
        this.units = units;
        this.meta = meta;
    }

    /**
     * Get meta object
     * @return meta object
     */
    public Meta getMeta() {
        return meta;
    }

    /**
     * Set meta object
     * @param meta
     */
    public void setMeta(Meta meta) {
        this.meta = meta;
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
