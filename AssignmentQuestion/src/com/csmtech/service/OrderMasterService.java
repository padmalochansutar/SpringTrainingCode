package com.csmtech.service;

import java.util.List;

import com.csmtech.entity.OrderMaster;

public interface OrderMasterService {



	List<OrderMaster> getOrderBydate(String firstDate, String lastDate);

}
