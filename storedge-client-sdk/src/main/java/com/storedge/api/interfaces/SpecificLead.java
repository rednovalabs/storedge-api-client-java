package main.java.com.storedge.api.interfaces;

import main.java.com.storedge.api.helpers.Meta;
import main.java.com.storedge.api.models.Lead;

/**
 * Created by vchadha on 7/6/17.
 */
public class SpecificLead {
    /**
     * Lead object
     */
    private Lead lead;

    /**
     * Meta object
     */
    private Meta meta;

    /**
     * Parameterized Constructor
     * @param lead
     * @param meta
     */
    public SpecificLead(Lead lead, Meta meta) {
        this.lead = lead;
        this.meta = meta;
    }

    /**
     * Get lead object
     * @return lead object
     */
    public Lead getLead() {
        return lead;
    }

    /**
     * Set object lead
     * @param lead
     */
    public void setLead(Lead lead) {
        this.lead = lead;
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
}
