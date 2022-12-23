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
	public List<User>checkLogin(String uName, String password) {
		return userRepository.findIdPwd(uName,password);

	}

	@Override
	public void saveAllData(User user) {
		userRepository.save(user);
		
	}

	@Override
	public Object findData() {
		
		return userRepository.findAll();
	}

	@Override
	public User updateUs(Long userId) {
		return userRepository.findById(userId).get();
		 
	}

	@Override
	public void deleteUs(Long userId) {
		
		 userRepository.deleteById(userId);
	}

	

}
