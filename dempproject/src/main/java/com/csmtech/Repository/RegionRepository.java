package com.csmtech.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.csmtech.Entity.Region;
@Repository
public interface RegionRepository extends JpaRepository<Region, Long> {

}
