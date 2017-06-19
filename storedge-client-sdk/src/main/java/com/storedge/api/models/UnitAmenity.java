package main.java.com.storedge.api.models;

/**
 * Created by rnlintern1 on 6/8/17.
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
    private boolean show_in_sales_center_filter_dropdown;

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
    public UnitAmenity(String id, String name, String short_code, boolean show_in_sales_center_filter_dropdown) {
        this.id = id;
        this.name = name;
        this.short_code = short_code;
        this.show_in_sales_center_filter_dropdown = show_in_sales_center_filter_dropdown;
    }

    /**
     * Getter for id number (String)
     * @return
     */
    public String getId() {
        return id;
    }

    /**
     * Setter for id number
     * @param id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * Getter for unit amenity name
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     * Setter for unit amenity name
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Getter for short code
     * @return
     */
    public String getShort_code() {
        return short_code;
    }

    /**
     * Setter for short code
     * @param short_code
     */
    public void setShort_code(String short_code) {
        this.short_code = short_code;
    }

    /**
     * Getter for boolean show in sales center filter dropdown
     * @return
     */
    public boolean isShow_in_sales_center_filter_dropdown() {
        return show_in_sales_center_filter_dropdown;
    }

    /**
     * Setter for show in sales center filter dropdown
     * @param show_in_sales_center_filter_dropdown
     */
    public void setShow_in_sales_center_filter_dropdown(boolean show_in_sales_center_filter_dropdown) {
        this.show_in_sales_center_filter_dropdown = show_in_sales_center_filter_dropdown;
    }
}
