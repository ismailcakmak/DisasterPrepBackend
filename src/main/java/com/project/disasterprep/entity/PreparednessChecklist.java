package com.project.disasterprep.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "preparednessChecklists")
public class PreparednessChecklist {
    
    @Id
    private String id;
    
    private String disasterType;
    private String[] checklistItems;  
    
    public PreparednessChecklist() {
        //default constructor with no arguments
    }
    
    public PreparednessChecklist(String disasterType, String[] checklistItems) {
        this.disasterType = disasterType;
        this.checklistItems = checklistItems;
    }
    
    public PreparednessChecklist(String id, String disasterType, String[] checklistItems) {
        this.id = id;
        this.disasterType = disasterType;
        this.checklistItems = checklistItems;
    }

    //Getters and setters for each attribute
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDisasterType() {
        return disasterType;
    }
    
    public void setDisasterType(String disasterType) {
        this.disasterType = disasterType;
    }

    public String[] getChecklistItems() {
        return checklistItems;
    }

    public void setChecklistItems(String[] checklistItems) {
        this.checklistItems = checklistItems;
    }
}