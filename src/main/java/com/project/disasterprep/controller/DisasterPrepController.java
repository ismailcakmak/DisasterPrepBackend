package com.project.disasterprep.controller;

import java.util.Arrays;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.project.disasterprep.entity.Disaster;
import com.project.disasterprep.entity.EmergencyContact;
import com.project.disasterprep.entity.PreparednessChecklist;
import com.project.disasterprep.repository.DisasterRepository;
import com.project.disasterprep.repository.EmergencyContactRepository;
import com.project.disasterprep.repository.PreparednessChecklistRepository;

@RestController
@RequestMapping("/disasterprep")
public class DisasterPrepController {

    @Autowired private DisasterRepository disasterRepository;
    @Autowired private EmergencyContactRepository emergencyContactRepository;
    @Autowired private PreparednessChecklistRepository preparednessChecklistRepository;

    @PostConstruct
    public void init() {

        if (disasterRepository.count() == 0) {
            Disaster earthquake = new Disaster("Earthquake", "Tectonic movements","If you are indoors during an earthquake, drop to the ground, take cover under a sturdy piece of furniture or in a doorway, and hold on until the shaking stops.");
            Disaster hurricane = new Disaster("Hurricane", "High wind speeds and heavy rain", "To stay safe during a hurricane, secure your home, gather necessary supplies, follow evacuation orders or seek shelter in a designated storm shelter, and stay inside until the storm has passed and it's safe to go outside.");
            disasterRepository.saveAll(Arrays.asList(earthquake, hurricane));
        }

        if (emergencyContactRepository.count() == 0) {
            EmergencyContact contact1 = new EmergencyContact("Emergency Services", "112");
            EmergencyContact contact2 = new EmergencyContact("Police", "155");
            EmergencyContact contact3 = new EmergencyContact("Fire Department", "110");
            emergencyContactRepository.saveAll(Arrays.asList(contact1, contact2, contact3));
        }

        if (preparednessChecklistRepository.count() == 0) {
            PreparednessChecklist earthquakeChecklist = new PreparednessChecklist("Earthquake", new String[] { "Water", "Non-perishable food", "First aid supplies", "Flashlight", "Radio" });
            PreparednessChecklist hurricaneChecklist = new PreparednessChecklist("Hurricane", new String[] { "Water", "Non-perishable food", "First aid supplies", "Flashlight", "Battery-operated radio", "Cash" });
            preparednessChecklistRepository.saveAll(Arrays.asList(earthquakeChecklist, hurricaneChecklist));
        }

    }

    @GetMapping("/disasters") 						//lists all disasters
    public List<Disaster> getAllDisasters() {
        return disasterRepository.findAll();
    }

    @PostMapping("/disasters/save")					//saves a new disaster
    public Disaster createDisaster(@RequestBody Disaster disaster) {
        return disasterRepository.save(disaster);
    }


    @GetMapping("/emergencycontacts")				//lists all emergency contacts
    public List<EmergencyContact> getAllEmergencyContacts() {
        return emergencyContactRepository.findAll();
    }

    @PostMapping("/emergencycontacts/save")			//saves a emergency contacts
    public EmergencyContact createEmergencyContact(@RequestBody EmergencyContact contact) {
        return emergencyContactRepository.save(contact);
    }
    

    @GetMapping("/preparednesschecklists")			//lists all checklists
    public List<PreparednessChecklist> getAllPreparednessChecklists() {
        return preparednessChecklistRepository.findAll();
    }

    @PostMapping("/preparednesschecklists/save")	//saves a new checklist
    public PreparednessChecklist createPreparednessChecklist(@RequestBody PreparednessChecklist preparednessChecklist) {
        return preparednessChecklistRepository.save(preparednessChecklist);
    }
}