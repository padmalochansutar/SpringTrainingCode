package com.csmtech.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.csmtech.model.Book;
@Repository
public interface BookRepository extends JpaRepository<Book, Integer> {
	 @Query("select quantity from Book where bookid=:data ")
	Integer findByQuqntity(Integer data);
	// @Modifying
  // @Query("update Book b set b.quantity=: book where b.bookid =:data")
	//void updateData(Book book, Integer data);

//	@Query("select bookid from Book where bookid=:bookid")
//	Integer getBybookid(@Param("bookid") Integer bookid);
   

	

}
