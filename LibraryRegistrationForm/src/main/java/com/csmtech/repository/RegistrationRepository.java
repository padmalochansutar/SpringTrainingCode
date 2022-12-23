package com.csmtech.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.csmtech.model.Registration;
@Repository
public interface RegistrationRepository extends CrudRepository<Registration, Integer> {
	@Query("From Registration where isDelete='No'")
	List<Registration> findAllByIsDelete();

	@Query("From Registration r where r.library.libraryId=:libraryId ")
	List<Registration> getNameById(Integer libraryId);
	
    @Query("From Registration  r where r.library. libraryId=:libraryId")
	List<Registration> findByLibraryId(Integer libraryId);
    @Query("From Registration  r where r.subscription.subscriptionId=:sId")
	List<Registration> findBySubId(Integer sId);
    @Query("From Registration  r where r.library. libraryId=:libraryId AND r.subscription.subscriptionId=:sId ")
	List<Registration> findBylibAndSubId(Integer libraryId, Integer sId);

}
