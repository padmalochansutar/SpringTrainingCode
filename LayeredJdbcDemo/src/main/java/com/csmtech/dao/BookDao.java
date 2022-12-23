package com.csmtech.dao;

import com.csmtech.entity.BookDto;

public interface BookDao {
	Integer saveBook(BookDto bookDto);

	Integer deleteBookById(Long bookId);
	}

