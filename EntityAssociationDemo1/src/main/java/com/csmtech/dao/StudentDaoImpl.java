package com.csmtech.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.csmtech.dbutil.DbUtil;
import com.csmtech.entity.Student;

public class StudentDaoImpl implements StudentDao {
	private Session session=null;
	List<Student> studentList = null;
	@Override
	public void saveStudent(Student student) {
		session = DbUtil.getSessionFactory().openSession();
		Transaction tx = session.beginTransaction();
		session.saveOrUpdate(student);
		tx.commit();
	}

	@Override
	public List<Student> getAllStudent() {
		session = DbUtil.getSessionFactory().openSession();
		studentList = session.createQuery("From Student").list();
		session.close();
		return studentList;
	}

}
