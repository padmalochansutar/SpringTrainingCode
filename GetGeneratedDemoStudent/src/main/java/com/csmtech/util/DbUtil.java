package com.csmtech.util;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class DbUtil {
	  
	private static  Properties  properties;
	
	  
	static{
		try {
		    properties=new Properties();
			properties.load(new FileReader("src/main/resources/db.properties"));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	public static Connection con;
      public static Connection getDbConnection() {
    	if(con==null) {  
    	  try {
			Class.forName(properties.getProperty("driver_class_name"));
			con=DriverManager.getConnection(properties.getProperty("url"),properties.getProperty("user_name"),properties.getProperty("password"));
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
      public static String getRollNo() {
    	  Connection con = DbUtil.getDbConnection();
  		PreparedStatement ps = null;
  		ResultSet rs = null;
  		try {
  			// automatic id generated in id_generator
  			ps=con.prepareStatement("insert into id_generator values()", Statement.RETURN_GENERATED_KEYS);
  			ps.executeUpdate();
  			rs = ps.getGeneratedKeys();
 
  			long key;
			if (rs.next())
  				System.out.println(key=rs.getLong(1));

  		} catch (SQLException e) {
  			e.printStackTrace();
  		}
		return null;
      }

}
