package com.csmtech.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
 @Entity
@Table(name="order_master")
public class OrderMaster  implements Serializable {
	@Id
	@Column(name="orderid")
	private Long orderId;
	@Column(name="orderdate")
	private Date orderDate;
	@Column(name="prodid")
	private Long prodId;
	@Column(name="orderqty")
	private Integer orderQty;
	public Long getOrderId() {
		return orderId;
	}
	public void setOrderId(Long orderId) {
		this.orderId = orderId;
	}
	public Date getOrderDate() {
		return orderDate;
	}
	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}
	public Long getProdId() {
		return prodId;
	}
	public void setProdId(Long prodId) {
		this.prodId = prodId;
	}
	public Integer getOrderQty() {
		return orderQty;
	}
	public void setOrderQty(Integer orderQty) {
		this.orderQty = orderQty;
	}
	@Override
	public String toString() {
		return "OrderMaster [orderId=" + orderId + ", orderDate=" + orderDate + ", prodId=" + prodId + ", orderQty="
				+ orderQty + "]";
	}
	

}
