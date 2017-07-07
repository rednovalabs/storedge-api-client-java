package main.java.com.storedge.api.interfaces;

import main.java.com.storedge.api.helpers.Meta;
import main.java.com.storedge.api.models.Unit;

/**
 * Created by vchadha on 6/16/17.
 * Wrapper for unit returned by http request
 */
public class SpecificUnit {
    /**
     * Unit object
     */
    private Unit unit;

    /**
     * Meta object
     */
    private Meta meta;

    /**
     * Parameterized Constructor
     * @param unit
     * @param meta
     */
    public SpecificUnit(Unit unit, Meta meta) {
        this.unit = unit;
        this.meta = meta;
    }

    /**
     * Get unit object
     * @return unit object
     */
    public Unit getUnit() {
        return unit;
    }

    /**
     * Set unit object
     * @param unit
     */
    public void setUnit(Unit unit) {
        this.unit = unit;
    }


    /**
     * Get Meta object
     * @return meta object
     */
    public Meta getMeta() {
        return meta;
    }

    /**
     * Set Meta object
     * @param meta
     */
    public void setMeta(Meta meta) {
        this.meta = meta;
    }
}
