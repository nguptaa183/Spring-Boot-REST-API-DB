package com.springrestdb.springrestdb.controller;

import com.springrestdb.springrestdb.entities.Course;
import com.springrestdb.springrestdb.services.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class MyController {

    @Autowired
    private CourseService courseService;

    @GetMapping("/home")
    public String home() {
        return "Welcome to courses application";
    }

    //Get the courses
    @GetMapping("/courses")
    public List<Course> getCourses() {
        return this.courseService.getCourses();
    }

    //Get course by ID
    @GetMapping("/courses/{courseID}")
    public Optional<Course> getCourseByID(@PathVariable String courseID) {
        return this.courseService.getCourseByID(Long.parseLong(courseID));
    }

    //Insert course
    @PostMapping("/courses")
    public Course insertCourse(@RequestBody Course course) {
        return this.courseService.insertCourse(course);
    }

    //Update course by ID
    @PutMapping("/courses")
    public Course updateCourse(@RequestBody Course course) {
        return this.courseService.updateCourse(course);
    }

    //Get course by ID
    @DeleteMapping("/courses/{courseID}")
    public void deleteCourseByID(@PathVariable String courseID) {
        this.courseService.deleteCourseByID(Long.parseLong(courseID));
    }
}

