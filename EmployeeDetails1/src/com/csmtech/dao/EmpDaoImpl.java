package com.csmtech.dao;



import java.util.List;

import org.hibernate.Session;

import org.hibernate.query.Query;

import com.csmtech.entity.Emp;
import com.csmtech.service.EmpService;
import com.csmtech.util.DbUtil;

public class EmpDaoImpl  implements EmpDao{
	private Session session=null;
	Query<Emp> query;

	public List<Emp> getAlldata() {
		session=DbUtil.getSessionFactory().openSession();
		query=session.createQuery("from Emp");
		List<Emp> returnList=query.list();
		return returnList ;
	}

	

}
