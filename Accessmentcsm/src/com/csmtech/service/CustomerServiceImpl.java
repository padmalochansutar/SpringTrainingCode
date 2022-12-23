package com.csmtech.service;

import java.util.List;

import com.csmtech.dao.CustomerDaoImpl;
import com.csmtech.dao.CustomerDaoImpl;
import com.csmtech.entity.Customer;

public class CustomerServiceImpl implements CustomerService {

	@Override
	public List<Customer> getAllNames() {
		return new CustomerDaoImpl().getAllNames();
	}

	public Customer getCustomerById(Integer custId) {
		
		return new CustomerDaoImpl().getCustomerById(custId);
	}

}
