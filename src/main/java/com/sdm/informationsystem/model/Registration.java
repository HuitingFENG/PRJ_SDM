package com.sdm.informationsystem.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.util.Date;

@Entity
public class Registration {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int registrationID;
    private String registrationType; // inter or intra
    private Date registrationDate;
    private String registrationLocation;
    private String registrationContact;
    private String registrationName;
    private String registrationCompany;

    private int registrationCourseID;

    private String registrationComments;

    public Registration() {
    }

    public int getRegistrationCourseID() {
        return registrationCourseID;
    }

    public void setRegistrationCourseID(int registrationCourseID) {
        this.registrationCourseID = registrationCourseID;
    }

    public String getRegistrationComments() {
        return registrationComments;
    }

    public void setRegistrationComments(String registrationComments) {
        this.registrationComments = registrationComments;
    }

    public int getRegistrationID() {
        return registrationID;
    }

    public void setRegistrationID(int registrationID) {
        this.registrationID = registrationID;
    }

    public String getRegistrationType() {
        return registrationType;
    }

    public void setRegistrationType(String registrationType) {
        this.registrationType = registrationType;
    }

    public Date getRegistrationDate() {
        return registrationDate;
    }

    public void setRegistrationDate(Date registrationDate) {
        this.registrationDate = registrationDate;
    }

    public String getRegistrationLocation() {
        return registrationLocation;
    }

    public void setRegistrationLocation(String registrationLocation) {
        this.registrationLocation = registrationLocation;
    }

    public String getRegistrationContact() {
        return registrationContact;
    }

    public void setRegistrationContact(String registrationContact) {
        this.registrationContact = registrationContact;
    }

    public String getRegistrationName() {
        return registrationName;
    }

    public void setRegistrationName(String registrationName) {
        this.registrationName = registrationName;
    }

    public String getRegistrationCompany() {
        return registrationCompany;
    }

    public void setRegistrationCompany(String registrationCompany) {
        this.registrationCompany = registrationCompany;
    }
}
