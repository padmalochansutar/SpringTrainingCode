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
	public void fetchData(User user) {
		System.out.println("service data:"+user);
		userRepository.save(user);
		
	}
	@Override
	public User findNum(Long num) {
		
		return userRepository.findByMobileno(num);
	}
	@Override
	public List<User> allData() {
	
		return userRepository.findAll();
	}
	@Override
	public User findByMobileNo(Long number) {
		
		return userRepository.findByMobileno(number);
	}
	
}
