package com.csmtech.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

import com.csmtech.entity.BookDto;
import com.csmtech.util.DbUtil;

public class BookDaoImpl implements BookDao {

	private Connection con=null;
	private PreparedStatement st=null;
	private final static String insertQuery="insert into book1(book_name,book_date,book_price) values(?,?,?)";
	private final static String deleteQuery="delete from book1 where book_id=?";
	@Override
	public Integer saveBook(BookDto bookDto) {
		Integer noOfRecAffected=0;
		con=DbUtil.getDbConnection();
		try {
			st=con.prepareStatement(insertQuery);
			st.setString(1, bookDto.getBook_name());
			st.setDate(2, new java.sql.Date(bookDto.getBook_date().getTime()));
			st.setDouble(3, bookDto.getBook_price());
			noOfRecAffected=st.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		try {
			st.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		DbUtil.closeDbConnection();
		return noOfRecAffected;
	}
	Integer noOfRecAffected=0;
	public Integer deleteBookId(Long bookId ) {
		con=DbUtil.getDbConnection();
		
		try {
			st=con.prepareStatement(deleteQuery);
			st.setLong(1,bookId);
			noOfRecAffected=st.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return noOfRecAffected;
	}
	@Override
	public Integer deleteBookById(Long bookId) {
		return noOfRecAffected;
	}

}
