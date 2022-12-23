package com.csmtech.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.csmtech.model.Subscription;
@Repository
public interface SubscriptionRepository extends CrudRepository<Subscription, Integer> {
	@Query("From Subscription where library.libraryId=:sId")
	List<Subscription> allSubscriptionList(Integer sId);
	
	@Query("select fees From Subscription where subscriptionId=:fId")
	Double getCostByCid(Integer fId);

}
