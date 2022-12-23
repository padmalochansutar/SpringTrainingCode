package com.csmtech;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class jdbcPracice2 {

	public static void main(String[] args) {
		 String sqlPlus = "Select employee_id,last_name,salary,salary*12 from employees  ";
			Connection con=null;
			Statement st=null;
			ResultSet rs=null;
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				con=DriverManager.getConnection("jdbc:mysql://localhost:3306/hr","root","root");
				 st=con.createStatement();
				 rs= st.executeQuery(sqlPlus);
				 while(rs.next()) {
					 System.out.println(rs.getString(1)+"  "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getString(4));
				 }
			} catch (ClassNotFoundException | SQLException e) {
				e.printStackTrace();
			}
	}
}

			 
			

