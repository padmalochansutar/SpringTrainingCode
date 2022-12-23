package com.csmtech.model;

import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

import lombok.Data;




@Data
@Entity
public class User {
	
	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    @Column(name="user_Id")
	    private Integer userId;
	     
	    private String email;
	     
	    private String password;
	     
	 
	    private String fullName;
	         
	    private boolean enabled;
	     
	    @ManyToMany(cascade = CascadeType.ALL)
	    @JoinTable( name = "users_roles",joinColumns = @JoinColumn(name = "user_Id"), inverseJoinColumns = @JoinColumn(name = "role_Id")   )
	           
	    private List<Role> roles;       
	           
	         
	 
	 
	    // constructors, getter and setters are not shown for brevity
	}


