package main.java.com.storedge.api.interfaces;

import main.java.com.storedge.api.helpers.Meta;
import main.java.com.storedge.api.models.Lead;

import java.util.List;

/**
 * Created by vchadha on 7/7/17.
 */
public class LeadList {
    /**
     * Lead object
     */
    private List<Lead> leads;

    /**
     * Meta object
     */
    private Meta meta;

    public LeadList(List<Lead> leads, Meta meta) {
        this.leads = leads;
        this.meta = meta;
    }

    public List<Lead> getLeads() {
        return leads;
    }

    public void setLeads(List<Lead> leads) {
        this.leads = leads;
    }

    public Meta getMeta() {
        return meta;
    }

    public void setMeta(Meta meta) {
        this.meta = meta;
    }
}
