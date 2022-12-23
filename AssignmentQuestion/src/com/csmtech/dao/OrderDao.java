package com.csmtech.dao;

import java.util.List;

import com.csmtech.entity.OrderMaster;

public interface OrderDao {

	List<OrderMaster> getOrderBydate(String firstDate, String lastDate);

}
