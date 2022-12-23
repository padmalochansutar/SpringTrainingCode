package com.csmtech.model;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
@Entity
@Table(name = "subscription_master")
public class Subscription implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="subscription_id")
	private Integer subscriptionId;
	@Column(name="subscription_type")
	private String subscriptionType;
	private Double fees;
	 @ManyToOne(cascade= CascadeType.ALL)
	 @JoinColumn(name="library_id")
	 private Library library;
	public Integer getSubscriptionId() {
		return subscriptionId;
	}
	public void setSubscriptionId(Integer subscriptionId) {
		this.subscriptionId = subscriptionId;
	}
	public String getSubscriptionType() {
		return subscriptionType;
	}
	public void setSubscriptionType(String subscriptionType) {
		this.subscriptionType = subscriptionType;
	}
	public Double getFees() {
		return fees;
	}
	public void setFees(Double fees) {
		this.fees = fees;
	}
	public Library getLibrary() {
		return library;
	}
	public void setLibrary(Library library) {
		this.library = library;
	}
	@Override
	public String toString() {
		return "Subscription [subscriptionId=" + subscriptionId + ", subscriptionType=" + subscriptionType + ", fees="
				+ fees + ", library=" + library + "]";
	}
	 
}
