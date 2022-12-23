package com.csmtech.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.query.Query;

import com.csmtech.entity.Emp;
import com.csmtech.util.DbUtil;

public class EmpDaoImpl implements  EmpDao {
	Session session=null;
	String hql;
	Query<Emp> query=null;
	public List<Emp> getAllEmps() {
		session=DbUtil.getSessionFactory().openSession();
		hql="from Emp";
		query=session.createQuery(hql);
		List<Emp> empList=query.list();
		return empList;
		
		
	}

	public Emp getEmpById(Long empId) {
		return DbUtil.getSessionFactory().openSession().get(Emp.class,empId);
	}
	}


