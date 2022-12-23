package com.csmtech.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.csmtech.model.Book;
import com.csmtech.model.Library;
import com.csmtech.model.Sales;
@Repository
public interface SalesRepository extends JpaRepository<Sales, Integer> {
//    // @Query("select s.library.idlibraryid , s.book.name,s.squantity from Sales s where s.library.idlibraryid=:t and s.book.name=:bookData")
//	//List<Object[]> findAll(Library t, Book bookData);
////     @Query("  from Sales s  where s.library.idlibraryid =:lid ")
////	Sales findData(Integer lid);
////    @Query("select Sales s from s.library.idlibraryid where idlibraryid =:t ")
////	Sales findSalesByLibraryId(Library t);
//	 @Query("select s.library.idlibraryid , s.book.name,s.squantity from Sales s where s.library.idlibraryid=:ldata and s.book.bookid=:bdata")
//	List<Object[]> findAll(Integer ldata, Integer bdata);

}
