package com.project.disasterprep.repository;

import java.util.List;
import org.springframework.data.mongodb.repository.MongoRepository;
import com.project.disasterprep.entity.PreparednessChecklist;

public interface PreparednessChecklistRepository extends MongoRepository<PreparednessChecklist, String> {
    List<PreparednessChecklist> findAll();
    void deleteById(String id);
}