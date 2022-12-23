package com.csmtech.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.csmtech.Model.User;
@Repository
public interface UserRepository extends JpaRepository<User, Long> {
	@Query("FROM User r where r.provider.proid=:providerid and r.subscriptiontime.subid=:subscription")
	List<User> getNameById(Long providerid, Long subscription);
	@Query("From User where id=:id")
	User getApplicantByapplicantId(Long id);
	
	

}
