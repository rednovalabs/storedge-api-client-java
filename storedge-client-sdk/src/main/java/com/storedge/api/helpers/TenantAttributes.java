package main.java.com.storedge.api.helpers;

/**
 * Created by vchadha on 7/7/17.
 */
public class TenantAttributes {
    private String title;
    private String first_name;
    private String middle_initial;
    private String last_name;
    private String email;
    private Boolean is_military;
    private Boolean is_business;
    private PhoneNumber[] phone_numbers_attributes;
    private MailingAddress mailing_address_attributes;

    public TenantAttributes() {
    }

    public TenantAttributes(String title, String first_name, String middle_initial, String last_name, String email,
                            Boolean is_military, Boolean is_business, PhoneNumber[] phone_numbers_attributes, MailingAddress mailing_address_attributes) {
        this.title = title;
        this.first_name = first_name;
        this.middle_initial = middle_initial;
        this.last_name = last_name;
        this.email = email;
        this.is_military = is_military;
        this.is_business = is_business;
        this.phone_numbers_attributes = phone_numbers_attributes;
        this.mailing_address_attributes = mailing_address_attributes;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getMiddle_initial() {
        return middle_initial;
    }

    public void setMiddle_initial(String middle_initial) {
        this.middle_initial = middle_initial;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Boolean getIs_military() {
        return is_military;
    }

    public void setIs_military(Boolean is_military) {
        this.is_military = is_military;
    }

    public Boolean getIs_business() {
        return is_business;
    }

    public void setIs_business(Boolean is_business) {
        this.is_business = is_business;
    }

    public PhoneNumber[] getPhone_numbers_attributes() {
        return phone_numbers_attributes;
    }

    public void setPhone_numbers_attributes(PhoneNumber[] phone_numbers_attributes) {
        this.phone_numbers_attributes = phone_numbers_attributes;
    }

    public MailingAddress getMailing_address_attributes() {
        return mailing_address_attributes;
    }

    public void setMailing_address_attributes(MailingAddress mailing_address_attributes) {
        this.mailing_address_attributes = mailing_address_attributes;
    }
}
