package com.csmtech.domain;

import java.io.Serializable;

public class Course implements Serializable {
	
	private Long courseId;
	
	private String courseName;
	
	private Double courseFees;

	public Long getCourseId() {
		return courseId;
	}

	public void setCourseId(Long courseId) {
		this.courseId = courseId;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public Double getCourseFees() {
		return courseFees;
	}

	public void setCourseFees(Double courseFees) {
		this.courseFees = courseFees;
	}

	@Override
	public String toString() {
		return "Course [courseId=" + courseId + ", courseName=" + courseName + ", courseFees=" + courseFees + "]";
	}

	
	
	

}
