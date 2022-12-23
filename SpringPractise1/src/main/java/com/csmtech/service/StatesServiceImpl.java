package com.csmtech.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.csmtech.model.States;
import com.csmtech.repository.StatesRepository;
@Service
public class StatesServiceImpl implements StatesService {
	@Autowired
	private StatesRepository statesRepository;

	@Override
	public List<States> getAlldata() {
		
		return statesRepository.findAll();
	}

}
