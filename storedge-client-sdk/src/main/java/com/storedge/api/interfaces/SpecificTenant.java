package main.java.com.storedge.api.interfaces;

import main.java.com.storedge.api.helpers.Meta;
import main.java.com.storedge.api.models.Tenant;

/**
 * Created by vchadha on 6/16/17.
 */
public class SpecificTenant {
    /**
     * tenant object
     */
    private Tenant tenant;

    /**
     * meta object
     */
    private Meta meta;

    /**
     * Parameterized Constructor
     * @param tenant
     * @param meta
     */
    public SpecificTenant(Tenant tenant, Meta meta) {
        this.tenant = tenant;
        this.meta = meta;
    }

    /**
     * Get tenant object
     * @return
     */
    public Tenant getTenant() {
        return tenant;
    }

    /**
     * Set tenant object
     * @param tenant
     */
    public void setTenant(Tenant tenant) {
        this.tenant = tenant;
    }

    /**
     * Get meta object
     * @return
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
