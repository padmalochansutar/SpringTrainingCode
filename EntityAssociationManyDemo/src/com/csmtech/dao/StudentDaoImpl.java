package com.csmtech.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.csmtech.entity.Student;
import com.csmtech.util.DbUtil;

public class StudentDaoImpl implements StudentDao {
	private Session session=null;
	List<Student> studentList;

	public void saveStudent(Student student) {
		session=DbUtil.getSessionFactory().openSession();
		Transaction tx=session.beginTransaction();
		session.save(student);
		tx.commit();
		session.close();
		
		
	}

	public Object getAllStudents() {
		session=DbUtil.getSessionFactory().openSession();
		studentList=session.createQuery("from Student").list();
		session.close();
		return studentList;
	}

	public void updateByRollNo(long rollNo) {
		session=DbUtil.getSessionFactory().openSession();
		Transaction tx=session.beginTransaction();
		session.update(rollNo);
		tx.commit();
		session.close();
				
				
		
	}

}
