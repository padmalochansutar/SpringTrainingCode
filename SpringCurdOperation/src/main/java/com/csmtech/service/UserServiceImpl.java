package com.csmtech.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.csmtech.model.User;
import com.csmtech.repository.UserRepository;
@Service
public class UserServiceImpl implements UserService {
	@Autowired
	private UserRepository userRepository;

	@Override
	public User saveUserForm(User user) {
		
		return userRepository.save(user);
	}

	@Override
	public List<User> getData() {
		return userRepository.findAll();
	}

}
