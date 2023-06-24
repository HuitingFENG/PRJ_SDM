package com.sdm.informationsystem.controller;

import com.sdm.informationsystem.model.Course;
import com.sdm.informationsystem.model.Evaluation;
import com.sdm.informationsystem.repository.CourseRepository;
import com.sdm.informationsystem.repository.EvaluationRepository;
import com.sdm.informationsystem.service.CourseService;
import com.sdm.informationsystem.service.EvaluationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/evaluation")
@CrossOrigin(origins = "http://localhost:3000")
public class EvaluationController {
    @Autowired
    private EvaluationService evaluationService;

    @PostMapping("/add")
    public ResponseEntity<String> add(@RequestBody Evaluation evaluation) {
        Evaluation savedEvaluation = evaluationService.saveEvaluation(evaluation);
        if (savedEvaluation != null) {
            return ResponseEntity.ok("New Evaluation is added");
        } else {
            return ResponseEntity.badRequest().build();
        }
    }

    @GetMapping("/getAll")
    public List<Evaluation> getAllEvaluations(){
        return evaluationService.getAllEvaluations();
    }

    @Autowired
    private EvaluationRepository evaluationRepository;

    @GetMapping("/{id}")
    public ResponseEntity<Evaluation> getEvaluationById(@PathVariable("id") int evaluationId) {
        Optional<Evaluation> optionalEvaluation = evaluationRepository.findById(evaluationId);

        // Check if the Evaluation exists
        if (optionalEvaluation.isPresent()) {
            Evaluation evaluation = optionalEvaluation.get();
            return ResponseEntity.ok(evaluation);
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
