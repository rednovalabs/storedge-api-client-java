package main.java.com.storedge.api.interfaces;

import main.java.com.storedge.api.helpers.Meta;
import main.java.com.storedge.api.models.UnitGroup;

/**
 * Created by vchadha on 7/7/17.
 */
public class SpecificUnitGroup {
    /**
     * Unit group
     */
    private UnitGroup unit_group;

    /**
     * Meta object
     */
    private Meta meta;

    public SpecificUnitGroup(UnitGroup unit_group, Meta meta) {
        this.unit_group = unit_group;
        this.meta = meta;
    }

    public UnitGroup getunit_group() {
        return unit_group;
    }

    public void setunit_group(UnitGroup unit_group) {
        this.unit_group = unit_group;
    }

    public Meta getMeta() {
        return meta;
    }

    public void setMeta(Meta meta) {
        this.meta = meta;
    }
}
