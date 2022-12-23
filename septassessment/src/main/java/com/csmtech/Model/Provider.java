package com.csmtech.Model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
@Entity
@Getter
@Setter
@ToString
public class Provider implements Serializable {
	@Id
	private Long proid;
	private String name;
	
}
