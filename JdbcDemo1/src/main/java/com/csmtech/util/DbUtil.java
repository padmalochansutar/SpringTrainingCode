package com.csmtech.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbUtil {//factory method..
      public static Connection con=null;
      public static Connection getDbConnection() {
    	if(con==null) {  
    	  try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/hr","root","root");
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
    	}
		return con;
			
      }
      public static void closeDbConnection() {
    	  if(con==null) {
    		  try {
				con.close();
				con=null;
			} catch (SQLException e) {
				e.printStackTrace();
			}
    	  }
	
      }

}
