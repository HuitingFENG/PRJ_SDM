package com.sdm.informationsystem.model;

import jakarta.persistence.*;
import java.util.Date;

@Entity
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int CourseID;
    private String CourseName;
    private double CoursePrice;
    //@ElementCollection
    //private List<Date> CourseDates;
    //@ElementCollection
    //private List<String> CourseLocations;
    private Date CourseDates;
    private String CourseLocations;
    private String CourseContent;

    public Course() {
    }

    public int getCourseID() {
        return CourseID;
    }

    public void setCourseID(int CourseID) {
        this.CourseID = CourseID;
    }

    public String getCourseName() {
        return CourseName;
    }

    public void setCourseName(String CourseName) {
        this.CourseName = CourseName;
    }

    public double getCoursePrice() {
        return CoursePrice;
    }

    public void setCoursePrice(double CoursePrice) {
        this.CoursePrice = CoursePrice;
    }

    /*
    public List<Date> getCourseDates() {
        return CourseDates;
    }
    public void setCourseDates(List<Date> courseDates) {
        CourseDates = courseDates;
    }
    public List<String> getCourseLocations() {
        return CourseLocations;
    }
    public void setCourseLocations(List<String> courseLocations) {
        CourseLocations = courseLocations;
    }
    */

    public Date getCourseDates() {
        return CourseDates;
    }

    public void setCourseDates(Date CourseDates) {
        this.CourseDates = CourseDates;
    }

    public String getCourseLocations() {
        return CourseLocations;
    }

    public void setCourseLocations(String CourseLocations) {
        this.CourseLocations = CourseLocations;
    }

    public String getCourseContent() {
        return CourseContent;
    }

    public void setCourseContent(String CourseContent) {
        this.CourseContent = CourseContent;
    }
}
