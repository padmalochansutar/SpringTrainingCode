package com.csmtech.service;

import java.util.List;

import com.csmtech.dao.StudentDaoImpl;
import com.csmtech.entity.Student;

public class StudentServiceImpl implements StudentService {

	@Override
	public void saveStudent(Student student) {
		new StudentDaoImpl().saveStudent(student);
	}

	@Override
	public List<Student> getAllStudent() {
		return new StudentDaoImpl().getAllStudent();
	}

}
