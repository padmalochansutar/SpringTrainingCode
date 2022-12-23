package com.csmtech.service;

import java.util.List;

import com.csmtech.entity.OrderVo;

public interface OrderService {
     Integer SaveOrder(OrderVo orderVo);
     Integer updateOrder(OrderVo orderVo);
     List<OrderVo> getAllDisplay();
     Integer deleteorder(Long );
	
}
