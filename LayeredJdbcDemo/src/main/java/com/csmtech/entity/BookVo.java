package com.csmtech.entity;

public class BookVo {
	private String book_id;
	private String book_name;
	private String book_price;
	private String book_date;
	public String getBook_id() {
		return book_id;
	}
	public void setBook_id(String book_id) {
		this.book_id = book_id;
	}
	public String getBook_name() {
		return book_name;
	}
	public void setBook_name(String book_name) {
		this.book_name = book_name;
	}
	public String getBook_price() {
		return book_price;
	}
	public void setBook_price(String book_price) {
		this.book_price = book_price;
	}
	public String getBook_date() {
		return book_date;
	}
	public void setBook_date(String book_date) {
		this.book_date = book_date;
	}
	@Override
	public String toString() {
		return "BookVo [book_id=" + book_id + ", book_name=" + book_name + ", book_price=" + book_price + ", book_date="
				+ book_date + "]";
	}
	

}
