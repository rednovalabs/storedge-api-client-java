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
    private Boolean reuseable;
    private String card_number;
    private String card_type;
    private String expiration_date;
    private BillingAddress billing_address;

    private String security_code;
    private String magnetic_track;
    private String account_number;
    private String account_number_confirmation;
    private String account_type;
    private String bank_name;
    private String routing_number;
    private String check_number;
    private String name_on_check;
    private String check_amount;
    private String reference_number;
    private String money_order_amount;
    private String amount_tendered;
    private BillingAddress billing_address_attributes;

    public PaymentMethod() {
    }

    public PaymentMethod(String id, String kind, String first_name, String last_name, Boolean reuseable, String card_number,
                         String card_type, String expiration_date, BillingAddress billing_address, String security_code, String magnetic_track,
                         String account_number, String account_number_confirmation, String account_type, String bank_name, String routing_number,
                         String check_number, String name_on_check, String check_amount, String reference_number, String money_order_amount,
                         String amount_tendered, BillingAddress billing_address_attributes) {
        this.id = id;
        this.kind = kind;
        this.first_name = first_name;
        this.last_name = last_name;
        this.reuseable = reuseable;
        this.card_number = card_number;
        this.card_type = card_type;
        this.expiration_date = expiration_date;
        this.billing_address = billing_address;
        this.security_code = security_code;
        this.magnetic_track = magnetic_track;
        this.account_number = account_number;
        this.account_number_confirmation = account_number_confirmation;
        this.account_type = account_type;
        this.bank_name = bank_name;
        this.routing_number = routing_number;
        this.check_number = check_number;
        this.name_on_check = name_on_check;
        this.check_amount = check_amount;
        this.reference_number = reference_number;
        this.money_order_amount = money_order_amount;
        this.amount_tendered = amount_tendered;
        this.billing_address_attributes = billing_address_attributes;
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

    public Boolean getReuseable() {
        return reuseable;
    }

    public void setReuseable(Boolean reuseable) {
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

    public String getSecurity_code() {
        return security_code;
    }

    public void setSecurity_code(String security_code) {
        this.security_code = security_code;
    }

    public String getMagnetic_track() {
        return magnetic_track;
    }

    public void setMagnetic_track(String magnetic_track) {
        this.magnetic_track = magnetic_track;
    }

    public String getAccount_number() {
        return account_number;
    }

    public void setAccount_number(String account_number) {
        this.account_number = account_number;
    }

    public String getAccount_number_confirmation() {
        return account_number_confirmation;
    }

    public void setAccount_number_confirmation(String account_number_confirmation) {
        this.account_number_confirmation = account_number_confirmation;
    }

    public String getAccount_type() {
        return account_type;
    }

    public void setAccount_type(String account_type) {
        this.account_type = account_type;
    }

    public String getBank_name() {
        return bank_name;
    }

    public void setBank_name(String bank_name) {
        this.bank_name = bank_name;
    }

    public String getRouting_number() {
        return routing_number;
    }

    public void setRouting_number(String routing_number) {
        this.routing_number = routing_number;
    }

    public String getCheck_number() {
        return check_number;
    }

    public void setCheck_number(String check_number) {
        this.check_number = check_number;
    }

    public String getName_on_check() {
        return name_on_check;
    }

    public void setName_on_check(String name_on_check) {
        this.name_on_check = name_on_check;
    }

    public String getCheck_amount() {
        return check_amount;
    }

    public void setCheck_amount(String check_amount) {
        this.check_amount = check_amount;
    }

    public String getReference_number() {
        return reference_number;
    }

    public void setReference_number(String reference_number) {
        this.reference_number = reference_number;
    }

    public String getMoney_order_amount() {
        return money_order_amount;
    }

    public void setMoney_order_amount(String money_order_amount) {
        this.money_order_amount = money_order_amount;
    }

    public String getAmount_tendered() {
        return amount_tendered;
    }

    public void setAmount_tendered(String amount_tendered) {
        this.amount_tendered = amount_tendered;
    }

    public BillingAddress getBilling_address_attributes() {
        return billing_address_attributes;
    }

    public void setBilling_address_attributes(BillingAddress billing_address_attributes) {
        this.billing_address_attributes = billing_address_attributes;
    }
}
