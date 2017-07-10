package main.java.com.storedge.api.helpers;

/**
 * Created by vchadha on 6/20/17.
 */
public class PhoneNumber {
    private String id;
    private Boolean primary;
    private String source;
    private String number;
    private String formatted_number;
    private String extension;
    private String label;
    private String unformatted_number;

    public PhoneNumber() {
    }

    public PhoneNumber(String id, boolean primary, String source, String number, String formatted_number,
                       String extension, String label, String unformatted_number) {
        this.id = id;
        this.primary = primary;
        this.source = source;
        this.number = number;
        this.formatted_number = formatted_number;
        this.extension = extension;
        this.label = label;
        this.unformatted_number = unformatted_number;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public boolean isPrimary() {
        return primary;
    }

    public void setPrimary(boolean primary) {
        this.primary = primary;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getFormatted_number() {
        return formatted_number;
    }

    public void setFormatted_number(String formatted_number) {
        this.formatted_number = formatted_number;
    }

    public String getExtension() {
        return extension;
    }

    public void setExtension(String extension) {
        this.extension = extension;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public String getUnformatted_number() {
        return unformatted_number;
    }

    public void setUnformatted_number(String unformatted_number) {
        this.unformatted_number = unformatted_number;
    }
}
