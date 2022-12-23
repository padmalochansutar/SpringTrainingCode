package com.csmtech.entity;

import java.io.Serializable;
import java.util.Date;

public class StoreData implements Serializable {
	private String prodName;
	private Date orderDate;
	private Integer orderQty;
	private double orderValue;
	public String getProdName() {
		return prodName;
	}
	public void setProdName(String prodName) {
		this.prodName = prodName;
	}
	public Date getOrderDate() {
		return orderDate;
	}
	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}
	public Integer getOrderQty() {
		return orderQty;
	}
	public void setOrderQty(Integer orderQty) {
		this.orderQty = orderQty;
	}
	public double getOrderValue() {
		return orderValue;
	}
	public void setOrderValue(double orderValue) {
		this.orderValue = orderValue;
	}
	@Override
	public String toString() {
		return "StoreData [prodName=" + prodName + ", orderDate=" + orderDate + ", orderQty=" + orderQty
				+ ", orderValue=" + orderValue + "]";
	}
	

}
