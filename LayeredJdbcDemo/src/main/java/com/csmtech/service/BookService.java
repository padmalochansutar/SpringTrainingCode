package com.csmtech.service;

import java.awt.List;

import com.csmtech.entity.BookVo;

public interface BookService {
	Integer saveBook(BookVo bookvo);
	List getAllBooks();
	Integer deleteBookById(Long bookId);

}
