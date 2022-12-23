package com.csmtech.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.csmtech.model.Countries;
import com.csmtech.repository.CountriesRepository;
@Service
public class CountriesServiceImpl implements CountriesService {

	@Autowired
	private CountriesRepository countriesRepository; 
	
	@Override
	public List<Countries> getAllCountries() {
		
		return countriesRepository.findAll();
	}

}
