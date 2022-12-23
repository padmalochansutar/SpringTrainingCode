package com.csmtech.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class LoginDaoImpl implements LoginDao {
       private Connection con=null;
       private PreparedStatement ps=null;
       private ResultSet rs=null;
	@Override
	public Integer validateLogin(String userName, String password)  {
		Integer status=null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			 con=DriverManager.getConnection("jdbc:mysql://localhost:3306/test1","root","root");
			 ps=con.prepareStatement("select user_name,password  from user where user_name=?");
			 ps.setString(1,  userName);
			 rs=ps.executeQuery();
			 if(rs.next()==false) {
				 status= 0;
			 }
			 else {
				 if(rs.getString(2).equals(password))
					 status= 2;
				 else
					 status=1;
			 }
			 rs.close();
			 ps.close();
			 con.close();
			 
			 
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		
		return status;
		
	}

}
