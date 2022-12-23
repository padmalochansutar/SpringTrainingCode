package com.csmtech.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class Product implements Serializable {
	@Id
	@Column(name="prodid")
	private Integer prodId;
	@Column(name="prodname")
	private String prodName;
	@Column(name="prodqty")
	private Integer prodQty;
	@Column(name="prodrate")
	private Double prodRate;
	public Integer getProdId() {
		return prodId;
	}
	public void setProdId(Integer prodId) {
		this.prodId = prodId;
	}
	public String getProdName() {
		return prodName;
	}
	public void setProdName(String prodName) {
		this.prodName = prodName;
	}
	public Integer getProdQty() {
		return prodQty;
	}
	public void setProdQty(Integer prodQty) {
		this.prodQty = prodQty;
	}
	public Double getProdRate() {
		return prodRate;
	}
	public void setProdRate(Double prodRate) {
		this.prodRate = prodRate;
	}
	@Override
	public String toString() {
		return "Product [prodId=" + prodId + ", prodName=" + prodName + ", prodQty=" + prodQty + ", prodRate="
				+ prodRate + "]";
	}
	

}
