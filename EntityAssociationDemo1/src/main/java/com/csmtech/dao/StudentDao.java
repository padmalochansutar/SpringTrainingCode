package com.csmtech.dao;

import java.util.List;

import com.csmtech.entity.Student;

public interface StudentDao {
	void saveStudent(Student student);
	List<Student> getAllStudent();

}
