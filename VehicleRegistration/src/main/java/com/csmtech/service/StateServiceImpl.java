package com.csmtech.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.csmtech.model.State;
import com.csmtech.repository.StateRepository;
@Service
public class StateServiceImpl implements StateService {
	@Autowired
	private StateRepository stateRepository;

	@Override
	public List<State> findData() {
		
		return  stateRepository.findAll();
	}

}
