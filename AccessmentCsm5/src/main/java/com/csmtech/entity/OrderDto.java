package com.csmtech.entity;

import java.util.Date;

public class OrderDto {
	 private  Long orderId;
     private Long productId;
     private Date orderDate;
     private Long  qty;
	public Long getOrderId() {
		return orderId;
	}
	public void setOrderId(Long orderId) {
		this.orderId = orderId;
	}
	public Long getProductId() {
		return productId;
	}
	public void setProductId(Long productId) {
		this.productId =productId ;
	}
	public Date getOrderDate() {
		return orderDate;
	}
	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}
	public Long getQty() {
		return qty;
	}
	public void setQty(Long qty) {
		this.qty = qty;
	}
	@Override
	public String toString() {
		return "OrderDto [orderId=" + orderId + ", productId=" + productId + ", orderDate=" + orderDate + ", qty=" + qty
				+ "]";
	}
     
}
