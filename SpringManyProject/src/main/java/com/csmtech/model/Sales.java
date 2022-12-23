package com.csmtech.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
@Entity
public class Sales implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer salesid;
	
	private Date date;
	
	
	private Integer bookid;
	
	private Integer idlibraryid;
	
	
	private Integer squantity;


	public Integer getSalesid() {
		return salesid;
	}


	public void setSalesid(Integer salesid) {
		this.salesid = salesid;
	}


	public Date getDate() {
		return date;
	}


	public void setDate(Date date) {
		this.date = date;
	}


	public Integer getBookid() {
		return bookid;
	}


	public void setBookid(Integer bookid) {
		this.bookid = bookid;
	}


	public Integer getIdlibraryid() {
		return idlibraryid;
	}


	public void setIdlibraryid(Integer idlibraryid) {
		this.idlibraryid = idlibraryid;
	}


	public Integer getSquantity() {
		return squantity;
	}


	public void setSquantity(Integer squantity) {
		this.squantity = squantity;
	}


	@Override
	public String toString() {
		return "Sales [salesid=" + salesid + ", date=" + date + ", bookid=" + bookid + ", idlibraryid=" + idlibraryid
				+ ", squantity=" + squantity + "]";
	}



     

	
	
	
}
