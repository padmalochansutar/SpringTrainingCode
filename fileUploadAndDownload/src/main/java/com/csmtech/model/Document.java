package com.csmtech.model;

import java.util.Arrays;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;

@Entity
@Table(name = "document")
public class Document {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer document_id;
	
	private String document_name;
	
	private String document_type;
	@Column(name="document_data")
	@Lob
	private byte[] file;
	public Integer getDocument_id() {
		return document_id;
	}
	public void setDocument_id(Integer document_id) {
		this.document_id = document_id;
	}
	public String getDocument_name() {
		return document_name;
	}
	public void setDocument_name(String document_name) {
		this.document_name = document_name;
	}
	public String getDocument_type() {
		return document_type;
	}
	public void setDocument_type(String document_type) {
		this.document_type = document_type;
	}
	public byte[] getFile() {
		return file;
	}
	public void setFile(byte[] file) {
		this.file = file;
	}
	@Override
	public String toString() {
		return "Document [document_id=" + document_id + ", document_name=" + document_name + ", document_type="
				+ document_type + ", file=" + Arrays.toString(file) + "]";
	}
	
	

}
