package com.csmtech.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.csmtech.model.Locations;

public interface LocationsRepository extends JpaRepository<Locations, Long> {

}
