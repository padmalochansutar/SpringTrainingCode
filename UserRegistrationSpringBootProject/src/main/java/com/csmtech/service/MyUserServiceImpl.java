package com.csmtech.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.csmtech.model.MyUser;
import com.csmtech.repository.MyUserRepository;//inject in repository
@Service
public class MyUserServiceImpl implements MyUserService {
	@Autowired
	private MyUserRepository myUserRepository;

	@Override
	public MyUser saveUser(MyUser myUser) {
		myUser.setIsActive(true);
		return myUserRepository.save(myUser);
	}

	@Override
	public List<MyUser> getAllActiveUsers() {
		
		return  myUserRepository.findAllActiveUsers();
	}

	@Override
	public Integer deleteUser(Integer userId) {
		return myUserRepository.deleteUser(userId);
	}

	@Override
	public MyUser updateUser(Integer userId) {
		
		return  myUserRepository.findById(userId).get();
	}

	
	
	

}
