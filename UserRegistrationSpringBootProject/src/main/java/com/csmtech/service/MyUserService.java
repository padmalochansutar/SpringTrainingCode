package com.csmtech.service;

import java.util.List;

import com.csmtech.model.MyUser;

public interface MyUserService {
	MyUser saveUser(MyUser myUser);

	List<MyUser> getAllActiveUsers();

	Integer deleteUser(Integer userId);

	MyUser updateUser(Integer userId);

	

	
	

}
