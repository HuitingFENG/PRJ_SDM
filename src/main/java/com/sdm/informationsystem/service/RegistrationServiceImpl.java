package com.sdm.informationsystem.service;


import com.sdm.informationsystem.model.Registration;
import com.sdm.informationsystem.repository.RegistrationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RegistrationServiceImpl implements RegistrationService{
    @Autowired
    private com.sdm.informationsystem.repository.RegistrationRepository RegistrationRepository;

    @Override
    public Registration saveRegistration(Registration registration) {
        return RegistrationRepository.save(registration);
    }

    @Override
    public List<Registration> getAllRegistrations() {
        return RegistrationRepository.findAll();
    }
}
