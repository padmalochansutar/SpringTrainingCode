package com.csmtech.service;

import java.util.List;

import com.csmtech.entity.Student;

public interface StudentService {
	void saveStudent(Student student);
	List<Student> getAllStudent();
}
