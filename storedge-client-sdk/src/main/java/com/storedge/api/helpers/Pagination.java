package main.java.com.storedge.api.helpers;

/**
 * Created by vchadha on 7/5/17.
 */
public class Pagination {
    private int current_page;
    private int total_pages;
    private int total_entries;
    private int per_page;
    private int previous_page;
    private int next_page;

    public Pagination(int current_page, int total_pages, int total_entries, int per_page, int previous_page, int next_page) {
        this.current_page = current_page;
        this.total_pages = total_pages;
        this.total_entries = total_entries;
        this.per_page = per_page;
        this.previous_page = previous_page;
        this.next_page = next_page;
    }

    public int getCurrent_page() {
        return current_page;
    }

    public void setCurrent_page(int current_page) {
        this.current_page = current_page;
    }

    public int getTotal_pages() {
        return total_pages;
    }

    public void setTotal_pages(int total_pages) {
        this.total_pages = total_pages;
    }

    public int getTotal_entries() {
        return total_entries;
    }

    public void setTotal_entries(int total_entries) {
        this.total_entries = total_entries;
    }

    public int getPer_page() {
        return per_page;
    }

    public void setPer_page(int per_page) {
        this.per_page = per_page;
    }

    public int getPrevious_page() {
        return previous_page;
    }

    public void setPrevious_page(int previous_page) {
        this.previous_page = previous_page;
    }

    public int getNext_page() {
        return next_page;
    }

    public void setNext_page(int next_page) {
        this.next_page = next_page;
    }
}
