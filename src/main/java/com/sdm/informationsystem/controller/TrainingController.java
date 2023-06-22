package com.sdm.informationsystem.controller;

import com.sdm.informationsystem.model.Training;
import com.sdm.informationsystem.repository.CourseRepository;
import com.sdm.informationsystem.repository.TrainingRepository;
import com.sdm.informationsystem.service.TrainingService;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/training")
@CrossOrigin(origins = "http://localhost:3000")
public class TrainingController {
    private Training training;
    @Autowired
    private TrainingService trainingService;

    @Autowired
    private TrainingRepository trainingRepository;

    @PostConstruct
    public void init() {
        this.training = new Training();
        training.registerObserver(trainingService);
        training.setTrainingContent("New Training Content");
    }
    /*
    @Autowired
    public TrainingController(TrainingService trainingService) {
        this.trainingService = trainingService;
    }

    @PostMapping("/add")
    public ResponseEntity<String> add(@RequestBody Training training) {
        Training savedTraining = trainingService.saveTraining(training);
        if (savedTraining != null) {
            return ResponseEntity.ok("New Training is added");
        } else {
            return ResponseEntity.badRequest().build();
        }
    }

    @GetMapping("/getAll")
    public List<Training> getAllTrainings(){
        return trainingService.getAllTrainings();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Training> getTrainingById(@PathVariable("id") int trainingId) {
        Optional<Training> optionalTraining = trainingRepository.findById(trainingId);

        if (optionalTraining.isPresent()) {
            Training training = optionalTraining.get();
            return ResponseEntity.ok(training);
        } else {
            return ResponseEntity.notFound().build();
        }
    }
    */
}
