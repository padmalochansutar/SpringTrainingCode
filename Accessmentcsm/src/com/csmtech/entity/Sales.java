package com.csmtech.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class Sales implements Serializable {
	 @Id
     @GeneratedValue(strategy = GenerationType.IDENTITY)
	 @Column(name="slno")
	private Integer slNo;
	 @Column(name="sdate") 
	private Date sDate;
	 @Column(name="custid")
	private String custId;
	 @Column(name="prodid") 
	private Integer prodId;
	@Column(name="sqty")
	private Integer sQty;
	@Column(name="srate")
	private Double sRate;
	@Column(name="samount")
	private Double sAmount;
	public Integer getSlNo() {
		return slNo;
	}
	public void setSlNo(Integer slNo) {
		this.slNo = slNo;
	}
	public Date getsDate() {
		return sDate;
	}
	public void setsDate(Date sDate) {
		this.sDate = sDate;
	}
	public String getCustId() {
		return custId;
	}
	public void setCustId(String custId) {
		this.custId = custId;
	}
	public Integer getProdId() {
		return prodId;
	}
	public void setProdId(Integer prodId) {
		this.prodId = prodId;
	}
	public Integer getsQty() {
		return sQty;
	}
	public void setsQty(Integer sQty) {
		this.sQty = sQty;
	}
	public Double getsRate() {
		return sRate;
	}
	public void setsRate(Double srate) {
		this.sRate = srate;
	}
	public Double getsAmount() {
		return sAmount;
	}
	public void setsAmount(Double sAmount) {
		this.sAmount = sAmount;
	}
	@Override
	public String toString() {
		return "Sales [slNo=" + slNo + ", sDate=" + sDate + ", custId=" + custId + ", prodId=" + prodId + ", sQty="
				+ sQty + ", sRate=" + sRate + ", sAmount=" + sAmount + "]";
	}
	
	

}
