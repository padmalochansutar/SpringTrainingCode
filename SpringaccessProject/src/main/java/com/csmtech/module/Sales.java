package com.csmtech.module;

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
	@ManyToOne
	@JoinColumn(name="bookid")
	private Book book;
	@ManyToOne
	@JoinColumn(name="idlibraryid")
	private Library library;
	
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

	public Book getBook() {
		return book;
	}

	public void setBook(Book book) {
		this.book = book;
	}

	public Library getLibrary() {
		return library;
	}

	public void setLibrary(Library library) {
		this.library = library;
	}

	public Integer getSquantity() {
		return squantity;
	}

	public void setSquantity(Integer squantity) {
		this.squantity = squantity;
	}

	@Override
	public String toString() {
		return "Sales [salesid=" + salesid + ", date=" + date + ", book=" + book + ", library=" + library
				+ ", squantity=" + squantity + "]";
	}
	
	
	
	
	
	

}
