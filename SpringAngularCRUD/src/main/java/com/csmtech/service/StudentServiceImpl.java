package com.csmtech.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.csmtech.model.Student;
import com.csmtech.repository.StudentRepository;
@Service
public class StudentServiceImpl implements StudentService {
	@Autowired
	private StudentRepository studentRepository;

	@Override
	public Student registerStudent(Student student) {
		return studentRepository.save(student);

	}

	@Override
	public List<Student> getStudents() {
		return studentRepository.findAll();
		
	}

	@Override
	public void deleteStudent(Long id) {
		studentRepository.deleteById(id);
		
	}

	@Override
	public Student updateStudent(Student student) {
		Long rollNumber=student.getRollNumber();
		Student std=studentRepository.findById(rollNumber).get();
		std.setName(student.getName());
		std.setFname(student.getFname());
		std.setAddress(student.getAddress());
		std.setEmail(student.getEmail());
		std.setDate(student.getDate());
		return studentRepository.save(std);
		
		
	}

	

}
