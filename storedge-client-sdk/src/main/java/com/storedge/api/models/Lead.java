package main.java.com.storedge.api.models;

import main.java.com.storedge.api.helpers.*;


/**
 * Created by vchadha on 7/6/17.
 */
public class Lead {
    private String id;
    private String facility_id;
    private String caller_first_name;
    private String caller_last_name;
    private String confirmation_number;
    private String kind;
    private String size;
    private int floor;
    private double quoted_rate;
    private String desired_move_in_date;
    private String desired_unit_size_and_price;
    private boolean urgent;
    private ExtraDetails extra_details;
    private boolean reservation_fee_required;
    private String next_action_at;
    private boolean closed;
    private String status;
    private String started_at;
    private String created_at;
    private String moved_in_at;
    private String reserved_at;
    private String cancelled_at;
    private String next_lead_action;
    private int next_lead_action_index;
    private String source_name;
    private String tenant_id;
    private String source_id;
    private double reduced_price;
    private double due_at_move_in;
    private double due_monthly;
    private String length_of_stay_id;
    private int reservation_window;
    private boolean within_reservation_window;
    private boolean wait_list;
    private boolean wait_list_available;
    private boolean moving_labor;
    private boolean moving_labor_contacted_already;
    private boolean free_truck;
    private boolean plant_a_tree;
    private boolean bilingual_agent;
    private String facility_time_zone;
    private boolean has_paid_reservation_fee;
    private Tenant tenant;
    private Unit unit;
    private int length_of_stay;
    private SuccessfulPaymentEvent[] successful_payment_events;
    private String caller_phone_number;
    private UnitAmenity[] unit_amenities;
    private CurrentUser current_user;
    private UnitType unit_type;
    private String close_reason;
    private InvoiceableItem[] invoiceable_fees;
    private DiscountPlan[] discount_plans;
    private LeadContents[] lead_contents;
    private UnitGroup unit_group;
    private CreatedBy created_by;
    private String channel_id;
    private String confirmation_email;

    public Lead() {
    }

