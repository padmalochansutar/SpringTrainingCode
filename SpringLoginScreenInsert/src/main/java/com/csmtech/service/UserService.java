package com.csmtech.service;

import java.util.List;

import com.csmtech.model.User;

public interface UserService {

	List<User> checkLogin(String uName, String password);

	void saveAllData(User user);

	Object findData();

	User updateUs(Long userId);

	void deleteUs(Long userId);

}
