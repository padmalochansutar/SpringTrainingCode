package com.csmtech.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.csmtech.model.Student;
import com.csmtech.repository.StudentRepository;
@Service
public class StudentServiceImpl implements StudentService {
	@Autowired
	private StudentRepository  studentRepository ;

	@Override
	public void saveData(Student stu) {
		 studentRepository.save(stu);
	}

	@Override
	public List<Student> getAllData() {
		return 	studentRepository .findAll();
		
	}

	

}
