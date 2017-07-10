package main.java.com.storedge.api.models;

/**
 * Created by vchadha on 6/8/17.
 */
public class Unit {

    private String id;
    private String name;
    private String description;
    private Double width;
    private Double length;
    private Double height;
    private Double door_height;
    private Double door_width;
    private String door_type;
    private String access_type;
    private Integer floor;
    private String size;
    private Double area;
    private Double standard_rate;
    private Double managed_rate;
    private Boolean available_for_move_in;
    private Boolean rentable;
    private String status;
    private String payment_status;
    private String current_ledger_id;
    private String current_tenant_id;
    private String attribute_description;
    private Boolean deleted;
    private UnitAmenity[] unit_amenities;
    private UnitType unit_type;
    private String unit_group_id;

    private String combinational_lock_number;

    /**
     * Default Constructor
     */
    public Unit() {
    }

    public Unit(String id, String name, String description, Double width, Double length, Double height, Double door_height,
                Double door_width, String door_type, String access_type, Integer floor, String size, Double area, Double standard_rate,
                Double managed_rate, Boolean available_for_move_in, Boolean rentable, String status, String payment_status,
                String current_ledger_id, String current_tenant_id, String attribute_description, Boolean deleted, UnitAmenity[] unit_amenities,
                UnitType unit_type, String unit_group_id, String combinational_lock_number) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.width = width;
        this.length = length;
        this.height = height;
        this.door_height = door_height;
        this.door_width = door_width;
        this.door_type = door_type;
        this.access_type = access_type;
        this.floor = floor;
        this.size = size;
        this.area = area;
        this.standard_rate = standard_rate;
        this.managed_rate = managed_rate;
        this.available_for_move_in = available_for_move_in;
        this.rentable = rentable;
        this.status = status;
        this.payment_status = payment_status;
        this.current_ledger_id = current_ledger_id;
        this.current_tenant_id = current_tenant_id;
        this.attribute_description = attribute_description;
        this.deleted = deleted;
        this.unit_amenities = unit_amenities;
        this.unit_type = unit_type;
        this.unit_group_id = unit_group_id;
        this.combinational_lock_number = combinational_lock_number;
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

    public Double getWidth() {
        return width;
    }

    public void setWidth(Double width) {
        this.width = width;
    }

    public Double getLength() {
        return length;
    }

    public void setLength(Double length) {
        this.length = length;
    }

    public Double getHeight() {
        return height;
    }

    public void setHeight(Double height) {
        this.height = height;
    }

    public Double getDoor_height() {
        return door_height;
    }

    public void setDoor_height(Double door_height) {
        this.door_height = door_height;
    }

    public Double getDoor_width() {
        return door_width;
    }

    public void setDoor_width(Double door_width) {
        this.door_width = door_width;
    }

    public String getDoor_type() {
        return door_type;
    }

    public void setDoor_type(String door_type) {
        this.door_type = door_type;
    }

    public String getAccess_type() {
        return access_type;
    }

    public void setAccess_type(String access_type) {
        this.access_type = access_type;
    }

    public Integer getFloor() {
        return floor;
    }

    public void setFloor(Integer floor) {
        this.floor = floor;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public Double getArea() {
        return area;
    }

    public void setArea(Double area) {
        this.area = area;
    }

    public Double getStandard_rate() {
        return standard_rate;
    }

    public void setStandard_rate(Double standard_rate) {
        this.standard_rate = standard_rate;
    }

    public Double getManaged_rate() {
        return managed_rate;
    }

    public void setManaged_rate(Double managed_rate) {
        this.managed_rate = managed_rate;
    }

    public Boolean getAvailable_for_move_in() {
        return available_for_move_in;
    }

    public void setAvailable_for_move_in(Boolean available_for_move_in) {
        this.available_for_move_in = available_for_move_in;
    }

    public Boolean getRentable() {
        return rentable;
    }

    public void setRentable(Boolean rentable) {
        this.rentable = rentable;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getPayment_status() {
        return payment_status;
    }

    public void setPayment_status(String payment_status) {
        this.payment_status = payment_status;
    }

    public String getCurrent_ledger_id() {
        return current_ledger_id;
    }

    public void setCurrent_ledger_id(String current_ledger_id) {
        this.current_ledger_id = current_ledger_id;
    }

    public String getCurrent_tenant_id() {
        return current_tenant_id;
    }

    public void setCurrent_tenant_id(String current_tenant_id) {
        this.current_tenant_id = current_tenant_id;
    }

    public String getAttribute_description() {
        return attribute_description;
    }

    public void setAttribute_description(String attribute_description) {
        this.attribute_description = attribute_description;
    }

    public Boolean getDeleted() {
        return deleted;
    }

    public void setDeleted(Boolean deleted) {
        this.deleted = deleted;
    }

    public UnitAmenity[] getUnit_amenities() {
        return unit_amenities;
    }

    public void setUnit_amenities(UnitAmenity[] unit_amenities) {
        this.unit_amenities = unit_amenities;
    }

    public UnitType getUnit_type() {
        return unit_type;
    }

    public void setUnit_type(UnitType unit_type) {
        this.unit_type = unit_type;
    }

    public String getUnit_group_id() {
        return unit_group_id;
    }

    public void setUnit_group_id(String unit_group_id) {
        this.unit_group_id = unit_group_id;
    }

    public String getCombinational_lock_number() {
        return combinational_lock_number;
    }

    public void setCombinational_lock_number(String combinational_lock_number) {
        this.combinational_lock_number = combinational_lock_number;
    }
}