package com.csmtech;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ConnectionDemo {

	public static void main(String[] args) {
		String sqlplus="Select hire_date from employees";
		Connection con=null;
		Statement st=null;
		ResultSet rs=null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/hr","root","root");
			st=con.createStatement();
			rs=st.executeQuery(sqlplus);
			if(con!=null)
			{
				System.out.println("connection is established..");
				while(rs.next()) 
					System.out.println("current date is"+ rs.getDate(1));
				
			}
			else {
				System.out.println("connection is not established...");
			}
			System.out.println(con);
			System.out.println("connection successfully..");
			rs.close();
			st.close();
			con.close();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
