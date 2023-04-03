package com.springrest.springrest.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class CourseNotFoundException extends RuntimeException{
	
	private String courseName;
	private String fieldName;
	private long fieldValue;
	
	public CourseNotFoundException(String courseName, String fieldName, long fieldValue) {
		super(String.format("%s not found with %s : '%d'",courseName,fieldName,fieldValue));
		this.courseName = courseName;
		this.fieldName = fieldName;
		this.fieldValue = fieldValue;
	}
	public String getCourseName() {
		return courseName;
	}
	public String getFieldName() {
		return fieldName;
	}
	public long getFieldValue() {
		return fieldValue;
	}
	
	
	
	

}
