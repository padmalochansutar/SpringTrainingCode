package com.csmtech.dao;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.csmtech.entity.Salary;
import com.csmtech.util.DbUtil;

public class SalaryDaoImpl implements SalaryDao{
	
	

	

	@Override
	public void save(Salary sal) {
		Session session=DbUtil.getSessionFactory().openSession();
		Transaction tx=session.beginTransaction();
		session.save(sal);
		tx.commit();
		
	}

	

}
