package com.project.disasterprep.repository;

import java.util.List;
import org.springframework.data.mongodb.repository.MongoRepository;
import com.project.disasterprep.entity.Disaster;

public interface DisasterRepository extends MongoRepository<Disaster, String> {
    List<Disaster> findAll();
	List<Disaster> findByDisasterType(String disasterType);
    List<Disaster> findByDisasterCause(String disasterCause);
	
}