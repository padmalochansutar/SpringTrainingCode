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
public class Subscriptiontime implements Serializable {
@Id
private Long subid;
private String time;
private Double price;

}


