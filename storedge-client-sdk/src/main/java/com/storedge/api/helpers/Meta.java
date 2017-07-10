package main.java.com.storedge.api.helpers;

/**
 * Created by vchadha on 7/5/17.
 */
public class Meta {
    private Pagination pagination;
    private Integer status_code;
    private String status_cat;
    private String status_message;
    private String request_method;
    private Integer error_code;
    private String request_id;

    private String message;

    public Meta(Pagination pagination, int status_code, String status_cat, String status_message, String request_method, int error_code, String request_id) {
        this.pagination = pagination;
        this.status_code = status_code;
        this.status_cat = status_cat;
        this.status_message = status_message;
        this.request_method = request_method;
        this.error_code = error_code;
        this.request_id = request_id;
    }

    public Pagination getPagination() {
        return pagination;
    }

    public void setPagination(Pagination pagination) {
        this.pagination = pagination;
    }

    public int getStatus_code() {
        return status_code;
    }

    public void setStatus_code(int status_code) {
        this.status_code = status_code;
    }

    public String getStatus_cat() {
        return status_cat;
    }

    public void setStatus_cat(String status_cat) {
        this.status_cat = status_cat;
    }

    public String getStatus_message() {
        return status_message;
    }

    public void setStatus_message(String status_message) {
        this.status_message = status_message;
    }

    public String getRequest_method() {
        return request_method;
    }

    public void setRequest_method(String request_method) {
        this.request_method = request_method;
    }

    public int getError_code() {
        return error_code;
    }

    public void setError_code(int error_code) {
        this.error_code = error_code;
    }

    public String getRequest_id() {
        return request_id;
    }

    public void setRequest_id(String request_id) {
        this.request_id = request_id;
    }
}
