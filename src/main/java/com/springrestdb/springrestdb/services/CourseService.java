package com.springrestdb.springrestdb.services;

import com.springrestdb.springrestdb.entities.Course;

import java.util.List;

public interface CourseService {
    public List<Course> getCourses();

    public Course getCourseByID(long courseID);

    public Course insertCourse(Course course);

    public Course updateCourse(Course course);

    public String deleteCourseByID(long courseID);
}
