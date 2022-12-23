package com.csmtech.dao;

import java.util.List;

import com.csmtech.entity.OrderDto;
import com.csmtech.entity.OrderVo;

public interface OrderDao {

	Integer SaveOrder(OrderDto orderDto);

	 Integer updateOrder(OrderDto orderDto);

	List<OrderDto> getAllDisplay();
}
