package main.java.com.storedge.api.helpers;

/**
 * Created by vchadha on 7/7/17.
 */
public class CloseReason {
    private String id;
    private String reason;
    private String kind;

    public CloseReason() {
    }

    public CloseReason(String id, String reason, String kind) {
        this.id = id;
        this.reason = reason;
        this.kind = kind;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }
}
