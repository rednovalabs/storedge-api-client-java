package main.java.com.storedge.api.models;

/**
 * Created by vchadha on 7/6/17.
 */
public class DiscountPlanControls {
    private String id;
    private String kind;
    private double min_value;
    private double max_value;
    private boolean deleted;
    private String deleted_on;
    private String requirements_text;
    private int applicable_discount_plans_count;
    private String[] unit_amenity_ids;
    private String[] discount_plan_ids;
    private UnitType unit_type;

    public DiscountPlanControls() {
    }

    public DiscountPlanControls(String id, String kind, double min_value, double max_value, boolean deleted,
                                String deleted_on, String requirements_text, int applicable_discount_plans_count,
                                String[] unit_amenity_ids, String[] discount_plan_ids, UnitType unit_type) {
        this.id = id;
        this.kind = kind;
        this.min_value = min_value;
        this.max_value = max_value;
        this.deleted = deleted;
        this.deleted_on = deleted_on;
        this.requirements_text = requirements_text;
        this.applicable_discount_plans_count = applicable_discount_plans_count;
        this.unit_amenity_ids = unit_amenity_ids;
        this.discount_plan_ids = discount_plan_ids;
        this.unit_type = unit_type;
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

    public double getMin_value() {
        return min_value;
    }

    public void setMin_value(double min_value) {
        this.min_value = min_value;
    }

    public double getMax_value() {
        return max_value;
    }

    public void setMax_value(double max_value) {
        this.max_value = max_value;
    }

    public boolean isDeleted() {
        return deleted;
    }

    public void setDeleted(boolean deleted) {
        this.deleted = deleted;
    }

    public String getDeleted_on() {
        return deleted_on;
    }

    public void setDeleted_on(String deleted_on) {
        this.deleted_on = deleted_on;
    }

    public String getRequirements_text() {
        return requirements_text;
    }

    public void setRequirements_text(String requirements_text) {
        this.requirements_text = requirements_text;
    }

    public int getApplicable_discount_plans_count() {
        return applicable_discount_plans_count;
    }

    public void setApplicable_discount_plans_count(int applicable_discount_plans_count) {
        this.applicable_discount_plans_count = applicable_discount_plans_count;
    }

    public String[] getUnit_amenity_ids() {
        return unit_amenity_ids;
    }

    public void setUnit_amenity_ids(String[] unit_amenity_ids) {
        this.unit_amenity_ids = unit_amenity_ids;
    }

    public String[] getDiscount_plan_ids() {
        return discount_plan_ids;
    }

    public void setDiscount_plan_ids(String[] discount_plan_ids) {
        this.discount_plan_ids = discount_plan_ids;
    }

    public UnitType getUnit_type() {
        return unit_type;
    }

    public void setUnit_type(UnitType unit_type) {
        this.unit_type = unit_type;
    }
}
