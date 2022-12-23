package com.csmtech.util;

import org.hibernate.Session;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.csmtech.entity.Branch;
import com.csmtech.entity.Scholarship;
import com.csmtech.entity.Student;






public class DbUtil {

	private static Configuration cnf;
	private static SessionFactory sessionfactory;

	public static SessionFactory getSessionFactory() {
		if (sessionfactory == null) {
			cnf = new Configuration();
			cnf.addAnnotatedClass(Branch.class);
			cnf.addAnnotatedClass(Scholarship.class);
			cnf.addAnnotatedClass(Student.class);
			sessionfactory = cnf.buildSessionFactory();
            
		}
		return sessionfactory;
	}

	
}
