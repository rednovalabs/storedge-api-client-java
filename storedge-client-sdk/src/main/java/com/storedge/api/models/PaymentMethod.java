package main.java.com.storedge.api.models;

import main.java.com.storedge.api.helpers.BillingAddress;

/**
 * Created by vchadha on 7/5/17.
 */
public class PaymentMethod {
    private String id;
    private String kind;
    private String first_name;
    private String last_name;
    private boolean reuseable;
    private String card_number;
    private String card_type;
    private String expiration_date;
    private BillingAddress billing_address;

    public PaymentMethod() {
    }

    public PaymentMethod(String id, String kind, String first_name, String last_name, boolean reuseable,
                         String card_number, String card_type, String expiration_date, BillingAddress billing_address) {
        this.id = id;
        this.kind = kind;
        this.first_name = first_name;
        this.last_name = last_name;
        this.reuseable = reuseable;
        this.card_number = card_number;
        this.card_type = card_type;
        this.expiration_date = expiration_date;
        this.billing_address = billing_address;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public boolean isReuseable() {
        return reuseable;
    }

    public void setReuseable(boolean reuseable) {
        this.reuseable = reuseable;
    }

    public String getCard_number() {
        return card_number;
    }

    public void setCard_number(String card_number) {
        this.card_number = card_number;
    }

    public String getCard_type() {
        return card_type;
    }

    public void setCard_type(String card_type) {
        this.card_type = card_type;
    }

    public String getExpiration_date() {
        return expiration_date;
    }

    public void setExpiration_date(String expiration_date) {
        this.expiration_date = expiration_date;
    }

    public BillingAddress getBilling_address() {
        return billing_address;
    }

    public void setBilling_address(BillingAddress billing_address) {
        this.billing_address = billing_address;
    }
}
