package main.java.com.storedge.api.requests;

import main.java.com.storedge.api.helpers.Note;

/**
 * Created by vchadha on 7/6/17.
 */
public class DeleteLead {
    private String close_reason_id;
    private Note[] notes_attributes;

    public DeleteLead() {
    }

    public DeleteLead(String close_reason_id, Note[] notes_attributes) {
        this.close_reason_id = close_reason_id;
        this.notes_attributes = notes_attributes;
    }

    public String getClose_reason_id() {
        return close_reason_id;
    }

    public void setClose_reason_id(String close_reason_id) {
        this.close_reason_id = close_reason_id;
    }

    public Note[] getNotes_attributes() {
        return notes_attributes;
    }

    public void setNotes_attributes(Note[] notes_attributes) {
        this.notes_attributes = notes_attributes;
    }
}
