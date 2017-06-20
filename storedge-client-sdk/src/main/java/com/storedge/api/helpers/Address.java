package main.java.com.storedge.api.helpers;

/**
 * Created by rnlintern1 on 6/20/17.
 */
public class Address {
    private String id;
    private String address1;
    private String address2;
    private String city;
    private String state;
    private String postal;
    private String country;
    private String full_address;
    private double latitude;
    private double longitude;
    private String time_zone_id;
    private String time_zone_offset;
    private boolean invalid_data;
    private String label;

    public Address() {
    }

    public Address(String address1, String address2, String city, String state, String postal, String country, String full_address,
                   double latitude, double longitude, String time_zone_id, String time_zone_offset, boolean invalid_data, String label) {
        this.address1 = address1;
        this.address2 = address2;
        this.city = city;
        this.state = state;
        this.postal = postal;
        this.country = country;
        this.full_address = full_address;
        this.latitude = latitude;
        this.longitude = longitude;
        this.time_zone_id = time_zone_id;
        this.time_zone_offset = time_zone_offset;
        this.invalid_data = invalid_data;
        this.label = label;
    }

    public String getAddress1() {
        return address1;
    }

    public void setAddress1(String address1) {
        this.address1 = address1;
    }

    public String getAddress2() {
        return address2;
    }

    public void setAddress2(String address2) {
        this.address2 = address2;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getPostal() {
        return postal;
    }

    public void setPostal(String postal) {
        this.postal = postal;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getFull_address() {
        return full_address;
    }

    public void setFull_address(String full_address) {
        this.full_address = full_address;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public String getTime_zone_id() {
        return time_zone_id;
    }

    public void setTime_zone_id(String time_zone_id) {
        this.time_zone_id = time_zone_id;
    }

    public String getTime_zone_offset() {
        return time_zone_offset;
    }

    public void setTime_zone_offset(String time_zone_offset) {
        this.time_zone_offset = time_zone_offset;
    }

    public boolean isInvalid_data() {
        return invalid_data;
    }

    public void setInvalid_data(boolean invalid_data) {
        this.invalid_data = invalid_data;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }
}
