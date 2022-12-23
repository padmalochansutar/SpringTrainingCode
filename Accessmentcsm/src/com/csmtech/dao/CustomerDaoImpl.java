package com.csmtech.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.query.Query;

import com.csmtech.entity.Customer;
import com.csmtech.util.DbUtil;

public class CustomerDaoImpl implements CustomerDao {
	private Session session=null;
	private  Query query=null;
	@Override
	public List<Customer> getAllNames() {
		session=DbUtil.getSessionFactory().openSession();
		query=session.createQuery("from Customer");
		List<Customer> custList=query.list();
		session.close();
		return custList;
		
		
	}

	public Customer getCustomerById(Integer custId) {
		
		return DbUtil.getSessionFactory().openSession().get(Customer.class, custId);
	}

}
