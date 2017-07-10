package main.java.com.storedge.api.helpers;

/**
 * Created by vchadha on 7/5/17.
 */
public class LeadContents {
    private String id;
    private String name;
    private String company_id;
    private Boolean deleted;
    private String deleted_on;
    private String deleted_by_id;
    private String created_at;
    private String updated_at;

    public LeadContents() {
    }

    public LeadContents(String id, String name, String company_id, boolean deleted, String deleted_on,
                        String deleted_by_id, String created_at, String updated_at) {
        this.id = id;
        this.name = name;
        this.company_id = company_id;
        this.deleted = deleted;
        this.deleted_on = deleted_on;
        this.deleted_by_id = deleted_by_id;
        this.created_at = created_at;
        this.updated_at = updated_at;
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

    public String getCompany_id() {
        return company_id;
    }

    public void setCompany_id(String company_id) {
        this.company_id = company_id;
    }

    public boolean isDeleted() {
        return deleted;
    }

    public void setDeleted(boolean deleted) {
        this.deleted = deleted;
    }

    public String getDeleted_on() {
        return deleted_on;
    }

    public void setDeleted_on(String deleted_on) {
        this.deleted_on = deleted_on;
    }

    public String getDeleted_by_id() {
        return deleted_by_id;
    }

    public void setDeleted_by_id(String deleted_by_id) {
        this.deleted_by_id = deleted_by_id;
    }

    public String getCreated_at() {
        return created_at;
    }

    public void setCreated_at(String created_at) {
        this.created_at = created_at;
    }

    public String getUpdated_at() {
        return updated_at;
    }

    public void setUpdated_at(String updated_at) {
        this.updated_at = updated_at;
    }
}
