package main.java.com.storedge.api.interfaces;

import main.java.com.storedge.api.helpers.Meta;
import main.java.com.storedge.api.models.UnitGroup;

import java.util.List;

/**
 * Created by vchadha on 7/7/17.
 */
public class UnitGroupList {
    /**
     * List of unit groups
     */
    private List<UnitGroup> unit_groups;

    /**
     * Meta object
     */
    private Meta meta;

    public UnitGroupList(List<UnitGroup> unit_groups, Meta meta) {
        this.unit_groups = unit_groups;
        this.meta = meta;
    }

    public List<UnitGroup> getunit_groups() {
        return unit_groups;
    }

    public void setunit_groups(List<UnitGroup> unit_groups) {
        this.unit_groups = unit_groups;
    }

    public Meta getMeta() {
        return meta;
    }

    public void setMeta(Meta meta) {
        this.meta = meta;
    }
}
