package main.java.com.storedge.api.interfaces;

import main.java.com.storedge.api.models.Tenant;

/**
 * Created by rnlintern1 on 6/16/17.
 */
public class SpecificTenant {
    private Tenant tenant;

    public SpecificTenant(Tenant tenant) {
        this.tenant = tenant;
    }

    public Tenant getTenant() {
        return tenant;
    }

    public void setTenant(Tenant tenant) {
        this.tenant = tenant;
    }
}
