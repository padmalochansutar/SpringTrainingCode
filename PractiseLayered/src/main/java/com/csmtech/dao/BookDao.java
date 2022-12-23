package com.csmtech.dao;

import java.util.List;

import com.csmtech.entity.BookDto;
import com.csmtech.entity.BookVo;

public interface BookDao {
	//BookDao connection with BookDto
	//for insert operation
	Integer SaveBook(BookDto bookDto);
	//for read operation
	List<BookDto> getAllBooks();
	//delete operation
	Integer deleteBookById(Long bookId);
	//for only one record read
	BookDto getBookById(Long bookId);
}
