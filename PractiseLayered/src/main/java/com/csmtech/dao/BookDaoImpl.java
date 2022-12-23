 package com.csmtech.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import com.csmtech.entity.BookDto;
import com.csmtech.util.DbUtil;

public class BookDaoImpl implements BookDao {
	   Integer noOfRecAffected=0;
       private Connection con=null;
       private PreparedStatement st=null;
       private Statement stm=null;
       private ResultSet rs=null;
       private static final String insertQuery="insert into book1(book_name,book_price,book_date) values(?,?,?)";
       private static final String readQuery="select book_id ,book_name,book_price,book_date from book1";
       private static final String deleteQuery="delete from book1 where book_id=? ";
       //for only one particular record read
       private final static String getBookByIdQuery="select book_id,book_name,book_price,book_date from book1 where book_id=?";
       //update Query
       private final static String updateBookByIdQuery="update book1 set book_name=?,book_price=?,book_date=? where book_id=?";
       
       //for insert operation
       @Override
	public Integer SaveBook(BookDto bookDto) {
		con=DbUtil.getDbConnection();
		try {
			if(bookDto.getBookId()!=null) {
				st=con.prepareStatement(updateBookByIdQuery);
				st.setLong(4, bookDto.getBookId());
			}
			else 
				//st=con.prepareStatement(insertQuery); 
			
			st=con.prepareStatement(insertQuery);
			st.setString(1, bookDto.getBookName());
			st.setDouble(2, bookDto.getBookPrice());
			st.setDate(3,new java.sql.Date( bookDto.getBookDate().getTime()));
			noOfRecAffected=st.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		try {
			st.close();
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		//DbUtil.closeDbConnection();
		
		return noOfRecAffected;
	}
       //for read operation..
	@Override
	public List<BookDto> getAllBooks() {
		con=DbUtil.getDbConnection();
		List<BookDto> bookListDto=new ArrayList<BookDto>();// this object for get allbooks
		SimpleDateFormat fm=new SimpleDateFormat("dd-mm-yyyy");
		try {
			stm=con.createStatement();
			rs=stm.executeQuery(readQuery);
			if(rs.next()!=false)
				
				do {
					BookDto bd=new BookDto();
					bd.setBookId(rs.getLong(1));
					bd.setBookName(rs.getString(2));
					bd.setBookPrice(rs.getDouble(3));
					bd.setBookDate(new java.util.Date(rs.getDate(4).getTime()));
					
					
					bookListDto.add(bd);//it is used to store book data//bookListDto is list of BookDto
					
				}while(rs.next());
				
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		DbUtil.closeDbConnection();
	
		return bookListDto;//it will send the data to service
	}
	@Override
	public Integer deleteBookById(Long bookId) {
		
		con=DbUtil.getDbConnection();
		 Integer noOfRecAffected=0;
		 try {
			st=con.prepareStatement(deleteQuery);
		    st.setLong(1, bookId);
		    noOfRecAffected=st.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		 DbUtil.closeDbConnection();
		return  noOfRecAffected;
	}
	//for only one particular record read
	@Override
	public BookDto getBookById(Long bookId) {
		con=DbUtil.getDbConnection();
		BookDto bd=null;
		try {
			st=con.prepareStatement(getBookByIdQuery);
			st.setLong(1, bookId);
			rs=st.executeQuery(); 
			if(rs.next()!=false) {
				bd=new BookDto();
				bd.setBookId(rs.getLong(1));
				bd.setBookName(rs.getString(2));
				bd.setBookPrice(rs.getDouble(3));
				bd.setBookDate(new java.util.Date(rs.getDate(4).getTime()));
				
			}
			rs.close();
			st.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		DbUtil.closeDbConnection();
		return bd;
	}

}
