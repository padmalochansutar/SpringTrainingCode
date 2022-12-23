package com.csmtech.dbutil;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.csmtech.entity.Branch;
import com.csmtech.entity.Course;
import com.csmtech.entity.Department;
import com.csmtech.entity.Employees;
import com.csmtech.entity.Location;
import com.csmtech.entity.Scholarship;
import com.csmtech.entity.Student;



public class DbUtil {
	private static Configuration cfg;
	private static SessionFactory sessionFactory;
	
	public static SessionFactory getSessionFactory() {
		if(sessionFactory == null) {
			cfg = new Configuration();
//			cfg.addAnnotatedClass(Branch.class);
//			cfg.addAnnotatedClass(Scholarship.class);
//			cfg.addAnnotatedClass(Student.class);
//			cfg.addAnnotatedClass(Course.class);
			cfg.addAnnotatedClass(Employees.class);
			cfg.addAnnotatedClass(Department.class);
			cfg.addAnnotatedClass(Location.class);
			
			sessionFactory = cfg.buildSessionFactory();
			
		}
		
		
		return sessionFactory;
		
	}

}
