package com.csmtech.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.csmtech.model.Registation;
import com.csmtech.repository.RegistationRepository;

@Service
public class RegistationServiceImpl implements RegistationService {
	@Autowired
     private RegistationRepository registationRepository;

	@Override
	public void fetchData(Registation rg) {
		registationRepository.save(rg);
		
	}

	@Override
	public List<Registation> findData() {
		
		return registationRepository.findAll();
	}

	@Override
	public List<Registation> searchData(Integer id) {
		return registationRepository.findAll(id);
		
	}
     
     
}
