package main.java.com.storedge.api.models;

/**
 * Created by vchadha on 7/6/17.
 */
public class UnitGroup {
    private String id;
    private String group_id;
    private String name;
    private int available_units_count;
    private int total_units_count;
    private String size;
    private double price;
    private double standard_rate;
    private int floor;
    private double reduced_price;
    private double occupancy_percent;
    private double area;
    private double length;
    private double width;
    private double height;
    private double due_at_move_in;
    private double due_monthly;
    private String attribute_description;
    private String description;
    private double average_rent;
    private UnitAmenity[] unit_amenities;
    private UnitType unit_type;
    private double[] invoiceable_fees;
    private DiscountPlan[] discount_plans;

    public UnitGroup() {
    }

    public UnitGroup(String id, String group_id, String name, int available_units_count, int total_units_count, String size,
                     double price, double standard_rate, int floor, double reduced_price, double occupancy_percent, double area,
                     double length, double width, double height, double due_at_move_in, double due_monthly, String attribute_description,
                     String description, double average_rent, UnitAmenity[] unit_amenities, UnitType unit_type,
                     double[] invoiceable_fees, DiscountPlan[] discount_plans) {
        this.id = id;
        this.group_id = group_id;
        this.name = name;
        this.available_units_count = available_units_count;
        this.total_units_count = total_units_count;
        this.size = size;
        this.price = price;
        this.standard_rate = standard_rate;
        this.floor = floor;
        this.reduced_price = reduced_price;
        this.occupancy_percent = occupancy_percent;
        this.area = area;
        this.length = length;
        this.width = width;
        this.height = height;
        this.due_at_move_in = due_at_move_in;
        this.due_monthly = due_monthly;
        this.attribute_description = attribute_description;
        this.description = description;
        this.average_rent = average_rent;
        this.unit_amenities = unit_amenities;
        this.unit_type = unit_type;
        this.invoiceable_fees = invoiceable_fees;
        this.discount_plans = discount_plans;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getGroup_id() {
        return group_id;
    }

    public void setGroup_id(String group_id) {
        this.group_id = group_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAvailable_units_count() {
        return available_units_count;
    }

    public void setAvailable_units_count(int available_units_count) {
        this.available_units_count = available_units_count;
    }

    public int getTotal_units_count() {
        return total_units_count;
    }

    public void setTotal_units_count(int total_units_count) {
        this.total_units_count = total_units_count;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getStandard_rate() {
        return standard_rate;
    }

    public void setStandard_rate(double standard_rate) {
        this.standard_rate = standard_rate;
    }

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    public double getReduced_price() {
        return reduced_price;
    }

    public void setReduced_price(double reduced_price) {
        this.reduced_price = reduced_price;
    }

    public double getOccupancy_percent() {
        return occupancy_percent;
    }

    public void setOccupancy_percent(double occupancy_percent) {
        this.occupancy_percent = occupancy_percent;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
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

    public String getAttribute_description() {
        return attribute_description;
    }

    public void setAttribute_description(String attribute_description) {
        this.attribute_description = attribute_description;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getAverage_rent() {
        return average_rent;
    }

    public void setAverage_rent(double average_rent) {
        this.average_rent = average_rent;
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

    public double[] getInvoiceable_fees() {
        return invoiceable_fees;
    }

    public void setInvoiceable_fees(double[] invoiceable_fees) {
        this.invoiceable_fees = invoiceable_fees;
    }

    public DiscountPlan[] getDiscount_plans() {
        return discount_plans;
    }

    public void setDiscount_plans(DiscountPlan[] discount_plans) {
        this.discount_plans = discount_plans;
    }
}
