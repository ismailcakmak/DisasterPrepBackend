package com.project.disasterprep.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "emergencyContacts")
public class EmergencyContact {

    @Id
    private String id;

    private String contactName;

    private String contactPhoneNumber;
    
    public EmergencyContact() {
		// TODO Auto-generated constructor
    }
    
    public EmergencyContact(String id, String contactName, String contactPhoneNumber) {
        this.id = id;
        this.contactName = contactName;
        this.contactPhoneNumber = contactPhoneNumber;
    }

    public EmergencyContact(String contactName, String contactPhoneNumber) {
        this.contactName = contactName;
        this.contactPhoneNumber = contactPhoneNumber;
    }

    //Getters and setters for each attribute
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getContactName() {
        return contactName;
    }

    public void setContactName(String contactName) {
        this.contactName = contactName;
    }

    public String getContactPhoneNumber() {
        return contactPhoneNumber;
    }

    public void setContactPhoneNumber(String contactPhoneNumber) {
        this.contactPhoneNumber = contactPhoneNumber;
    }
}
