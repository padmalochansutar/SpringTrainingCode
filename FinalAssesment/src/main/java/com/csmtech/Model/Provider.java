package com.csmtech.Model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@Entity
@Table(name="provider_master")
public class Provider implements Serializable {
	
	@Id
	@Column(name="provider_id")
	private Integer providerid;
	
	@Column(name="provider_name")
	private String name;
}
