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
	
	
	//private Integer bookid;
	
	//private Integer idlibraryid;
	
	
	private Integer squantity;
     @ManyToOne
     @JoinColumn(name="bookid")
	private Book book;
     
     @ManyToOne
     @JoinColumn(name="idlibraryid")
     private Library library;
     
     

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



	public Integer getSquantity() {
		return squantity;
	}



	public void setSquantity(Integer squantity) {
		this.squantity = squantity;
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



	@Override
	public String toString() {
		return "Sales [salesid=" + salesid + ", date=" + date + ", squantity=" + squantity + ", book=" + book
				+ ", library=" + library + "]";
	}

	
	
}
