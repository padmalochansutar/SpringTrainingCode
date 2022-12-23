package com.csmtech.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.csmtech.Entity.TempReg;
@Repository
public interface TempRegRepository extends JpaRepository<TempReg, Long> {

}
