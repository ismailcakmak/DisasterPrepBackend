package com.project.disasterprep.repository;

import java.util.List;
import org.springframework.data.mongodb.repository.MongoRepository;
import com.project.disasterprep.entity.EmergencyContact;

public interface EmergencyContactRepository extends MongoRepository<EmergencyContact, String> {
    List<EmergencyContact> findAll();
    void deleteById(String id);
}