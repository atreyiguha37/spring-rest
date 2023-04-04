package com.springrest.springrest.services;

import java.util.*;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springrest.springrest.entities.Course;
import com.springrest.springrest.exception.CourseNotFoundException;
import com.springrest.springrest.repository.CourseRepository;

@Service
public class CourseServiceImpl implements CourseService {
	
	@Autowired
    private CourseRepository courseRepository;
	
	@Override
	public List<Course> getCourses() {
		// TODO Auto-generated method stub
		return (List<Course>)courseRepository.findAll();
	}

	@Override
	public Course getCourse(long courseId) {
		// TODO Auto-generated method stub
		//hello
		
		return (courseRepository.findById(courseId)).orElseThrow(()-> new CourseNotFoundException("Course", "Id",courseId));
	}

	@Override
	public Course addCourse(Course course) {
		// TODO Auto-generated method stub
		
		return courseRepository.save(course);
	}

	@Override
	public Course updateCourse(Course course) {
		// TODO Auto-generated method stub
		
		
		return course;
	}

	@Override
	public void deleteCourse(long courseId) {
		// TODO Auto-generated method stub
		courseRepository.deleteById(courseId);
	}

}
