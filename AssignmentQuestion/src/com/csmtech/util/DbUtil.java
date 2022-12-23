package com.csmtech.util;

import org.hibernate.Session;



import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.csmtech.entity.OrderMaster;
import com.csmtech.entity.ProductMaster;
import com.csmtech.entity.StoreData;

public class DbUtil {

	private static Configuration cnf;
	private static SessionFactory sessionfactory;

	public static SessionFactory getSessionFactory() {
		if (sessionfactory == null) {
			cnf = new Configuration();
			
			cnf.addAnnotatedClass(ProductMaster.class);
			cnf.addAnnotatedClass(OrderMaster.class);
			cnf.addAnnotatedClass(StoreData.class);
			
			sessionfactory = cnf.buildSessionFactory();

		}
		return sessionfactory;
	}

	
}
