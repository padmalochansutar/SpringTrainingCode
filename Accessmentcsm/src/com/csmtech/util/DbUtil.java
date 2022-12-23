package com.csmtech.util;

import org.hibernate.Session;


import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.csmtech.entity.Customer;
import com.csmtech.entity.Product;
import com.csmtech.entity.Sales;



public class DbUtil {

	private static Configuration cnf;
	private static SessionFactory sessionfactory;

	public static SessionFactory getSessionFactory() {
		if (sessionfactory == null) {
			cnf = new Configuration();
			cnf.addAnnotatedClass(Customer.class);
			cnf.addAnnotatedClass(Product.class);
			cnf.addAnnotatedClass(Sales.class);
			
			sessionfactory = cnf.buildSessionFactory();

		}
		return sessionfactory;
	}

	
}
