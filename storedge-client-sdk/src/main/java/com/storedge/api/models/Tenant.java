package main.java.com.storedge.api.models;

import main.java.com.storedge.api.helpers.Address;
import main.java.com.storedge.api.helpers.MailingAddress;
import main.java.com.storedge.api.helpers.PhoneNumber;
import main.java.com.storedge.api.helpers.TenantPreferences;

/**
 * Created by vchadha on 6/16/17.
 */
public class Tenant {
    private String id;
    private long account_number;
    private String first_name;
    private String last_name;
    private String middle_initial;
    private String email;
    private boolean tax_exempt;
    private boolean is_military;
    private boolean is_business;
    private String business_name;
    private String last_sign_in_at;
    private String title;
    private boolean delinquent;
    private String current_ledger_ids[];
    private TenantPreferences preferences;
    private String username;
    private String login;
    private String password;
    private String reset_token;
    private String current_password;
    private String new_password;
    private String drivers_license_number;
    private String drivers_license_state;
    private String vehicle_license_plate_number;
    private String vehilce_license_state;
    private String vehicle_description;
    private boolean has_tenant_portal_account;
    private String created_at;
    private boolean gate_24_hour_access;
    private boolean active;
    private String tenant_account_kind_name;
    private PhoneNumber[] phone_numbers;
    private PhoneNumber[] phone_numbers_attributes;
    private MailingAddress mailing_address;
    private MailingAddress mailing_address_attributes;
    private Address addresses[];
    private String facility_id;
    private String previous_ledger_ids[];
    private String lead_ids[];
    private String closed_lead_ids[];
    private String contact_ids[];
    private String support_case_ids[];
    private String event_ids[];
    private String password_recovery_question_ids[];

    public Tenant() {
    }

