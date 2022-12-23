package com.csmtech.Model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@Entity
@Table(name="connection_master")
public class Connection implements Serializable {

	@Id
	@Column(name="connection_id")
	private Integer connectionid;
	
	@Column(name="connection_speed")
	private String speed;
	
	@Column(name="provider_id")
	private Integer providerid;
	
	@Column(name="fees")
	private String fees;
}
