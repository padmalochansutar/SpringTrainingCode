package com.csmtech.domain;

import java.io.Serializable;

public class Book implements Serializable {
	private Integer isbn;
	private String title;
	private Double price;
	
	
	
	public Book(Integer isbn, String title, Double price) {
		super();
		this.isbn = isbn;
		this.title = title;
		this.price = price;
	}
	public Integer getIsbn() {
		return isbn;
	}
	public void setIsbn(Integer isbn) {
		this.isbn = isbn;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Book [isbn=" + isbn + ", title=" + title + ", price=" + price + "]";
	}
	
	
}