package com.csmtech.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.csmtech.Entity.Registation;
@Repository
public interface RegistrationRepository extends JpaRepository<Registation, Long> {
	@Query("from Registation where regid=:regid")
	Registation findByUserId(Long regid);
	@Query("FROM Registation r where r.id=:id")
	List<Registation> getNameById(Long id);
	@Query("FROM Registation r where r.facultyname=:facultyname")
	Registation findByfacultyname(String facultyname);
	
	@Query("FROM Registation r where r.facultyaddress=:facultyaddress")
	Registation findByfacultyaddress(String facultyaddress);
	

}
