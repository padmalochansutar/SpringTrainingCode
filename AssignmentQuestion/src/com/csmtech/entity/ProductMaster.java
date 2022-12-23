package com.csmtech.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name = "product_master")
public class ProductMaster implements Serializable {
	@Id
	@Column(name="prodid")
	private Long prodId;
	@Column(name="prodname")
	private String prodName;
	@Column(name="prodrate")
	private Double prodRate;
	@Column(name="prodqty")
	private Integer prodQty;
	public Long getProdId() {
		return prodId;
	}
	public void setProdId(Long prodId) {
		this.prodId = prodId;
	}
	public String getProdName() {
		return prodName;
	}
	public void setProdName(String prodName) {
		this.prodName = prodName;
	}
	public Double getProdRate() {
		return prodRate;
	}
	public void setProdRate(Double prodRate) {
		this.prodRate = prodRate;
	}
	public Integer getProdQty() {
		return prodQty;
	}
	public void setProdQty(Integer prodQty) {
		this.prodQty = prodQty;
	}
	@Override
	public String toString() {
		return "product_master [prodId=" + prodId + ", prodName=" + prodName + ", prodRate=" + prodRate + ", prodQty="
				+ prodQty + "]";
	}
	

}
