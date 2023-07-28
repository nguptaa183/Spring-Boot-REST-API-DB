package com.springrestdb.springrestdb.services;

import com.springrestdb.springrestdb.entities.Course;

import java.util.List;
import java.util.Optional;

public interface CourseService {
    public List<Course> getCourses();

    public Optional<Course> getCourseByID(long courseID);

    public Course insertCourse(Course course);

    public Course updateCourse(Course course);

    public void deleteCourseByID(long courseID);
}
