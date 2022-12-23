package com.csmtech.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import com.csmtech.entity.OrderDto;
import com.csmtech.entity.OrderVo;
import com.csmtech.util.DbUtil;

public class OrderDaoImpl  implements OrderDao{
	private final static String addOrderQuery="insert into order_details(product_id,order_date,qty) values(?,?,?,?)";
	private final static String selectQuery="select product_name,order_date,quantity from order_details";
	private Connection con=null;
	private PreparedStatement ps=null;
	private Statement stm = null;
	private ResultSet rs = null; 
	Integer noOfRecAff=0;
		
	@Override
	public Integer SaveOrder(OrderDto orderDto) {
		con=DbUtil.getDbConnection();
		try {
			ps=con.prepareStatement(addOrderQuery);
			ps.setLong(1, orderDto.getProductId());
			ps.setDate(2, new java.sql.Date(orderDto.getOrderDate().getTime()));
			ps.setLong(3, orderDto.getQty());
			noOfRecAff=ps.executeUpdate();
			ps.close();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		DbUtil.closeDbConnection();
		return noOfRecAff;
	}

	@Override
	public Integer updateOrder(OrderDto orderDto) {
		
		return null;
	}

	@Override
	public List<OrderDto> getAllDisplay() {
		con=DbUtil.getDbConnection();
		List<OrderDto> orderListDto=new ArrayList<OrderDto>();
		SimpleDateFormat fm=new SimpleDateFormat();
		try {
			stm=con.createStatement();
			rs=stm.executeQuery(selectQuery);
			if(rs.next()!=false)
				
				do {
					OrderDto bd=new   OrderDto();
					
					
					bd.setProductId(rs.getLong(1));					
					bd.setOrderDate(new java.util.Date(rs.getDate(2).getTime()));
					bd.setQty(rs.getLong(3));
					
				orderListDto.add(bd);
					
				}while(rs.next());			
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return orderListDto;
	}
	

}
