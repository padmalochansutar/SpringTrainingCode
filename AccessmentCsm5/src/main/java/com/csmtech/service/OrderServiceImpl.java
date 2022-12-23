package com.csmtech.service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import com.csmtech.dao.OrderDao;
import com.csmtech.dao.OrderDaoImpl;
import com.csmtech.entity.OrderDto;
import com.csmtech.entity.OrderVo;

public class OrderServiceImpl implements OrderService{

	@Override
	public Integer SaveOrder(OrderVo orderVo) {
		
		
			SimpleDateFormat fm=new SimpleDateFormat("dd/MM/yyyy");
			OrderDto orderDto=new OrderDto();
			
			try {
				orderDto.setOrderDate(fm.parse(orderVo.getOrderDate()));
			} catch (ParseException e) {
				e.printStackTrace();
			}
			orderDto.setQty(Long.parseLong(orderVo.getQty()));
			
			OrderDao orderDao=new OrderDaoImpl();	
			
			return orderDao.SaveOrder(orderDto);
		}


	@Override
	public Integer updateOrder(OrderVo orderVo) {
		
		SimpleDateFormat fm=new SimpleDateFormat("dd/MM/yyyy");
		OrderDto orderDto=new OrderDto();
		
		orderDto.setProductId(orderVo.getProductId());
		try {
			orderDto.setOrderDate(fm.parse(orderVo.getOrderDate()));
		} catch (ParseException e) {
			e.printStackTrace();
		}
         orderDto.setQty(Long.parseLong(orderVo.getQty()));
		
	     OrderDao orderDao=new  OrderDaoImpl();	
		
		return OrderDao.updateOrder(orderDto);
	}


	@Override
	public List<OrderVo> getAllDisplay() {
		SimpleDateFormat fm = null;
		OrderService orderService = new  OrderServiceImpl();
		OrderDao orderDao = new OrderDaoImpl();
		List<OrderDto> orderListDto=orderDao.getAllDisplay();
		List<OrderVo> orderListVo = null;
		if(orderListDto != null) {
			fm = new SimpleDateFormat("dd-MM-yyyy");
		    orderListVo =  new ArrayList<OrderVo>();
			for (OrderDto orderDto : orderDto) {
			     OrderVo orderVo = new    OrderVo();
			       orderVo.setProductId(orderDto.getProductId().toString());
			       orderVo.setOrderDate(fm.format(orderDto.getOrderDate()));
			       orderVo.setQty(orderDto.getQty().toString());

			    orderListVo.add(orderVo);

			}
		}

		return empListVo;
	}

	

}

