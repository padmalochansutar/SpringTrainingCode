package com.csmtech.entity;

import java.io.Serializable;
import java.util.Date;

public class BookDto implements Serializable{
	 private Long bookId;
     private String bookName;
     private Double bookPrice;
     private Date bookDate;
	public Long getBookId() {
		return bookId;
	}
	public void setBookId(Long bookId) {
		this.bookId = bookId;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public Double getBookPrice() {
		return bookPrice;
	}
	public void setBookPrice(Double bookPrice) {
		this.bookPrice = bookPrice;
	}
	public Date getBookDate() {
		return bookDate;
	}
	public void setBookDate(Date bookDate) {
		this.bookDate = bookDate;
	}
	@Override
	public String toString() {
		return "BookDto [bookId=" + bookId + ", bookName=" + bookName + ", bookPrice=" + bookPrice + ", bookDate="
				+ bookDate + "]";
	}
     
}
