package main.java.com.storedge.api.models;

/**
 * Created by vchadha on 6/8/17.
 */
public class UnitAmenity {

    /**
     * String representing id number of unit amenity
     */
    private String id;

    /**
     * Name of unit amenity
     */
    private String name;

    /**
     * Short code for unit amenity
     */
    private String short_code;

    /**
     * Boolean value for show in sales center filter dropdown
     */
    private Boolean show_in_sales_center_filter_dropdown;

    /**
     * Default Constructor
     */
    public UnitAmenity() {
    }

    /**
     * Parameterized Constructor
     * @param id
     * @param name
     * @param short_code
     * @param show_in_sales_center_filter_dropdown
     */
    public UnitAmenity(String id, String name, String short_code, Boolean show_in_sales_center_filter_dropdown) {
        this.id = id;
        this.name = name;
        this.short_code = short_code;
        this.show_in_sales_center_filter_dropdown = show_in_sales_center_filter_dropdown;
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

    public String getShort_code() {
        return short_code;
    }

    public void setShort_code(String short_code) {
        this.short_code = short_code;
    }

    public Boolean getShow_in_sales_center_filter_dropdown() {
        return show_in_sales_center_filter_dropdown;
    }

    public void setShow_in_sales_center_filter_dropdown(Boolean show_in_sales_center_filter_dropdown) {
        this.show_in_sales_center_filter_dropdown = show_in_sales_center_filter_dropdown;
    }
}
