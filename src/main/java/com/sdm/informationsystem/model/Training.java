package com.sdm.informationsystem.model;

import com.sdm.informationsystem.common.Observer;
import jakarta.persistence.*;

import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.ArrayList;


@Entity
public class Training {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int trainingID;
    @Transient
    private ArrayList<Observer> observers;
    private String trainingContent;
    /*
    //private Boolean trainingAuthorized;
    private String trainingType; // inter or intra
    private int trainingGap; // per month
    private int trainingDuration;   // number of days
    private String trainingLocation;
    private List<Registration> trainingRegistrations;
    private Date trainingBeginDate;
    private Date trainingPrepareBeginDate;
    private Date trainingCancelDate;
    private String trainingCancelBy;
    private Boolean trainingFinishPreparation;
    */
    public Training() {
        observers = new ArrayList<>();
    }

    public void registerObserver(Observer o) {
        observers.add(o);
    }

    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(this);
        }
    }

    public void setTrainingContent(String trainingContent) {
        this.trainingContent = trainingContent;
        notifyObservers();
    }

    public String getTrainingContent() {
        return this.trainingContent;
    }
    /*
    public Boolean getTrainingAuthorized() {
        return trainingAuthorized;
    }

    // for intra-company, one registration will enable to have a training session
    public void setTrainingAuthorized(List<int> trainingRegistrations, String trainingType) {
        Boolean trainingAuthorized = false;
        if ("intra".equals(trainingType) && trainingRegistrations.size() >= 1) {
            trainingAuthorized = true;
        }
        if ("inter".equals(trainingType) && trainingRegistrations.size() >= 3) {
            trainingAuthorized = true;
        }
        this.trainingAuthorized = trainingAuthorized;
    }
    */

    /*
    public int getTrainingID() {
        return trainingID;
    }

    public void setTrainingID(int trainingID) {
        this.trainingID = trainingID;
        notifyObservers();
    }

    public String getTrainingType() {
        return trainingType;
    }

    public void setTrainingType(String trainingType) {
        this.trainingType = trainingType;
        notifyObservers();
    }

    public int getTrainingGap() {
        return trainingGap;
    }

    public void setTrainingGap(int trainingGap) {
        this.trainingGap = trainingGap;
        notifyObservers();
    }

    public int getTrainingDuration() {
        return trainingDuration;
    }

    public void setTrainingDuration(int trainingDuration) {
        this.trainingDuration = trainingDuration;
        notifyObservers();
    }

    public String getTrainingLocation() {
        return trainingLocation;
    }

    public void setTrainingLocation(String trainingLocation) {
        this.trainingLocation = trainingLocation;
        notifyObservers();
    }

    public List<Registration> getTrainingRegistrations() {
        return trainingRegistrations;
    }

    public void setTrainingRegistrations(List<Registration> trainingRegistrations) {
        this.trainingRegistrations = trainingRegistrations;
        notifyObservers();
    }

    public Date getTrainingBeginDate() {
        return trainingBeginDate;
    }

    public void setTrainingBeginDate(Date trainingBeginDate) {
        this.trainingBeginDate = trainingBeginDate;
        notifyObservers();
    }

    public Date getTrainingPrepareBeginDate() {
        return trainingPrepareBeginDate;
    }

    public void setTrainingPrepareBeginDate(Date trainingPrepareBeginDate) {
        this.trainingPrepareBeginDate = trainingPrepareBeginDate;
        notifyObservers();
    }

    public Date getTrainingCancelDate() {
        return trainingCancelDate;
    }

    public void setTrainingCancelDate(Date trainingCancelDate) {
        this.trainingCancelDate = trainingCancelDate;
        notifyObservers();
    }

    public String getTrainingCancelBy() {
        return trainingCancelBy;
    }

    public void setTrainingCancelBy(String trainingCancelBy) {
        this.trainingCancelBy = trainingCancelBy;
        notifyObservers();
    }

    public Boolean getTrainingFinishPreparation() {
        return trainingFinishPreparation;
    }

    public void setTrainingFinishPreparation(Boolean reserveRoom, Boolean installMachines, Boolean notifyTrainer, Boolean prepareMaterials, Boolean inviteTrainees, Boolean updateSchedule, Boolean printLists, Boolean printTickets, Boolean generateForms) {
        List<Boolean> l = Arrays.asList(reserveRoom, installMachines, notifyTrainer, prepareMaterials, inviteTrainees, updateSchedule, printLists, printTickets, generateForms);
        boolean trainingFinishPreparation = true;
        for (boolean taskComplete : l){
            if (!taskComplete){
                trainingFinishPreparation = false;
                break;
            }
        }
        this.trainingFinishPreparation = trainingFinishPreparation;
        notifyObservers();
    }
    */
}
