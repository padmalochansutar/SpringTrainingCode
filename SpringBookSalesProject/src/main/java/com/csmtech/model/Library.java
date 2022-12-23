package com.csmtech.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
@Entity
public class Library implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="idlibraryid")
	private Integer idlibraryid;
	
	
	private String name;
	
	
	private String address;
	/*
	 * @ManyToMany(cascade = CascadeType.ALL)
	 * 
	 * @JoinTable(name="sales",joinColumns=@JoinColumn(name="bookid"),
	 * inverseJoinColumns = @JoinColumn(name="idlibraryid")) private List<Book>
	 * book;
	 */


	public Integer getIdlibraryid() {
		return idlibraryid;
	}


	public void setIdlibraryid(Integer idlibraryid) {
		this.idlibraryid = idlibraryid;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	@Override
	public String toString() {
		return "Library [idlibraryid=" + idlibraryid + ", name=" + name + ", address=" + address + "]";
	}


	
	

}
