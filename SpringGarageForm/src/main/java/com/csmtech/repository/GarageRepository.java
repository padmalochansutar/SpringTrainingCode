package com.csmtech.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.csmtech.model.Garage;
public interface GarageRepository  extends JpaRepository<Garage, Integer>{

	public Optional<Garage> findById(Integer garageId);

}
