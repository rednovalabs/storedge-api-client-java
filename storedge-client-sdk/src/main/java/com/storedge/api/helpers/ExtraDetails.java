package main.java.com.storedge.api.helpers;

/**
 * Created by vchadha on 7/5/17.
 */
public class ExtraDetails {
    private boolean bilingual_agent;
    private boolean free_truck;
    private boolean moving_labor;
    private boolean moving_labor_contacted_already;
    private boolean plant_a_tree;
    private String call_source;
    private String dnis;
    private String dialogtech_session_id;
    private String call_label;
    private String adobe_id;
    private String user_experience;

    public ExtraDetails() {
    }

    public ExtraDetails(boolean bilingual_agent, boolean free_truck, boolean moving_labor,
                        boolean moving_labor_contacted_already, boolean plant_a_tree, String call_source,
                        String dnis, String dialogtech_session_id, String call_label, String adobe_id, String user_experience) {
        this.bilingual_agent = bilingual_agent;
        this.free_truck = free_truck;
        this.moving_labor = moving_labor;
        this.moving_labor_contacted_already = moving_labor_contacted_already;
        this.plant_a_tree = plant_a_tree;
        this.call_source = call_source;
        this.dnis = dnis;
        this.dialogtech_session_id = dialogtech_session_id;
        this.call_label = call_label;
        this.adobe_id = adobe_id;
        this.user_experience = user_experience;
    }

    public boolean isBilingual_agent() {
        return bilingual_agent;
    }

    public void setBilingual_agent(boolean bilingual_agent) {
        this.bilingual_agent = bilingual_agent;
    }

    public boolean isFree_truck() {
        return free_truck;
    }

    public void setFree_truck(boolean free_truck) {
        this.free_truck = free_truck;
    }

    public boolean isMoving_labor() {
        return moving_labor;
    }

    public void setMoving_labor(boolean moving_labor) {
        this.moving_labor = moving_labor;
    }

    public boolean isMoving_labor_contacted_already() {
        return moving_labor_contacted_already;
    }

    public void setMoving_labor_contacted_already(boolean moving_labor_contacted_already) {
        this.moving_labor_contacted_already = moving_labor_contacted_already;
    }

    public boolean isPlant_a_tree() {
        return plant_a_tree;
    }

    public void setPlant_a_tree(boolean plant_a_tree) {
        this.plant_a_tree = plant_a_tree;
    }

    public String getCall_source() {
        return call_source;
    }

    public void setCall_source(String call_source) {
        this.call_source = call_source;
    }

    public String getDnis() {
        return dnis;
    }

    public void setDnis(String dnis) {
        this.dnis = dnis;
    }

    public String getDialogtech_session_id() {
        return dialogtech_session_id;
    }

    public void setDialogtech_session_id(String dialogtech_session_id) {
        this.dialogtech_session_id = dialogtech_session_id;
    }

    public String getCall_label() {
        return call_label;
    }

    public void setCall_label(String call_label) {
        this.call_label = call_label;
    }

    public String getAdobe_id() {
        return adobe_id;
    }

    public void setAdobe_id(String adobe_id) {
        this.adobe_id = adobe_id;
    }

    public String getUser_experience() {
        return user_experience;
    }

    public void setUser_experience(String user_experience) {
        this.user_experience = user_experience;
    }
}
