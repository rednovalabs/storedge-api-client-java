package main.java.com.storedge.api.helpers;

/**
 * Created by vchadha on 7/5/17.
 */
public class CurrentUser {
    private String id;
    private String username;
    private String first_name;
    private String last_name;
    private String name;
    private String initials;
    private String email;

    public CurrentUser() {
    }

    public CurrentUser(String id, String username, String first_name, String last_name,
                       String name, String initials, String email) {
        this.id = id;
        this.username = username;
        this.first_name = first_name;
        this.last_name = last_name;
        this.name = name;
        this.initials = initials;
        this.email = email;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getInitials() {
        return initials;
    }

    public void setInitials(String initials) {
        this.initials = initials;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
