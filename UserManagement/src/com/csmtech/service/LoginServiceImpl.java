package com.csmtech.service;

import com.csmtech.dao.LoginDao;
import com.csmtech.dao.LoginDaoImpl;

public class LoginServiceImpl implements LoginService {
            private LoginDao logindao=null;
	@Override
	public String validateLogin(String userName, String password) {
		logindao=new LoginDaoImpl();
		Integer res=logindao.validateLogin(userName, password);
		if(res==0)
			return "user not found";
		else if(res==1)
			return "password incorrect";
		else
			return "sucessful login";
	}

}
