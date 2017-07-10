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
    private Boolean required_at_move_in;
    private Boolean required_at_transfer;
    private Double amount;
    private String short_description;
    private Boolean show_in_sales_center;
    private Double tax_total;
    private Double total;
    private InvoiceableAmounts[] invoiceable_amounts;

    public InvoiceableItem() {
    }

    public InvoiceableItem(String id, String product_code, String kind, String description, Boolean required_at_move_in,
                           Boolean required_at_transfer, Double amount, String short_description, Boolean show_in_sales_center,
                           Double tax_total, Double total, InvoiceableAmounts[] invoiceable_amounts) {
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

    public Boolean getRequired_at_move_in() {
        return required_at_move_in;
    }

    public void setRequired_at_move_in(Boolean required_at_move_in) {
        this.required_at_move_in = required_at_move_in;
    }

    public Boolean getRequired_at_transfer() {
        return required_at_transfer;
    }

    public void setRequired_at_transfer(Boolean required_at_transfer) {
        this.required_at_transfer = required_at_transfer;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public String getShort_description() {
        return short_description;
    }

    public void setShort_description(String short_description) {
        this.short_description = short_description;
    }

    public Boolean getShow_in_sales_center() {
        return show_in_sales_center;
    }

    public void setShow_in_sales_center(Boolean show_in_sales_center) {
        this.show_in_sales_center = show_in_sales_center;
    }

    public Double getTax_total() {
        return tax_total;
    }

    public void setTax_total(Double tax_total) {
        this.tax_total = tax_total;
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }

    public InvoiceableAmounts[] getInvoiceable_amounts() {
        return invoiceable_amounts;
    }

    public void setInvoiceable_amounts(InvoiceableAmounts[] invoiceable_amounts) {
        this.invoiceable_amounts = invoiceable_amounts;
    }
}
