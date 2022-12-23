package com.csmtech.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.csmtech.model.User;
import com.csmtech.repository.RegistationRepository;

@Service
public class RegistationServiceImpl implements RegistationService {
	@Autowired
	private RegistationRepository registationRepository;

	@Override
	public User saveUser(User user) {
		
		return registationRepository.save(user);
	}
    public User fetchUserByEmailId(String email) {
    	return registationRepository.findByEmailId(email);
    }
	@Override
	public User fetchUserByPassword(String tempPassword) {
		return registationRepository.findByPassword(tempPassword);
	}
	@Override
	public User fetchUserByEmailIdAndPassword(String email, String password) {
		return registationRepository.findByEmailIdAndPassword(email,password);
		
		
	}
}
