package com.sdm.informationsystem.controller;


import com.sdm.informationsystem.model.Registration;
import com.sdm.informationsystem.repository.RegistrationRepository;
import com.sdm.informationsystem.service.RegistrationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/registration")
@CrossOrigin(origins = "http://localhost:3000")
public class RegistrationController {
    @Autowired
    private RegistrationService registrationService;

    @PostMapping("/add")
    public ResponseEntity<String> add(@RequestBody Registration registration) {
        Registration savedRegistration = registrationService.saveRegistration(registration);
        if (savedRegistration != null) {
            return ResponseEntity.ok("New Registration is added");
        } else {
            return ResponseEntity.badRequest().build();
        }
    }

    @GetMapping("/getAll")
    public List<Registration> getAllRegistrations(){
        return registrationService.getAllRegistrations();
    }

    @Autowired
    private RegistrationRepository registrationRepository;

    @GetMapping("/{id}")
    public ResponseEntity<Registration> getRegistrationById(@PathVariable("id") int registrationId) {
        Optional<Registration> optionalRegistration = registrationRepository.findById(registrationId);

        if (optionalRegistration.isPresent()) {
            Registration registration = optionalRegistration.get();
            return ResponseEntity.ok(registration);
        } else {
            return ResponseEntity.notFound().build();
        }
    }
    
}
