package com.csmtech;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import com.csmtech.util.DbUtil;

public class JdbcPractice3 {

	public static void main(String[] args) {
		String h_date = null;
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter the hire date");
	    h_date=scn.nextLine();
		 
		String sqlPlus = "Select employee_id,last_name,job_id,department_id,hire_date from employees where hire_date='"+h_date+"'";
			Connection con=null;
			Statement st=null;
			ResultSet rs=null;
			try {
				System.out.println(DbUtil.getDbConnection());
				/*
				 * Class.forName("com.mysql.cj.jdbc.Driver");
				 * con=DriverManager.getConnection("jdbc:mysql://localhost:3306/hr","root",
				 * "root")
				 */;
				 st=DbUtil.getDbConnection().createStatement();
				 rs= st.executeQuery(sqlPlus);
				if(rs.next()==false)
					System.out.println("no record found");
				else {
					
				      do {
					 System.out.println(rs.getString(1)+"  "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getString(4)+" "+rs.getString(5));
				      } while(rs.next());
				      }
				rs.close();
				st.close();
				//con.close();
				DbUtil.closeDbConnection();
				System.out.println(DbUtil.getDbConnection());
			} catch ( SQLException e) {
				e.printStackTrace();
			}
			System.out.println();
	}

}
