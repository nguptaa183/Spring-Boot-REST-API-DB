package com.springrestdb.springrestdb.dao;

import com.springrestdb.springrestdb.entities.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseDao extends JpaRepository<Course, Long> {
//Here in JpaRepository field Course is the entity and Long is the datatype of primary key, in our case ID

}
