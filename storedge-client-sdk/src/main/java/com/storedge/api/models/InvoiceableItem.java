package main.java.com.storedge.api.models;

import main.java.com.storedge.api.helpers.InvoiceableAmounts;

/**
 * Created by vchadha on 7/6/17.
 */
public class InvoiceableItem {
    private String id;
    private String product_code;
    private String kind;
    private String description;
    private boolean required_at_move_in;
    private boolean required_at_transfer;
    private double amount;
    private String short_description;
    private boolean show_in_sales_center;
    private double tax_total;
    private double total;
    private InvoiceableAmounts[] invoiceable_amounts;

    public InvoiceableItem() {
    }

    public InvoiceableItem(String id, String product_code, String kind, String description, boolean required_at_move_in,
                           boolean required_at_transfer, double amount, String short_description, boolean show_in_sales_center,
                           double tax_total, double total, InvoiceableAmounts[] invoiceable_amounts) {
        this.id = id;
        this.product_code = product_code;
        this.kind = kind;
        this.description = description;
        this.required_at_move_in = required_at_move_in;
        this.required_at_transfer = required_at_transfer;
        this.amount = amount;
        this.short_description = short_description;
        this.show_in_sales_center = show_in_sales_center;
        this.tax_total = tax_total;
        this.total = total;
        this.invoiceable_amounts = invoiceable_amounts;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getProduct_code() {
        return product_code;
    }

    public void setProduct_code(String product_code) {
        this.product_code = product_code;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isRequired_at_move_in() {
        return required_at_move_in;
    }

    public void setRequired_at_move_in(boolean required_at_move_in) {
        this.required_at_move_in = required_at_move_in;
    }

    public boolean isRequired_at_transfer() {
        return required_at_transfer;
    }

    public void setRequired_at_transfer(boolean required_at_transfer) {
        this.required_at_transfer = required_at_transfer;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getShort_description() {
        return short_description;
    }

    public void setShort_description(String short_description) {
        this.short_description = short_description;
    }

    public boolean isShow_in_sales_center() {
        return show_in_sales_center;
    }

    public void setShow_in_sales_center(boolean show_in_sales_center) {
        this.show_in_sales_center = show_in_sales_center;
    }

    public double getTax_total() {
        return tax_total;
    }

    public void setTax_total(double tax_total) {
        this.tax_total = tax_total;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public InvoiceableAmounts[] getInvoiceable_amounts() {
        return invoiceable_amounts;
    }

    public void setInvoiceable_amounts(InvoiceableAmounts[] invoiceable_amounts) {
        this.invoiceable_amounts = invoiceable_amounts;
    }
}
