package com.csmtech.service;


import com.csmtech.dao.StudentDaoImpl;
import com.csmtech.entity.Student;

public class StudentServiceImpl implements StudentService{

	public void saveStudent(Student student) {
		new StudentDaoImpl().saveStudent(student);
		
	}

	public Object getAllStudents() {
		return new StudentDaoImpl().getAllStudents();
	}
	public void updateByRollNo(long rollNo) {
		new StudentDaoImpl().updateByRollNo(rollNo);
		
	}

}
