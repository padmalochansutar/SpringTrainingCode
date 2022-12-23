package com.csmtech.service;

import java.util.List;

import com.csmtech.model.Student;

public interface StudentService {

	Student registerStudent(Student student);

	List<Student> getStudents();

	void deleteStudent(Long id);

	Student updateStudent(Student student);



}
