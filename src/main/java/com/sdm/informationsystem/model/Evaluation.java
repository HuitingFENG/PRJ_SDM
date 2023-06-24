package com.sdm.informationsystem.model;

import jakarta.persistence.*;
import java.util.Date;

@Entity
public class Evaluation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int evaluationID;
    private int evaluationCourseID;
    private double evaluationGrade;

    public Evaluation() {
    }

    public int getEvaluationID() {
        return evaluationID;
    }

    public void setEvaluationID(int evaluationID) {
        this.evaluationID = evaluationID;
    }

    public int getEvaluationCourseID() {
        return evaluationCourseID;
    }

    public void setEvaluationCourseID(int evaluationCourseID) {
        this.evaluationCourseID = evaluationCourseID;
    }

    public double getEvaluationGrade() {
        return evaluationGrade;
    }

    public void setEvaluationGrade(double evaluationGrade) {
        this.evaluationGrade = evaluationGrade;
    }
}
