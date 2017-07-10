package main.java.com.storedge.api.models;

/**
 * Created by vchadha on 6/8/17.
 */
public class UnitType {

    /**
     * Id number for unit type
     */
    private String id;

    /**
     * Name of unit type
     */
    private String name;

    /**
     * Has unit type been deleted
     */
    private Boolean deleted;

    /**
     * Internal account code number
     */
    private String internal_account_code;

    /**
     * Code and description
     */
    private String code_and_description;

    /**
     * Default constructor
     */
    public UnitType() {
    }

    /**
     * Parameterized Constructor
     * @param id
     * @param name
     * @param deleted
     * @param internal_account_code
     * @param code_and_description
     */
    public UnitType(String id, String name, Boolean deleted, String internal_account_code, String code_and_description) {
        this.id = id;
        this.name = name;
        this.deleted = deleted;
        this.internal_account_code = internal_account_code;
        this.code_and_description = code_and_description;
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

    public Boolean getDeleted() {
        return deleted;
    }

    public void setDeleted(Boolean deleted) {
        this.deleted = deleted;
    }

    public String getInternal_account_code() {
        return internal_account_code;
    }

    public void setInternal_account_code(String internal_account_code) {
        this.internal_account_code = internal_account_code;
    }

    public String getCode_and_description() {
        return code_and_description;
    }

    public void setCode_and_description(String code_and_description) {
        this.code_and_description = code_and_description;
    }
}
