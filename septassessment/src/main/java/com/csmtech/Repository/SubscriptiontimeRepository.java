package com.csmtech.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.csmtech.Model.Subscriptiontime;
@Repository
public interface SubscriptiontimeRepository extends JpaRepository<Subscriptiontime, Long> {

	@Query("select price from Subscriptiontime where subid=:provider")
	Double getFees(Long provider);

}
