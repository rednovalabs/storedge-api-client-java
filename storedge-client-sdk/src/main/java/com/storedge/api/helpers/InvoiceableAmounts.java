package main.java.com.storedge.api.helpers;

/**
 * Created by vchadha on 7/5/17.
 */
public class InvoiceableAmounts {
    private String id;
    private Double amount;
    private String kind;
    private Double limit;

    public InvoiceableAmounts() {
    }

    public InvoiceableAmounts(String id, double amount, String kind, double limit) {
        this.id = id;
        this.amount = amount;
        this.kind = kind;
        this.limit = limit;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public double getLimit() {
        return limit;
    }

    public void setLimit(double limit) {
        this.limit = limit;
    }
}
