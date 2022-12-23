package com.csmtech.service;

import java.util.List;

import com.csmtech.dao.OrderDao;
import com.csmtech.dao.OrderDaoImpl;
import com.csmtech.entity.OrderMaster;

public class OrderMasterServiceImpl implements OrderMasterService {

	@Override
	public List<OrderMaster> getOrderBydate(String firstDate, String lastDate) {
		OrderDao orderDao=new OrderDaoImpl();
		return orderDao.getOrderBydate(firstDate,lastDate);
	}

}
