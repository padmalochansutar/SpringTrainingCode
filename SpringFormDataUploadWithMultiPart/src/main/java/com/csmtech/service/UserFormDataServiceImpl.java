package com.csmtech.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.csmtech.model.UserFormData;
import com.csmtech.repository.UserFormDataRepository;

@Service
public class UserFormDataServiceImpl implements UserFormDataService {
	@Autowired
	private UserFormDataRepository userFormDataRepository ;

	@Override
	public UserFormData saveUserFormData(UserFormData userFormData) {
		return userFormDataRepository.save(userFormData); 
		 
	}

	@Override
	public List<UserFormData> getAllData() {
		
		return userFormDataRepository.findAll() ;
	}

}
