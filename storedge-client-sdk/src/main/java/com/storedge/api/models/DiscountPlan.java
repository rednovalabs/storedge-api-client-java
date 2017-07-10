package main.java.com.storedge.api.models;

import main.java.com.storedge.api.helpers.DiscountPlanDiscounts;

/**
 * Created by vchadha on 7/6/17.
 */
public class DiscountPlan {
    private String id;
    private String name;
    private String description;
    private String availability_text;
    private String kind;
    private Boolean min_occupancy_required;
    private Integer min_occupancy_months;
    private Boolean prepay_required;
    private Integer prepay_months;
    private String start_date;
    private String end_date;
    private Boolean auto_apply;
    private String promotion_type;
    private Boolean deleted;
    private Boolean turned_on;
    private Boolean available_for_all_facilities;
    private String round_to_nearest;
    private Boolean hide_from_website;
    private Boolean move_in_only;
    private String tenant_account_kind_id;
    private Boolean existing_tenant_only;
    private String priority;
    private DiscountPlanDiscounts[] discount_plan_discounts;
    private DiscountPlanControls[] discount_plan_controls;
    private String always_discount_plan_discount_id;
    private String[] facility_ids;

    public DiscountPlan() {
    }

    public DiscountPlan(String id, String name, String description, String availability_text, String kind, Boolean min_occupancy_required,
                        Integer min_occupancy_months, Boolean prepay_required, Integer prepay_months, String start_date, String end_date,
                        Boolean auto_apply, String promotion_type, Boolean deleted, Boolean turned_on, Boolean available_for_all_facilities,
                        String round_to_nearest, Boolean hide_from_website, Boolean move_in_only, String tenant_account_kind_id, Boolean existing_tenant_only,
                        String priority, DiscountPlanDiscounts[] discount_plan_discounts, DiscountPlanControls[] discount_plan_controls,
                        String always_discount_plan_discount_id, String[] facility_ids) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.availability_text = availability_text;
        this.kind = kind;
        this.min_occupancy_required = min_occupancy_required;
        this.min_occupancy_months = min_occupancy_months;
        this.prepay_required = prepay_required;
        this.prepay_months = prepay_months;
        this.start_date = start_date;
        this.end_date = end_date;
        this.auto_apply = auto_apply;
        this.promotion_type = promotion_type;
        this.deleted = deleted;
        this.turned_on = turned_on;
        this.available_for_all_facilities = available_for_all_facilities;
        this.round_to_nearest = round_to_nearest;
        this.hide_from_website = hide_from_website;
        this.move_in_only = move_in_only;
        this.tenant_account_kind_id = tenant_account_kind_id;
        this.existing_tenant_only = existing_tenant_only;
        this.priority = priority;
        this.discount_plan_discounts = discount_plan_discounts;
        this.discount_plan_controls = discount_plan_controls;
        this.always_discount_plan_discount_id = always_discount_plan_discount_id;
        this.facility_ids = facility_ids;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getAvailability_text() {
        return availability_text;
    }

    public void setAvailability_text(String availability_text) {
        this.availability_text = availability_text;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public Boolean getMin_occupancy_required() {
        return min_occupancy_required;
    }

    public void setMin_occupancy_required(Boolean min_occupancy_required) {
        this.min_occupancy_required = min_occupancy_required;
    }

    public Integer getMin_occupancy_months() {
        return min_occupancy_months;
    }

    public void setMin_occupancy_months(Integer min_occupancy_months) {
        this.min_occupancy_months = min_occupancy_months;
    }

    public Boolean getPrepay_required() {
        return prepay_required;
    }

    public void setPrepay_required(Boolean prepay_required) {
        this.prepay_required = prepay_required;
    }

    public Integer getPrepay_months() {
        return prepay_months;
    }

    public void setPrepay_months(Integer prepay_months) {
        this.prepay_months = prepay_months;
    }

    public String getStart_date() {
        return start_date;
    }

    public void setStart_date(String start_date) {
        this.start_date = start_date;
    }

    public String getEnd_date() {
        return end_date;
    }

    public void setEnd_date(String end_date) {
        this.end_date = end_date;
    }

    public Boolean getAuto_apply() {
        return auto_apply;
    }

    public void setAuto_apply(Boolean auto_apply) {
        this.auto_apply = auto_apply;
    }

    public String getPromotion_type() {
        return promotion_type;
    }

    public void setPromotion_type(String promotion_type) {
        this.promotion_type = promotion_type;
    }

    public Boolean getDeleted() {
        return deleted;
    }

    public void setDeleted(Boolean deleted) {
        this.deleted = deleted;
    }

    public Boolean getTurned_on() {
        return turned_on;
    }

    public void setTurned_on(Boolean turned_on) {
        this.turned_on = turned_on;
    }

    public Boolean getAvailable_for_all_facilities() {
        return available_for_all_facilities;
    }

    public void setAvailable_for_all_facilities(Boolean available_for_all_facilities) {
        this.available_for_all_facilities = available_for_all_facilities;
    }

    public String getRound_to_nearest() {
        return round_to_nearest;
    }

    public void setRound_to_nearest(String round_to_nearest) {
        this.round_to_nearest = round_to_nearest;
    }

    public Boolean getHide_from_website() {
        return hide_from_website;
    }

    public void setHide_from_website(Boolean hide_from_website) {
        this.hide_from_website = hide_from_website;
    }

    public Boolean getMove_in_only() {
        return move_in_only;
    }

    public void setMove_in_only(Boolean move_in_only) {
        this.move_in_only = move_in_only;
    }

    public String getTenant_account_kind_id() {
        return tenant_account_kind_id;
    }

    public void setTenant_account_kind_id(String tenant_account_kind_id) {
        this.tenant_account_kind_id = tenant_account_kind_id;
    }

    public Boolean getExisting_tenant_only() {
        return existing_tenant_only;
    }

    public void setExisting_tenant_only(Boolean existing_tenant_only) {
        this.existing_tenant_only = existing_tenant_only;
    }

    public String getPriority() {
        return priority;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }

    public DiscountPlanDiscounts[] getDiscount_plan_discounts() {
        return discount_plan_discounts;
    }

    public void setDiscount_plan_discounts(DiscountPlanDiscounts[] discount_plan_discounts) {
        this.discount_plan_discounts = discount_plan_discounts;
    }

    public DiscountPlanControls[] getDiscount_plan_controls() {
        return discount_plan_controls;
    }

    public void setDiscount_plan_controls(DiscountPlanControls[] discount_plan_controls) {
        this.discount_plan_controls = discount_plan_controls;
    }

    public String getAlways_discount_plan_discount_id() {
        return always_discount_plan_discount_id;
    }

    public void setAlways_discount_plan_discount_id(String always_discount_plan_discount_id) {
        this.always_discount_plan_discount_id = always_discount_plan_discount_id;
    }

    public String[] getFacility_ids() {
        return facility_ids;
    }

    public void setFacility_ids(String[] facility_ids) {
        this.facility_ids = facility_ids;
    }
}