    public Tenant(String id, long account_number, String first_name, String last_name, String middle_initial, String email,
                  boolean tax_exempt, boolean is_military, boolean is_business, String business_name, String last_sign_in_at,
                  String title, boolean delinquent, String[] current_ledger_ids, TenantPreferences preferences, String username,
                  String login, String password, String reset_token, String current_password, String new_password,
                  String drivers_license_number, String drivers_license_state, String vehicle_license_plate_number,
                  String vehilce_license_state, String vehicle_description, boolean has_tenant_portal_account, String created_at,
                  boolean gate_24_hour_access, boolean active, String tenant_account_kind_name, PhoneNumber[] phone_numbers,
                  PhoneNumber[] phone_numbers_attributes, MailingAddress mailing_address, MailingAddress mailing_address_attributes,
                  Address[] addresses, String facility_id, String[] previous_ledger_ids, String[] lead_ids, String[] closed_lead_ids,
                  String[] contact_ids, String[] support_case_ids, String[] event_ids, String[] password_recovery_question_ids) {
        this.id = id;
        this.account_number = account_number;
        this.first_name = first_name;
        this.last_name = last_name;
        this.middle_initial = middle_initial;
        this.email = email;
        this.tax_exempt = tax_exempt;
        this.is_military = is_military;
        this.is_business = is_business;
        this.business_name = business_name;
        this.last_sign_in_at = last_sign_in_at;
        this.title = title;
        this.delinquent = delinquent;
        this.current_ledger_ids = current_ledger_ids;
        this.preferences = preferences;
        this.username = username;
        this.login = login;
        this.password = password;
        this.reset_token = reset_token;
        this.current_password = current_password;
        this.new_password = new_password;
        this.drivers_license_number = drivers_license_number;
        this.drivers_license_state = drivers_license_state;
        this.vehicle_license_plate_number = vehicle_license_plate_number;
        this.vehilce_license_state = vehilce_license_state;
        this.vehicle_description = vehicle_description;
        this.has_tenant_portal_account = has_tenant_portal_account;
        this.created_at = created_at;
        this.gate_24_hour_access = gate_24_hour_access;
        this.active = active;
        this.tenant_account_kind_name = tenant_account_kind_name;
        this.phone_numbers = phone_numbers;
        this.phone_numbers_attributes = phone_numbers_attributes;
        this.mailing_address = mailing_address;
        this.mailing_address_attributes = mailing_address_attributes;
        this.addresses = addresses;
        this.facility_id = facility_id;
        this.previous_ledger_ids = previous_ledger_ids;
        this.lead_ids = lead_ids;
        this.closed_lead_ids = closed_lead_ids;
        this.contact_ids = contact_ids;
        this.support_case_ids = support_case_ids;
        this.event_ids = event_ids;
        this.password_recovery_question_ids = password_recovery_question_ids;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public long getAccount_number() {
        return account_number;
    }

    public void setAccount_number(long account_number) {
        this.account_number = account_number;
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

    public String getMiddle_initial() {
        return middle_initial;
    }

    public void setMiddle_initial(String middle_initial) {
        this.middle_initial = middle_initial;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean isTax_exempt() {
        return tax_exempt;
    }

    public void setTax_exempt(boolean tax_exempt) {
        this.tax_exempt = tax_exempt;
    }

    public boolean isIs_military() {
        return is_military;
    }

    public void setIs_military(boolean is_military) {
        this.is_military = is_military;
    }

    public boolean isIs_business() {
        return is_business;
    }

    public void setIs_business(boolean is_business) {
        this.is_business = is_business;
    }

    public String getBusiness_name() {
        return business_name;
    }

    public void setBusiness_name(String business_name) {
        this.business_name = business_name;
    }

    public String getLast_sign_in_at() {
        return last_sign_in_at;
    }

    public void setLast_sign_in_at(String last_sign_in_at) {
        this.last_sign_in_at = last_sign_in_at;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public boolean isDelinquent() {
        return delinquent;
    }

    public void setDelinquent(boolean delinquent) {
        this.delinquent = delinquent;
    }

    public String[] getCurrent_ledger_ids() {
        return current_ledger_ids;
    }

    public void setCurrent_ledger_ids(String[] current_ledger_ids) {
        this.current_ledger_ids = current_ledger_ids;
    }

    public TenantPreferences getPreferences() {
        return preferences;
    }

    public void setPreferences(TenantPreferences preferences) {
        this.preferences = preferences;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getReset_token() {
        return reset_token;
    }

    public void setReset_token(String reset_token) {
        this.reset_token = reset_token;
    }

    public String getCurrent_password() {
        return current_password;
    }

    public void setCurrent_password(String current_password) {
        this.current_password = current_password;
    }

    public String getNew_password() {
        return new_password;
    }

    public void setNew_password(String new_password) {
        this.new_password = new_password;
    }

    public String getDrivers_license_number() {
        return drivers_license_number;
    }

    public void setDrivers_license_number(String drivers_license_number) {
        this.drivers_license_number = drivers_license_number;
    }

    public String getDrivers_license_state() {
        return drivers_license_state;
    }

    public void setDrivers_license_state(String drivers_license_state) {
        this.drivers_license_state = drivers_license_state;
    }

    public String getVehicle_license_plate_number() {
        return vehicle_license_plate_number;
    }

    public void setVehicle_license_plate_number(String vehicle_license_plate_number) {
        this.vehicle_license_plate_number = vehicle_license_plate_number;
    }

    public String getVehilce_license_state() {
        return vehilce_license_state;
    }

    public void setVehilce_license_state(String vehilce_license_state) {
        this.vehilce_license_state = vehilce_license_state;
    }

    public String getVehicle_description() {
        return vehicle_description;
    }

    public void setVehicle_description(String vehicle_description) {
        this.vehicle_description = vehicle_description;
    }

    public boolean isHas_tenant_portal_account() {
        return has_tenant_portal_account;
    }

    public void setHas_tenant_portal_account(boolean has_tenant_portal_account) {
        this.has_tenant_portal_account = has_tenant_portal_account;
    }

    public String getCreated_at() {
        return created_at;
    }

    public void setCreated_at(String created_at) {
        this.created_at = created_at;
    }

    public boolean isGate_24_hour_access() {
        return gate_24_hour_access;
    }

    public void setGate_24_hour_access(boolean gate_24_hour_access) {
        this.gate_24_hour_access = gate_24_hour_access;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public String getTenant_account_kind_name() {
        return tenant_account_kind_name;
    }

    public void setTenant_account_kind_name(String tenant_account_kind_name) {
        this.tenant_account_kind_name = tenant_account_kind_name;
    }

    public PhoneNumber[] getPhone_numbers() {
        return phone_numbers;
    }

    public void setPhone_numbers(PhoneNumber[] phone_numbers) {
        this.phone_numbers = phone_numbers;
    }

    public PhoneNumber[] getPhone_numbers_attributes() {
        return phone_numbers_attributes;
    }

    public void setPhone_numbers_attributes(PhoneNumber[] phone_numbers_attributes) {
        this.phone_numbers_attributes = phone_numbers_attributes;
    }

    public MailingAddress getMailing_address() {
        return mailing_address;
    }

    public void setMailing_address(MailingAddress mailing_address) {
        this.mailing_address = mailing_address;
    }

    public MailingAddress getMailing_address_attributes() {
        return mailing_address_attributes;
    }

    public void setMailing_address_attributes(MailingAddress mailing_address_attributes) {
        this.mailing_address_attributes = mailing_address_attributes;
    }

    public Address[] getAddresses() {
        return addresses;
    }

    public void setAddresses(Address[] addresses) {
        this.addresses = addresses;
    }

    public String getFacility_id() {
        return facility_id;
    }

    public void setFacility_id(String facility_id) {
        this.facility_id = facility_id;
    }

    public String[] getPrevious_ledger_ids() {
        return previous_ledger_ids;
    }

    public void setPrevious_ledger_ids(String[] previous_ledger_ids) {
        this.previous_ledger_ids = previous_ledger_ids;
    }

    public String[] getLead_ids() {
        return lead_ids;
    }

    public void setLead_ids(String[] lead_ids) {
        this.lead_ids = lead_ids;
    }

    public String[] getClosed_lead_ids() {
        return closed_lead_ids;
    }

    public void setClosed_lead_ids(String[] closed_lead_ids) {
        this.closed_lead_ids = closed_lead_ids;
    }

    public String[] getContact_ids() {
        return contact_ids;
    }

    public void setContact_ids(String[] contact_ids) {
        this.contact_ids = contact_ids;
    }

    public String[] getSupport_case_ids() {
        return support_case_ids;
    }

    public void setSupport_case_ids(String[] support_case_ids) {
        this.support_case_ids = support_case_ids;
    }

    public String[] getEvent_ids() {
        return event_ids;
    }

    public void setEvent_ids(String[] event_ids) {
        this.event_ids = event_ids;
    }

    public String[] getPassword_recovery_question_ids() {
        return password_recovery_question_ids;
    }

    public void setPassword_recovery_question_ids(String[] password_recovery_question_ids) {
        this.password_recovery_question_ids = password_recovery_question_ids;
    }
}
