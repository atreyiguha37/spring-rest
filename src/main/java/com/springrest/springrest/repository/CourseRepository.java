package com.springrest.springrest.repository;

import org.springframework.data.repository.CrudRepository;
import com.springrest.springrest.entities.Course;
import org.springframework.stereotype.Repository;


@Repository
public interface CourseRepository extends CrudRepository<Course, Long> {

}
