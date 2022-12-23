package com.csmtech.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.csmtech.entity.Student;
import com.csmtech.util.DbUtil;

public class StudentDaoImpl implements StudentDao {

	private Session session;
	List<Student> studentList;
	@Override
	public void saveStudent(Student student) {
		session=DbUtil.getSessionFactory().openSession();
		Transaction tx=session.beginTransaction();
		session.save(student);
		tx.commit();

	}

	@Override
	public List<Student> getAllStudents() {
		session=DbUtil.getSessionFactory().openSession();
		studentList= session.createQuery("From Student").list();
		session.close();
		return studentList;
	}

}
