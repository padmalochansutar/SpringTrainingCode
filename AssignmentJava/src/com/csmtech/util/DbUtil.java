package com.csmtech.util;

import org.hibernate.Session;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.csmtech.entity.Dept;
import com.csmtech.entity.Desig;
import com.csmtech.entity.Emp;
import com.csmtech.entity.Salary;




public class DbUtil {

	private static Configuration cnf;
	private static SessionFactory sessionfactory;

	public static SessionFactory getSessionFactory() {
		if (sessionfactory == null) {
			cnf = new Configuration();
			cnf.addAnnotatedClass(Dept.class);
			cnf.addAnnotatedClass(Desig.class);
			cnf.addAnnotatedClass(Emp.class);
			cnf.addAnnotatedClass(Salary.class);
			
			sessionfactory = cnf.buildSessionFactory();

		}
		return sessionfactory;
	}

	
}
