package com.csmtech.entity;

public class OrderVo {
      private String orderId;
      private String productId;
      private String orderDate;
      private String qty;
	public String getOrderId() {
		return orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}
	public String getProductId() {
		return productId;
	}
	public void setProductId(String productId) {
		this.productId = productId;
	}
	public String getOrderDate() {
		return orderDate;
	}
	public void setOrderDate(String orderDate) {
		this.orderDate = orderDate;
	}
	public String getQty() {
		return qty;
	}
	public void setQty(String qty) {
		this.qty = qty;
	}
	@Override
	public String toString() {
		return "OrderVo [orderId=" + orderId + ", productId=" + productId + ", orderDate=" + orderDate + ", qty=" + qty
				+ "]";
	}
      
}