    public Lead(String id, String facility_id, String caller_first_name, String caller_last_name, String confirmation_number, String kind,
                String size, int floor, double quoted_rate, String desired_move_in_date, String desired_unit_size_and_price, boolean urgent,
                ExtraDetails extra_details, boolean reservation_fee_required, String next_action_at, boolean closed, String status, String started_at,
                String created_at, String moved_in_at, String reserved_at, String cancelled_at, String next_lead_action, int next_lead_action_index,
                String source_name, String tenant_id, String source_id, double reduced_price, double due_at_move_in, double due_monthly,
                String length_of_stay_id, int reservation_window, boolean within_reservation_window, boolean wait_list, boolean wait_list_available,
                boolean moving_labor, boolean moving_labor_contacted_already, boolean free_truck, boolean plant_a_tree, boolean bilingual_agent,
                String facility_time_zone, boolean has_paid_reservation_fee, Tenant tenant, Unit unit, int length_of_stay,
                SuccessfulPaymentEvent[] successful_payment_events, String caller_phone_number, UnitAmenity[] unit_amenities, CurrentUser current_user,
                UnitType unit_type, String close_reason, InvoiceableItem[] invoiceable_fees, DiscountPlan[] discount_plans, LeadContents[] lead_contents,
                UnitGroup unit_group, CreatedBy created_by, String channel_id, String confirmation_email) {
        this.id = id;
        this.facility_id = facility_id;
        this.caller_first_name = caller_first_name;
        this.caller_last_name = caller_last_name;
        this.confirmation_number = confirmation_number;
        this.kind = kind;
        this.size = size;
        this.floor = floor;
        this.quoted_rate = quoted_rate;
        this.desired_move_in_date = desired_move_in_date;
        this.desired_unit_size_and_price = desired_unit_size_and_price;
        this.urgent = urgent;
        this.extra_details = extra_details;
        this.reservation_fee_required = reservation_fee_required;
        this.next_action_at = next_action_at;
        this.closed = closed;
        this.status = status;
        this.started_at = started_at;
        this.created_at = created_at;
        this.moved_in_at = moved_in_at;
        this.reserved_at = reserved_at;
        this.cancelled_at = cancelled_at;
        this.next_lead_action = next_lead_action;
        this.next_lead_action_index = next_lead_action_index;
        this.source_name = source_name;
        this.tenant_id = tenant_id;
        this.source_id = source_id;
        this.reduced_price = reduced_price;
        this.due_at_move_in = due_at_move_in;
        this.due_monthly = due_monthly;
        this.length_of_stay_id = length_of_stay_id;
        this.reservation_window = reservation_window;
        this.within_reservation_window = within_reservation_window;
        this.wait_list = wait_list;
        this.wait_list_available = wait_list_available;
        this.moving_labor = moving_labor;
        this.moving_labor_contacted_already = moving_labor_contacted_already;
        this.free_truck = free_truck;
        this.plant_a_tree = plant_a_tree;
        this.bilingual_agent = bilingual_agent;
        this.facility_time_zone = facility_time_zone;
        this.has_paid_reservation_fee = has_paid_reservation_fee;
        this.tenant = tenant;
        this.unit = unit;
        this.length_of_stay = length_of_stay;
        this.successful_payment_events = successful_payment_events;
        this.caller_phone_number = caller_phone_number;
        this.unit_amenities = unit_amenities;
        this.current_user = current_user;
        this.unit_type = unit_type;
        this.close_reason = close_reason;
        this.invoiceable_fees = invoiceable_fees;
        this.discount_plans = discount_plans;
        this.lead_contents = lead_contents;
        this.unit_group = unit_group;
        this.created_by = created_by;
        this.channel_id = channel_id;
        this.confirmation_email = confirmation_email;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFacility_id() {
        return facility_id;
    }

    public void setFacility_id(String facility_id) {
        this.facility_id = facility_id;
    }

    public String getCaller_first_name() {
        return caller_first_name;
    }

    public void setCaller_first_name(String caller_first_name) {
        this.caller_first_name = caller_first_name;
    }

    public String getCaller_last_name() {
        return caller_last_name;
    }

    public void setCaller_last_name(String caller_last_name) {
        this.caller_last_name = caller_last_name;
    }

    public String getConfirmation_number() {
        return confirmation_number;
    }

    public void setConfirmation_number(String confirmation_number) {
        this.confirmation_number = confirmation_number;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    public double getQuoted_rate() {
        return quoted_rate;
    }

    public void setQuoted_rate(double quoted_rate) {
        this.quoted_rate = quoted_rate;
    }

    public String getDesired_move_in_date() {
        return desired_move_in_date;
    }

    public void setDesired_move_in_date(String desired_move_in_date) {
        this.desired_move_in_date = desired_move_in_date;
    }

    public String getDesired_unit_size_and_price() {
        return desired_unit_size_and_price;
    }

    public void setDesired_unit_size_and_price(String desired_unit_size_and_price) {
        this.desired_unit_size_and_price = desired_unit_size_and_price;
    }

    public boolean isUrgent() {
        return urgent;
    }

    public void setUrgent(boolean urgent) {
        this.urgent = urgent;
    }

    public ExtraDetails getExtra_details() {
        return extra_details;
    }

    public void setExtra_details(ExtraDetails extra_details) {
        this.extra_details = extra_details;
    }

    public boolean isReservation_fee_required() {
        return reservation_fee_required;
    }

    public void setReservation_fee_required(boolean reservation_fee_required) {
        this.reservation_fee_required = reservation_fee_required;
    }

    public String getNext_action_at() {
        return next_action_at;
    }

    public void setNext_action_at(String next_action_at) {
        this.next_action_at = next_action_at;
    }

    public boolean isClosed() {
        return closed;
    }

    public void setClosed(boolean closed) {
        this.closed = closed;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getStarted_at() {
        return started_at;
    }

    public void setStarted_at(String started_at) {
        this.started_at = started_at;
    }

    public String getCreated_at() {
        return created_at;
    }

    public void setCreated_at(String created_at) {
        this.created_at = created_at;
    }

    public String getMoved_in_at() {
        return moved_in_at;
    }

    public void setMoved_in_at(String moved_in_at) {
        this.moved_in_at = moved_in_at;
    }

    public String getReserved_at() {
        return reserved_at;
    }

    public void setReserved_at(String reserved_at) {
        this.reserved_at = reserved_at;
    }

    public String getCancelled_at() {
        return cancelled_at;
    }

    public void setCancelled_at(String cancelled_at) {
        this.cancelled_at = cancelled_at;
    }

    public String getNext_lead_action() {
        return next_lead_action;
    }

    public void setNext_lead_action(String next_lead_action) {
        this.next_lead_action = next_lead_action;
    }

    public int getNext_lead_action_index() {
        return next_lead_action_index;
    }

    public void setNext_lead_action_index(int next_lead_action_index) {
        this.next_lead_action_index = next_lead_action_index;
    }

    public String getSource_name() {
        return source_name;
    }

    public void setSource_name(String source_name) {
        this.source_name = source_name;
    }

    public String getTenant_id() {
        return tenant_id;
    }

    public void setTenant_id(String tenant_id) {
        this.tenant_id = tenant_id;
    }

    public String getSource_id() {
        return source_id;
    }

    public void setSource_id(String source_id) {
        this.source_id = source_id;
    }

    public double getReduced_price() {
        return reduced_price;
    }

    public void setReduced_price(double reduced_price) {
        this.reduced_price = reduced_price;
    }

    public double getDue_at_move_in() {
        return due_at_move_in;
    }

    public void setDue_at_move_in(double due_at_move_in) {
        this.due_at_move_in = due_at_move_in;
    }

    public double getDue_monthly() {
        return due_monthly;
    }

    public void setDue_monthly(double due_monthly) {
        this.due_monthly = due_monthly;
    }

    public String getLength_of_stay_id() {
        return length_of_stay_id;
    }

    public void setLength_of_stay_id(String length_of_stay_id) {
        this.length_of_stay_id = length_of_stay_id;
    }

    public int getReservation_window() {
        return reservation_window;
    }

    public void setReservation_window(int reservation_window) {
        this.reservation_window = reservation_window;
    }

    public boolean isWithin_reservation_window() {
        return within_reservation_window;
    }

    public void setWithin_reservation_window(boolean within_reservation_window) {
        this.within_reservation_window = within_reservation_window;
    }

    public boolean isWait_list() {
        return wait_list;
    }

    public void setWait_list(boolean wait_list) {
        this.wait_list = wait_list;
    }

    public boolean isWait_list_available() {
        return wait_list_available;
    }

    public void setWait_list_available(boolean wait_list_available) {
        this.wait_list_available = wait_list_available;
    }

    public boolean isMoving_labor() {
        return moving_labor;
    }

    public void setMoving_labor(boolean moving_labor) {
        this.moving_labor = moving_labor;
    }

    public boolean isMoving_labor_contacted_already() {
        return moving_labor_contacted_already;
    }

    public void setMoving_labor_contacted_already(boolean moving_labor_contacted_already) {
        this.moving_labor_contacted_already = moving_labor_contacted_already;
    }

    public boolean isFree_truck() {
        return free_truck;
    }

    public void setFree_truck(boolean free_truck) {
        this.free_truck = free_truck;
    }

    public boolean isPlant_a_tree() {
        return plant_a_tree;
    }

    public void setPlant_a_tree(boolean plant_a_tree) {
        this.plant_a_tree = plant_a_tree;
    }

    public boolean isBilingual_agent() {
        return bilingual_agent;
    }

    public void setBilingual_agent(boolean bilingual_agent) {
        this.bilingual_agent = bilingual_agent;
    }

    public String getFacility_time_zone() {
        return facility_time_zone;
    }

    public void setFacility_time_zone(String facility_time_zone) {
        this.facility_time_zone = facility_time_zone;
    }

    public boolean isHas_paid_reservation_fee() {
        return has_paid_reservation_fee;
    }

    public void setHas_paid_reservation_fee(boolean has_paid_reservation_fee) {
        this.has_paid_reservation_fee = has_paid_reservation_fee;
    }

    public Tenant getTenant() {
        return tenant;
    }

    public void setTenant(Tenant tenant) {
        this.tenant = tenant;
    }

    public Unit getUnit() {
        return unit;
    }

    public void setUnit(Unit unit) {
        this.unit = unit;
    }

    public int getLength_of_stay() {
        return length_of_stay;
    }

    public void setLength_of_stay(int length_of_stay) {
        this.length_of_stay = length_of_stay;
    }

    public SuccessfulPaymentEvent[] getSuccessful_payment_events() {
        return successful_payment_events;
    }

    public void setSuccessful_payment_events(SuccessfulPaymentEvent[] successful_payment_events) {
        this.successful_payment_events = successful_payment_events;
    }

    public String getCaller_phone_number() {
        return caller_phone_number;
    }

    public void setCaller_phone_number(String caller_phone_number) {
        this.caller_phone_number = caller_phone_number;
    }

    public UnitAmenity[] getUnit_amenities() {
        return unit_amenities;
    }

    public void setUnit_amenities(UnitAmenity[] unit_amenities) {
        this.unit_amenities = unit_amenities;
    }

    public CurrentUser getCurrent_user() {
        return current_user;
    }

    public void setCurrent_user(CurrentUser current_user) {
        this.current_user = current_user;
    }

    public UnitType getUnit_type() {
        return unit_type;
    }

    public void setUnit_type(UnitType unit_type) {
        this.unit_type = unit_type;
    }

    public String getClose_reason() {
        return close_reason;
    }

    public void setClose_reason(String close_reason) {
        this.close_reason = close_reason;
    }

    public InvoiceableItem[] getInvoiceable_fees() {
        return invoiceable_fees;
    }

    public void setInvoiceable_fees(InvoiceableItem[] invoiceable_fees) {
        this.invoiceable_fees = invoiceable_fees;
    }

    public DiscountPlan[] getDiscount_plans() {
        return discount_plans;
    }

    public void setDiscount_plans(DiscountPlan[] discount_plans) {
        this.discount_plans = discount_plans;
    }

    public LeadContents[] getLead_contents() {
        return lead_contents;
    }

    public void setLead_contents(LeadContents[] lead_contents) {
        this.lead_contents = lead_contents;
    }

    public UnitGroup getUnit_group() {
        return unit_group;
    }

    public void setUnit_group(UnitGroup unit_group) {
        this.unit_group = unit_group;
    }

    public CreatedBy getCreated_by() {
        return created_by;
    }

    public void setCreated_by(CreatedBy created_by) {
        this.created_by = created_by;
    }

    public String getChannel_id() {
        return channel_id;
    }

    public void setChannel_id(String channel_id) {
        this.channel_id = channel_id;
    }

    public String getConfirmation_email() {
        return confirmation_email;
    }

    public void setConfirmation_email(String confirmation_email) {
        this.confirmation_email = confirmation_email;
    }
}
