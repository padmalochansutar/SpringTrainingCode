package com.csmtech.entity;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.ValueGenerationType;



@Entity
@Table(name="book1")//class label annotation
public class Book implements Serializable {
	
//	@Id
//	@GeneratedValue(strategy=GenerationType.IDENTITY)
//	@Column(name="bookid")
//	private Long bookId;
//	
//	@Column(name="bookname")//annotation
//	private String bookName;
//	public Long getBookId() {
//		return bookId;
//	}
//	public void setBookId(Long bookId) {
//		this.bookId = bookId;
//	}
//	public String getBookName() {
//		return bookName;
//	}
//	public void setBookName(String bookName) {
//		this.bookName = bookName;
//	}
//	@Override
//	public String toString() {
//		return "Branch [bookId=" + bookId + ", bookName=" + bookName + "]";
//	}
//	
@Id
@Column(name="book_id")
@GeneratedValue(strategy=GenerationType.IDENTITY)
private  Long bookId;

@Column(name="book_name")
private String bookName;

@Column(name="book_price")
private Double bookPrice;

@Column(name="book_date")
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
	return "Book1 [bookId=" + bookId + ", bookName=" + bookName + ", bookPrice=" + bookPrice + ", bookDate=" + bookDate
			+ "]";
}



}
