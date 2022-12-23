package com.csmtech;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.protocol.Resultset;

public class JdbcPractice1 {

	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		 System.out.println("Enter an employee_id");
	    int b =  Integer.parseInt(br.readLine());
		// String b = br.readLine();
		
		 String sqlPlus = "Select employee_id,first_name,last_name,salary,department_id from employees";
		Connection con=null;
		Statement st=null;
		ResultSet rs=null;
		
          try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			 con=DriverManager.getConnection("jdbc:mysql://localhost:3306/hr","root","root");
			 st=con.createStatement();
			 rs= st.executeQuery(sqlPlus);
			 if(b>=100 && b<=206) {
				while(rs.next()) 
					
					 System.out.println(rs.getString(1)+"  "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getString(4)+" "+rs.getString(5));
			 }
				 
			 else {
				 System.out.println("no employee has? employee_id");
			 }
			 rs.close();
			 st.close();
			 con.close();
				  
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}

}
