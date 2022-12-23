package com.csmtech.util;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
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

}
