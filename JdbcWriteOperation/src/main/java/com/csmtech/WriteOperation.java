package com.csmtech;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class WriteOperation {

	public static void main(String[] args) {
		Connection con=null;
		Statement st=null;
		Scanner sc=new Scanner(System.in);
		Scanner scn=new Scanner(System.in);
		String insertQuery=null;
	    Character ch=null;	
	
			do {
		System.out.println("Enter the book name,book price,book date");
		String bname=sc.nextLine();
		float bprice=scn.nextFloat();
		String bdate=sc.nextLine();
		 insertQuery= "insert  into book1(book_name,book_price,book_date) values ('"+bname+"',"+bprice+",'"+bdate+"')";
		
		Integer noofRecAffected=0;
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				con=DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","root");
				st=con.createStatement();
				noofRecAffected=st.executeUpdate(insertQuery);
				//System.out.println(con);
				if(noofRecAffected==1) 
					System.out.println("record saved");
				else
					System.out.println("record not saved");
				
				
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			} catch (SQLException e) {
				e.printStackTrace();
			}
				System.out.println("do you want to add more[y/n]");
				 ch = sc.nextLine().charAt(0);
			}while(ch!='y');
			
			try {
				st.close();
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			
			}
}

			
			
	
