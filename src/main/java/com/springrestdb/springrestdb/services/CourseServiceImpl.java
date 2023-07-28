package com.springrestdb.springrestdb.services;

import com.springrestdb.springrestdb.dao.CourseDao;
import com.springrestdb.springrestdb.entities.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CourseServiceImpl implements CourseService {

    @Autowired
    private CourseDao courseDao;

    public CourseServiceImpl() {

    }

    @Override
    public List<Course> getCourses() {
        return courseDao.findAll();
    }

    @Override
    public Optional<Course> getCourseByID(long courseID) {
        return courseDao.findById(courseID);
    }

    @Override
    public Course insertCourse(Course course) {
        courseDao.save(course);
        return course;
    }

    @Override
    public Course updateCourse(Course course) {
        courseDao.save(course);
        return course;
    }

    @Override
    public void deleteCourseByID(long courseID) {
        courseDao.deleteById(courseID);
    }
}
