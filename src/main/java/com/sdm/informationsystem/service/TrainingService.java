package com.sdm.informationsystem.service;

import com.sdm.informationsystem.common.Observer;
import com.sdm.informationsystem.model.Training;

import java.util.List;

public interface TrainingService extends Observer {
    public Training saveTraining(Training training);
    public List<Training> getAllTrainings();
}
