package com.sdm.informationsystem.service;

import com.sdm.informationsystem.model.Evaluation;
import com.sdm.informationsystem.repository.EvaluationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class EvaluationServiceImpl implements EvaluationService{
    @Autowired
    private EvaluationRepository evaluationRepository;

    @Override
    public Evaluation saveEvaluation(Evaluation evaluation) {
        return evaluationRepository.save(evaluation);
    }

    @Override
    public List<Evaluation> getAllEvaluations() {
        return evaluationRepository.findAll();
    }
}
