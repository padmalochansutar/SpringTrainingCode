package com.csmtech.util;

import org.hibernate.Session;


import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;




import com.csmtech.entity.Department;

import com.csmtech.entity.Employees;
import com.csmtech.entity.Locations;








public class DbUtil {

	private static Configuration cnf;
	private static SessionFactory sessionfactory;

	public static SessionFactory getSessionFactory() {
		if (sessionfactory == null) {
			cnf = new Configuration();
		//	cnf.addAnnotatedClass(Branch.class);
			//cnf.addAnnotatedClass(Scholarship.class);
			//cnf.addAnnotatedClass(Student.class);
			//cnf.addAnnotatedClass(Course.class);
			
			cnf.addAnnotatedClass(Employees.class);
			cnf.addAnnotatedClass(Department.class);
			cnf.addAnnotatedClass(Locations.class);
			sessionfactory = cnf.buildSessionFactory();
            
		}
		return sessionfactory;
	}

	
}
