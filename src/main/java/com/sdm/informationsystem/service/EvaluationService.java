package com.sdm.informationsystem.service;

import com.sdm.informationsystem.model.Course;
import com.sdm.informationsystem.model.Evaluation;

import java.util.List;

public interface EvaluationService {
    public Evaluation saveEvaluation(Evaluation evaluation);
    public List<Evaluation> getAllEvaluations();
}
