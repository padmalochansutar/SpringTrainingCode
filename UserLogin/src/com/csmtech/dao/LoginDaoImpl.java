package com.csmtech.dao;

import java.util.List;

import org.apache.jasper.tagplugins.jstl.core.ForEach;
import org.hibernate.Session;

import org.hibernate.query.Query;

import com.csmtech.entity.User;
import com.csmtech.util.DbUtil;

public class LoginDaoImpl implements LoginDao {
	Session session=null;
	String hql;
   Integer data;
   Query<User> query=null;
@Override
public Integer getLogin(String uName, String uPwd) {
	session=DbUtil.getSessionFactory().openSession();

	session.get(User.class, 1l);
	hql="from User where userName='"+uName+"'";
	 query=session.createQuery(hql);
	 
	 
	List<User>list=query.list();
	System.out.println(list);
	if(list==null) {
		data=0;
	}
	
	else {
		if(uPwd.equals(list))
		{
			data=1;
		}
		else {
			data=2;
		}
		
	}
	
	return data;
	
	
}
	
		
		
	}

	


