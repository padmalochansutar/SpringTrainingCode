package com.csmtech.util;

import org.hibernate.Session;




import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.csmtech.entity.User;



public class DbUtil {

	private static Configuration cnf;
	private static SessionFactory sessionfactory;

	public static SessionFactory getSessionFactory() {
		if (sessionfactory == null) {
			cnf = new Configuration();
			
			cnf.addAnnotatedClass(User.class);
			
			sessionfactory = cnf.buildSessionFactory();

		}
		return sessionfactory;
	}

	
}
