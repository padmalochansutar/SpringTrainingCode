package com.csmtech.service;

import com.csmtech.dao.UserDao;
import com.csmtech.dao.UserDaoImpl;
import com.csmtech.entity.User;

public class UserServiceImpl implements UserService {

	@Override
	public void saveData(User user) {
		UserDao userDao=new UserDaoImpl();
		userDao.saveData(user);
		
	}

}
