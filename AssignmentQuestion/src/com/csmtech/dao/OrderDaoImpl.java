package com.csmtech.dao;


import java.io.PrintWriter;
import java.util.List;


import org.hibernate.Session;
import org.hibernate.query.Query;

import com.csmtech.entity.OrderMaster;
import com.csmtech.entity.ProductMaster;
import com.csmtech.util.DbUtil;

public class OrderDaoImpl implements OrderDao {
	Session session=null;
	 String hql;
     Query<OrderMaster> query;

	@Override
	public List<OrderMaster> getOrderBydate(String firstDate, String lastDate) {
		session=DbUtil.getSessionFactory().openSession();
		hql=(" from OrderMaster where orderDate BETWEEN '"+firstDate+"' AND '"+lastDate+"'");
		query=session.createQuery(hql);
		List<OrderMaster> orderList=query.list();
		session.close();
		return orderList;
		
	}

	

}
