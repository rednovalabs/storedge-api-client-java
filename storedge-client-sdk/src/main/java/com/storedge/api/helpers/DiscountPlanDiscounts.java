package main.java.com.storedge.api.helpers;

/**
 * Created by vchadha on 7/5/17.
 */
public class DiscountPlanDiscounts {
    private String id;
    private String discount_type;
    private int month_number;
    private double amount;

    public DiscountPlanDiscounts() {
    }

    public DiscountPlanDiscounts(String id, String discount_type, int month_number, double amount) {
        this.id = id;
        this.discount_type = discount_type;
        this.month_number = month_number;
        this.amount = amount;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDiscount_type() {
        return discount_type;
    }

    public void setDiscount_type(String discount_type) {
        this.discount_type = discount_type;
    }

    public int getMonth_number() {
        return month_number;
    }

    public void setMonth_number(int month_number) {
        this.month_number = month_number;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
}
