package com.csmtech.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.query.Query;

import com.csmtech.entity.User;
import com.csmtech.util.DbUtil;

public class LoginDaoImpl implements LoginDao {
	private Session session=null;
	String hql=null;
	Query<User> query=null;
	
	

	
	 public List<User> getAllData(String userId, String password) {
	  session=DbUtil.getSessionFactory().openSession();
	  hql="from User where userId='"+userId+"'"; query=session.createQuery(hql);
	  List<User> list=query.list(); System.out.println(list); session.close();
	  
	  return list;
	  
	  }
	 



	public List<User> getData() {
		 session=DbUtil.getSessionFactory().openSession();
		 hql="from User";
		 query=session.createQuery(hql);
		 List<User> list=query.list();
		
		return list ;
	}
	
	
}
