package com.csmtech.service;

import com.csmtech.model.User;

public interface RegistationService {

	User saveUser(User user);
	User fetchUserByEmailId(String email);
	User fetchUserByPassword(String tempPassword);
	
	User fetchUserByEmailIdAndPassword(String email, String password);
}
