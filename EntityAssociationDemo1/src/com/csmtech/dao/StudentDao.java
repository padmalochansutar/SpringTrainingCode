package com.csmtech.dao;

import com.csmtech.entity.Student;

public interface StudentDao {
	void saveStudent(Student student);
	Object getAllStudents();

}
