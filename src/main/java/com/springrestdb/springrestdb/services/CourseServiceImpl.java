package com.springrestdb.springrestdb.services;

import com.springrestdb.springrestdb.entities.Course;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CourseServiceImpl implements CourseService {

    List<Course> list;

    public CourseServiceImpl() {
        list = new ArrayList<>();
        list.add(new Course(124, "Java", "Learn Java"));
        list.add(new Course(456, "Python", "Learn Python"));
    }

    @Override
    public List<Course> getCourses() {
        return list;
    }

    @Override
    public Course getCourseByID(long courseID) {
        for (Course course :
                list) {
            if (course.getId() == courseID) {
                return course;
            }
        }
        return null;
    }

    @Override
    public Course insertCourse(Course course) {
        list.add(course);
        return course;
    }

    @Override
    public Course updateCourse(Course course) {
        for (Course item : list
        ) {
            if (item.getId()==course.getId()){
                item.setTitle(course.getTitle());
                item.setDescription(course.getDescription());
            }
        }
        return course;
    }

    @Override
    public String deleteCourseByID(long courseID) {
        for (Course course : list
        ) {
            if (course.getId() == courseID) {
                list.remove(course);
                return "Deleted Successfully";
            }
        }
        return "Not Found";
    }
}
