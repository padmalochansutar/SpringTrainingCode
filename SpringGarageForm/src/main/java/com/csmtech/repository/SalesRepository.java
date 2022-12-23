package com.csmtech.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.csmtech.model.Sales;

public interface SalesRepository extends JpaRepository<Sales, Integer> {

	
    @Query("select s.garageId,s.typeId,s.salesQuantity,s.salesDate from Sales s where garageId=:garageId and typeId=:typeId2")
	  public  List<Object[]> findByGarageIdAndTypeId(Integer garageId, Integer typeId2);

}
