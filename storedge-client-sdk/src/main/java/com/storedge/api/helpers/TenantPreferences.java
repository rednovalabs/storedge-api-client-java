package main.java.com.storedge.api.helpers;

/**
 * Created by vchadha on 6/20/17.
 */
public class TenantPreferences {
    private String email_invoices;
    private String delinquency_expempt;

    public TenantPreferences() {
    }

    public TenantPreferences(String email_invoices, String delinquency_expempt) {
        this.email_invoices = email_invoices;
        this.delinquency_expempt = delinquency_expempt;
    }

    public String getEmail_invoices() {
        return email_invoices;
    }

    public void setEmail_invoices(String email_invoices) {
        this.email_invoices = email_invoices;
    }

    public String getDelinquency_expempt() {
        return delinquency_expempt;
    }

    public void setDelinquency_expempt(String delinquency_expempt) {
        this.delinquency_expempt = delinquency_expempt;
    }
}
