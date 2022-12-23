package com.csmtech.runner;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class GetRecords {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		//System.out.println("Enter the book avg price");
		//String data=scn.next().toUpperCase();
		//double startAvg=scn.nextDouble();
		//System.out.println("Enter the book End avg price");
		//double endAvg=scn.nextDouble();
		//System.out.println("Enter the book date[yyyy-mm-dd]");
		//String date=scn.nextLine();
		//date="'"+date+"'";
		//convert into value as required for the SqlQuery
		   //data="'"+data+"'";
		// String getQuery="select book_id,book_name,book_price,book_date from book1";
		//String selectQuery="select book_name,book_date from book1";
		//String sQuery="select book_id,book_price,book_date,book_name from book1 where book_name="+data;
		 // String pQuery="select book_name  from book1 where book_price>="+startAvg+" and book_price<="+endAvg;
		  String query ="select book_name from book1 where book_price>="+500+" or book_price<="+700;
		  // String pQuery="select book_name  from book1 where book_date="+date;
		  Connection con = null;
		Statement st = null;
		ResultSet rs = null;
		// Load jdbc driver class
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			// Establish the connection
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "root");
			// Create a jdbc statement
			st = con.createStatement();//send the input to the database
			//System.out.println(sQuery);
			// send and execute sql Select query
			rs = st.executeQuery(query);
			  boolean isRsEmpty=true;//if enter data isnot in database then true go to if condition and show the output.. 
				while (rs.next() ) {
					isRsEmpty=false;
					
				//System.out.println(rs.getString(1) + " " + rs.getString(2) + " " + rs.getString(3) + " " + rs.getString(4));
			
			   // System.out.println(rs.getString(1)+"  "+rs.getString(2));
				//System.out.println(rs.getString(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getString(4));
			    System.out.println(rs.getString(1));
				}
				
				
		    if(isRsEmpty) {
		    	//System.out.println(isRsEmpty);
		    	System.out.println("no records found");
		    }
		    else {System.out.println("records displayed");}
			
			rs.close();
			st.close();
			con.close();
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}

}
