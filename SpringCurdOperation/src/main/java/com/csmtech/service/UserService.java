package com.csmtech.service;

import java.util.List;

import com.csmtech.model.User;

public interface UserService {
	User saveUserForm(User user);

	List<User> getData();

}
