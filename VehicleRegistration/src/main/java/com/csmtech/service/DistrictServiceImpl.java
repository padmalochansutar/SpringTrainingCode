package com.csmtech.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.csmtech.model.District;
import com.csmtech.repository.DistrictRepository;
@Service
public class DistrictServiceImpl implements DistrictService {
	@Autowired
	private DistrictRepository districtRepository;

	@Override
	public List<District> findDistData() {
	
		return districtRepository.findAll();
	}

}
