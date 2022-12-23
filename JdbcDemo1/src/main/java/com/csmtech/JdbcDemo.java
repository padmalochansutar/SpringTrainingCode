package com.csmtech;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcDemo {

	public static void main(String[] args) {
		String sqlQuery="Select employee_id,last_name,email,salary,job_id,hire_date,department_id from employees where department_id=50";
		Connection con=null;
		Statement st=null;
		ResultSet rs=null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");//the driver is loaded into jvm byusing jdbc
			
				 con=DriverManager.getConnection("jdbc:mysql://localhost:3306/hr","root","root");
				 st=con.createStatement();
			     rs=st.executeQuery(sqlQuery);
				while(rs.next()) {
				      System.out.println(rs.getString(1)+"  "+rs.getString(2)+"     "+rs.getString(3)+"   "+rs.getString(4)+"  "+rs.getString(5)+"  "+rs.getString(6)+"  "+rs.getString(7));
				}
				rs.close();
				st.close();
				con.close();
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}

}
