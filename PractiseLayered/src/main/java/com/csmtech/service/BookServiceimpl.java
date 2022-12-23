package com.csmtech.service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import com.csmtech.dao.BookDao;
import com.csmtech.dao.BookDaoImpl;
import com.csmtech.entity.BookDto;
import com.csmtech.entity.BookVo;

public class BookServiceimpl implements BookService{
    //insert operation data code
	@Override
	public Integer SaveBook(BookVo bookVo) {
		BookDto bookDto=new BookDto();
		SimpleDateFormat fm=new SimpleDateFormat("dd-mm-yyyy");
		if(bookVo.getBookId()!=null)//u
			bookDto.setBookId(Long.parseLong(bookVo.getBookId()));//u
		bookDto.setBookName(bookVo.getBookName());
		bookDto.setBookPrice(Double.parseDouble(bookVo.getBookPrice()));
		try {
			bookDto.setBookDate(fm.parse(bookVo.getBookDate()));
		} catch (ParseException e) {
			e.printStackTrace();
		}
		BookDao bookDao=new BookDaoImpl();
		return  bookDao.SaveBook(bookDto);
	}
     //All data read operation code
	//@Override
	
	  public List<BookVo> getAllBooks() { BookDao bookDao=new BookDaoImpl();
	  List<BookDto> bookListDto=bookDao.getAllBooks(); List<BookVo> bookListVo=new
	  ArrayList<BookVo>(); SimpleDateFormat fm=new SimpleDateFormat("dd-mm-yyyy");
	  for(BookDto bookDto:bookListDto) { BookVo bookVo=new BookVo();
	  bookVo.setBookId(bookDto.getBookId().toString());
	  bookVo.setBookName(bookDto.getBookName());
	  bookVo.setBookPrice(bookDto.getBookPrice().toString());
	  bookVo.setBookDate(fm.format(bookDto.getBookDate())); bookListVo.add(bookVo);
	  } return bookListVo; }
	 
	//for delete operation
	@Override
	public Integer deleteBookById(Long bookId) {
		BookDao bookDao=new BookDaoImpl();
		
		return bookDao.deleteBookById(bookId);
	}
	//for only one particular record read
	@Override
	public BookVo getBookById(Long bookId) {
		
		BookDao bookDao=new BookDaoImpl();
		BookDto bookDto=bookDao.getBookById(bookId);
		BookVo bookVo=null;
		if(bookDto!=null) {
		bookVo=new BookVo();
		SimpleDateFormat fm=new SimpleDateFormat("dd-mm-yyyy");
		  bookVo.setBookId(bookDto.getBookId().toString());
		  bookVo.setBookName(bookDto.getBookName());
		  bookVo.setBookPrice(bookDto.getBookPrice().toString());
		  bookVo.setBookDate(fm.format(bookDto.getBookDate()));
		}
		return bookVo;
	}
	
	}


