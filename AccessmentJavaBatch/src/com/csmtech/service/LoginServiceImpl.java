package com.csmtech.service;

import java.util.List;

import com.csmtech.dao.LoginDaoImpl;


import com.csmtech.entity.User;
import com.csmtech.service.LoginService;

public  class LoginServiceImpl implements LoginService {

	@Override
	public List<User> getData() {
		
		return new LoginDaoImpl().getData();
	}

	@Override
	public List<User> getLogin(String userId, String password) {
		
		return new LoginDaoImpl().getAllData(userId,password);
	}
}


		
	

	
	
	

	


