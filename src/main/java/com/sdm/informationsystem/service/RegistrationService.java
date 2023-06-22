package com.sdm.informationsystem.service;

import com.sdm.informationsystem.model.Registration;

import java.util.List;

public interface RegistrationService {
    public Registration saveRegistration(Registration registration);
    public List<Registration> getAllRegistrations();
}
