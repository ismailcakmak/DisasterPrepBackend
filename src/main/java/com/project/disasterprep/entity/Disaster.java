package com.project.disasterprep.entity;

import java.lang.reflect.Constructor;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "disasters")
public class Disaster {
    
    @Id
    private String id;
    
    private String disasterType;
    private String disasterCause;
    private String disasterPlan;
    
    public Disaster() {
        //default constructor with no arguments
    }
    
    public Disaster(String disasterType, String disasterCause, String disasterPlan) {
		super();
		this.disasterType = disasterType;
		this.disasterCause = disasterCause;
		this.disasterPlan = disasterPlan;
	}


    //Getters and setters for each attribute
    

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    
    
    public String getDisasterPlan() {
		return disasterPlan;
	}
    
	public void setDisasterPlan(String disasterPlan) {
		this.disasterPlan = disasterPlan;
	}

    public String getDisasterType() {
        return disasterType;
    }

    public void setDisasterType(String disasterType) {
        this.disasterType = disasterType;
    }

    public String getDisasterCause() {
        return disasterCause;
    }

    public void setDisasterCause(String disasterCause) {
        this.disasterCause = disasterCause;
    }
}

