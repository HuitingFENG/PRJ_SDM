package com.sdm.informationsystem.service;

import com.sdm.informationsystem.model.Course;

import java.util.List;

public interface CourseService {
    public Course saveCourse(Course course);
    public List<Course> getAllCourses();
}
