package com.csmtech.dao;



import org.hibernate.Session;
import org.hibernate.Transaction;

import com.csmtech.entity.Sales;
import com.csmtech.util.DbUtil;

public class SalesDaoImpl implements SalesDao {
	Session session=null;
	@Override
	public void saveSales(Sales sales) {
		 session=DbUtil.getSessionFactory().openSession();
		 Transaction tx=session.beginTransaction();
		  session.save(sales);
		 tx.commit();
		 session.close();
	}

}
