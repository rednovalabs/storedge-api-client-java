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
    private boolean deleted;

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
    public UnitType(String id, String name, boolean deleted, String internal_account_code, String code_and_description) {
        this.id = id;
        this.name = name;
        this.deleted = deleted;
        this.internal_account_code = internal_account_code;
        this.code_and_description = code_and_description;
    }

    /**
     * Getter for id number
     * @return id number (String)
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
     * Getter for name
     * @return unit type name
     */
    public String getName() {
        return name;
    }

    /**
     * Setter for unit type name
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Getter for deleted
     * @return deleted
     */
    public boolean isDeleted() {
        return deleted;
    }

    /**
     * Setter for deleted
     * @param deleted
     */
    public void setDeleted(boolean deleted) {
        this.deleted = deleted;
    }

    /**
     * Getter for internal account code
     * @return internal account code (String)
     */
    public String getInternal_account_code() {
        return internal_account_code;
    }

    /**
     * Setter for internal account code
     * @param internal_account_code
     */
    public void setInternal_account_code(String internal_account_code) {
        this.internal_account_code = internal_account_code;
    }

    /**
     * Getter for code and description
     * @return
     */
    public String getCode_and_description() {
        return code_and_description;
    }

    /**
     * Setter for code and description
     * @param code_and_description
     */
    public void setCode_and_description(String code_and_description) {
        this.code_and_description = code_and_description;
    }
}
