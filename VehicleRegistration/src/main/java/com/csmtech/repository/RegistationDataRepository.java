package com.csmtech.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.csmtech.model.RegistationData;
@Repository
public interface RegistationDataRepository extends JpaRepository<RegistationData, Long> {
    @Query("from RegistationData where mobileno=:mno and password=:pwd")
	List<RegistationData> findIdpwd(Long mno, String pwd);

}
