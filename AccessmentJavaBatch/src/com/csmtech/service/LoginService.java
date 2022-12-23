package com.csmtech.service;

import java.util.List;

import com.csmtech.entity.User;

public interface LoginService {

	List<User> getLogin(String userId, String password);

	List<User> getData();

	

}
