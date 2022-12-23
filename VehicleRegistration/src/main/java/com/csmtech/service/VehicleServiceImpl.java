package com.csmtech.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.csmtech.model.Vehicle;
import com.csmtech.repository.VehicleRepository;
@Service
public class VehicleServiceImpl implements VehicleService {
	@Autowired
	private VehicleRepository vehicleRepository;

	@Override
	public void saveData(Vehicle vehicle) {
		
		vehicleRepository.save(vehicle);
	}

}
