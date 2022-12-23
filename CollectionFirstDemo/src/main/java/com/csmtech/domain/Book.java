package com.csmtech.domain;

import java.io.Serializable;

public class Book implements Comparable<Book>, Serializable {
	private Integer isbn;
	private String title;
	private String publisher;
	private Double price;
	
	
	
	public Book() {
		
	}
	
	public Book(Integer isbn, String title, String publisher, Double price) {
		super();
		this.isbn = isbn;
		this.title = title;
		this.publisher = publisher;
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
	public String getPublisher() {
		return publisher;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Book [isbn=" + isbn + ", title=" + title + ", publisher=" + publisher + ", price=" + price + "]";
	}
	public int compareTo(Book o) {
		return this.price.intValue()-o.price.intValue();
	}

	

}
