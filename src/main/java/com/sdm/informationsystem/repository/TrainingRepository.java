package com.sdm.informationsystem.repository;

import com.sdm.informationsystem.model.Course;
import com.sdm.informationsystem.model.Training;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TrainingRepository extends JpaRepository<Training, Integer> {
}
