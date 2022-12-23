package com.csmtech.service;

import java.util.List;

import com.csmtech.entity.BookDto;
import com.csmtech.entity.BookVo;

public interface BookService {
	//Insert the NEW book..
	Integer SaveBook(BookVo bookVo);
	//all record methods//read operation 
	List<BookVo> getAllBooks();
	//delete operation..
	Integer deleteBookById(Long bookId);
	//for only one particular record read
    BookVo getBookById(Long bookId);
	
}
