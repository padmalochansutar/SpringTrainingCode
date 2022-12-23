package com.csmtech.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.csmtech.model.District;
@Repository
public interface DistrictRepository extends JpaRepository<District, Long> {

}
