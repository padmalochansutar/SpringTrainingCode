package com.csmtech.dao;

import java.util.List;


import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.csmtech.entity.Emp;
import com.csmtech.util.DbUtil;

public class EmpDaoImpl implements EmpDao {
     private Session session=null;
     private Query query;
	@Override
	public Long saveEmp(Emp emp) {
		session = DbUtil.getSessionFactory().openSession();
		Long genEmpId=null;
		Transaction tx=session.beginTransaction();
		genEmpId=(Long)session.save(emp);
		tx.commit();
		session.close();
		return genEmpId;
	}
	public void deleteEmpById(long empId) {
		session = DbUtil.getSessionFactory().openSession();
		Emp emp=session.get(Emp.class, empId);
	    emp.setIsDelete("yes");
		Transaction tx=session.beginTransaction();
		session.saveOrUpdate(emp);
		tx.commit();
		session.close();
	}

	public List<Emp> getAllEmps() {
		session = DbUtil.getSessionFactory().openSession();
		query=session.createQuery("from Emp where isDelete='NO'");
		List<Emp> empList=query.list();
		session.close();
		return empList;
	}
	public void updateById(long empId) {
		session=DbUtil.getSessionFactory().openSession();
		Transaction tx=session.beginTransaction();
		session.update(empId);
		tx.commit();
		session.close();
		
	}
     
}
