package main.java.com.storedge.api.helpers;

import main.java.com.storedge.api.models.PaymentMethod;

/**
 * Created by vchadha on 7/5/17.
 */
public class SuccessfulPaymentEvent {
    private String id;
    private double amount;
    private boolean success;
    private String date;
    private PaymentMethod payment_method;

    public SuccessfulPaymentEvent() {
    }

    public SuccessfulPaymentEvent(String id, double amount, boolean success, String date, PaymentMethod payment_method) {
        this.id = id;
        this.amount = amount;
        this.success = success;
        this.date = date;
        this.payment_method = payment_method;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public PaymentMethod getPayment_method() {
        return payment_method;
    }

    public void setPayment_method(PaymentMethod payment_method) {
        this.payment_method = payment_method;
    }
}
