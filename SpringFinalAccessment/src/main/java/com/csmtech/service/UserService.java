package com.csmtech.service;

import java.util.List;

import com.csmtech.model.User;

public interface UserService {

	void fetchData(User user);

	User findNum(Long num);

	List<User> allData();

	User findByMobileNo(Long number);

	

	

}
