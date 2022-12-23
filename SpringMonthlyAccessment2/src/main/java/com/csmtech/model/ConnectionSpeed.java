package com.csmtech.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.Data;
@Data
@Entity
public class ConnectionSpeed {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer connectionId;
	private String connectionName;
	
	private Double fees;
	@ManyToOne
	@JoinColumn(name="providerId")
	private ServiceProvider serviceProvider;

}
