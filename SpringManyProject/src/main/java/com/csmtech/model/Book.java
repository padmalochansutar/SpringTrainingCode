package com.csmtech.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
@Entity
public class Book implements Serializable {
	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY)
	private Integer bookid;
	
	private String name;
	
	private Integer quantity;
	@Column(name="unit_price")
	private Double uprice;
	
	
	public Book(String name, Integer quantity) {
		super();
		this.name = name;
		this.quantity = quantity;
	}
	public Book() {
		
	}
	public Integer getBookid() {
		return bookid;
	}
	public void setBookid(Integer bookid) {
		this.bookid = bookid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getQuantity() {
		return quantity;
	}
	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}
	public Double getUprice() {
		return uprice;
	}
	public void setUprice(Double uprice) {
		this.uprice = uprice;
	}
	@Override
	public String toString() {
		return "Book [bookid=" + bookid + ", name=" + name + ", quantity=" + quantity + ", uprice=" + uprice + "]";
	}
	
	
	
	
	
	
	

}
