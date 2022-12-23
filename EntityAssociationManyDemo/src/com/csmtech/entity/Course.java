package com.csmtech.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
@Entity
public class Course implements Serializable {
	@Id
	@Column(name="course_id")
	private Long courseId;
	@Column(name="course_name")
	private String courseName;
	@Column(name="course_fees")
	private Double courseFees;
	
	@ManyToMany(mappedBy="course")
	private List<Student> student;
	
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

	public List<Student> getStudent() {
		return student;
	}

	public void setStudent(List<Student> student) {
		this.student = student;
	}

	@Override
	public String toString() {
		return "Course [courseId=" + courseId + ", courseName=" + courseName + ", courseFees=" + courseFees + "]";
	}
	
	
	
}