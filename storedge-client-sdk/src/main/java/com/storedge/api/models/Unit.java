package main.java.com.storedge.api.models;

/**
 * Created by vchadha on 6/8/17.
 */
public class Unit {

    /**
     * Unit id number
     */
    private String id;

    /**
     * Unit name
     */
    private String name;

    /**
     * Unit description
     */
    private String description;

    /**
     * Unit width
     */
    private double width;

    /**
     * Unit length
     */
    private double length;

    /**
     * Unit height
     */
    private double height;

    /**
     * Unit door height
     */
    private double door_height;

    /**
     * Unit door width
     */
    private double door_width;

    /**
     * Unit door type
     */
    private String door_type;

    /**
     * Unit access type
     */
    private String access_type;

    /**
     * Floor number
     */
    private int floor;

    /**
     * Unit size
     */
    private String size;

    /**
     * Unit area
     */
    private double area;

    /**
     * Unit standard rate
     */
    private double standard_rate;

    /**
     * Unit managed rate
     */
    private double managed_rate;

    /**
     * Is unit available for move in
     */
    private boolean available_for_move_in;

    /**
     * Is unit rentable
     */
    private boolean rentable;

    /**
     * Unit status
     */
    private String status;

    /**
     * Unit payment status
     */
    private String payment_status;

    /**
     * Unit current ledger id
     */
    private String current_ledger_id;

    /**
     * Unit current tenant id
     */
    private String current_tenant_id;

    /**
     * Unit combinational lock number
     */
    private String combinational_lock_number;

    /**
     * Unit attribute description
     */
    private String attribute_description;

    /**
     * Is unit deleted
     */
    private boolean deleted;

    /**
     * Array of unit amenities in unit
     */
    private UnitAmenity[] unit_amenities;

    /**
     * Unit type
     */
    private UnitType unit_type;

    /**
     * Unit group id number
     */
    private String unit_group_id;

    /**
     * Default Constructor
     */
    public Unit() {
    }

    /**
     * Parameterized Constructor
     * @param id
     * @param name
     * @param description
     * @param width
     * @param length
     * @param height
     * @param door_height
     * @param door_width
     * @param door_type
     * @param access_type
     * @param floor
     * @param size
     * @param area
     * @param standard_rate
     * @param managed_rate
     * @param available_for_move_in
     * @param rentable
     * @param status
     * @param payment_status
     * @param current_ledger_id
     * @param current_tenant_id
     * @param combinational_lock_number
     * @param attribute_description
     * @param deleted
     * @param unit_amenities
     * @param unit_type
     * @param unit_group_id
     */
    public Unit(String id, String name, String description, double width, double length, double height, double door_height,
                double door_width, String door_type, String access_type, int floor, String size, double area,
                double standard_rate, double managed_rate, boolean available_for_move_in, boolean rentable, String status,
                String payment_status, String current_ledger_id, String current_tenant_id, String combinational_lock_number,
                String attribute_description, boolean deleted, UnitAmenity[] unit_amenities, UnitType unit_type,
                String unit_group_id) {
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
        this.combinational_lock_number = combinational_lock_number;
        this.attribute_description = attribute_description;
        this.deleted = deleted;
        this.unit_amenities = unit_amenities;
        this.unit_type = unit_type;
        this.unit_group_id = unit_group_id;
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

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getDoor_height() {
        return door_height;
    }

    public void setDoor_height(double door_height) {
        this.door_height = door_height;
    }

    public double getDoor_width() {
        return door_width;
    }

    public void setDoor_width(double door_width) {
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

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getStandard_rate() {
        return standard_rate;
    }

    public void setStandard_rate(double standard_rate) {
        this.standard_rate = standard_rate;
    }

    public double getManaged_rate() {
        return managed_rate;
    }

    public void setManaged_rate(double managed_rate) {
        this.managed_rate = managed_rate;
    }

    public boolean isAvailable_for_move_in() {
        return available_for_move_in;
    }

    public void setAvailable_for_move_in(boolean available_for_move_in) {
        this.available_for_move_in = available_for_move_in;
    }

    public boolean isRentable() {
        return rentable;
    }

    public void setRentable(boolean rentable) {
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

    public String getCombinational_lock_number() {
        return combinational_lock_number;
    }

    public void setCombinational_lock_number(String combinational_lock_number) {
        this.combinational_lock_number = combinational_lock_number;
    }

    public String getAttribute_description() {
        return attribute_description;
    }

    public void setAttribute_description(String attribute_description) {
        this.attribute_description = attribute_description;
    }

    public boolean isDeleted() {
        return deleted;
    }

    public void setDeleted(boolean deleted) {
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
}