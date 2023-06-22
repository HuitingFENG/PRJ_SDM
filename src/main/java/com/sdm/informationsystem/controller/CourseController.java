package com.sdm.informationsystem.controller;

import com.sdm.informationsystem.model.Course;
import com.sdm.informationsystem.repository.CourseRepository;
import com.sdm.informationsystem.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/course")
@CrossOrigin(origins = "http://localhost:3000")
public class CourseController {

    @Autowired
    private CourseService courseService;

    @PostMapping("/add")
    public ResponseEntity<String> add(@RequestBody Course course) {
        Course savedCourse = courseService.saveCourse(course);
        if (savedCourse != null) {
            return ResponseEntity.ok("New Course is added");
        } else {
            return ResponseEntity.badRequest().build();
        }
    }

    @GetMapping("/getAll")
    public List<Course> getAllCourses(){
        return courseService.getAllCourses();
    }

    @Autowired
    private CourseRepository courseRepository;

    @GetMapping("/{id}")
    public ResponseEntity<Course> getCourseById(@PathVariable("id") int courseId) {
        // Retrieve the course from the database using the courseId
        Optional<Course> optionalCourse = courseRepository.findById(courseId);

        // Check if the course exists
        if (optionalCourse.isPresent()) {
            Course course = optionalCourse.get();
            return ResponseEntity.ok(course);
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
