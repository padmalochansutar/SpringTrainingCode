package com.csmtech.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.csmtech.module.Sales;
@Repository
public interface SalesRepository extends JpaRepository<Sales, Integer> {
    @Query(" select s.book.bookid,s.book.name,s.book.quantity from Sales s where s.library.libraryid=:libraryId")
	List<Object[]> findSalesBylibraryid(Integer libraryId);

}
