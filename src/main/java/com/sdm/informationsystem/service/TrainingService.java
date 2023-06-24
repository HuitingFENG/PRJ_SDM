package com.sdm.informationsystem.service;

import com.sdm.informationsystem.model.Training;

import java.util.List;

public interface TrainingService{
    public Training saveTraining(Training training);
    public List<Training> getAllTrainings();
}
