package com.csmtech.service;

import java.awt.List;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import com.csmtech.dao.BookDao;
import com.csmtech.dao.BookDaoImpl;
import com.csmtech.entity.BookDto;
import com.csmtech.entity.BookVo;

public class BookServiceImpl implements BookService {

	@Override
	public Integer saveBook(BookVo bookvo) {
		BookDto bookDto=new BookDto();
		SimpleDateFormat fm=new SimpleDateFormat("dd-MM-yyyy");
		bookDto.setBook_name(bookvo.getBook_name());
		try {
			bookDto.setBook_date(fm.parse(bookvo.getBook_date()));
		} catch (ParseException e) {
			e.printStackTrace();
		}
		bookDto.setBook_price(Double.parseDouble(bookvo.getBook_price()));
		
		BookDao bookDao=new BookDaoImpl();		
		return bookDao.saveBook(bookDto);
	}

	
    public Integer deleteBookById(Long bookId ) {
	BookDao bookDao=new BookDaoImpl();
	return bookDao.deleteBookById(bookId);
}


	@Override
	public List getAllBooks() {
		// TODO Auto-generated method stub
		return null;
	}
	
}