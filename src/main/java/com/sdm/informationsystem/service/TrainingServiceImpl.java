package com.sdm.informationsystem.service;

import com.sdm.informationsystem.model.Training;
import com.sdm.informationsystem.repository.TrainingRepository;
import org.apache.el.stream.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TrainingServiceImpl implements TrainingService{
    private Training training;
    private final TrainingRepository trainingRepository;

    @Autowired
    public TrainingServiceImpl(TrainingRepository trainingRepository) {
        this.trainingRepository = trainingRepository;
    }

    @Override
    public Training saveTraining(Training training) {
        return trainingRepository.save(training);
    }

    @Override
    public List<Training> getAllTrainings() {
        return trainingRepository.findAll();
    }

    @Override
    public void update(Training training) {
        // Add your logic for updating a training here
        this.training = training;
        displayTraining();
    }
    public void displayTraining() {
        System.out.println("Training content updated to: " + training.getTrainingContent());
    }
}
