package com.csmtech.runner;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Insert {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Scanner scn=new Scanner(System.in);
		Character ch= null;
		Connection con=null;
		Statement st=null;
		
		
		do {
		//System.out.println("Enter the dept_id");
		//String bname=sc.nextLine();
		System.out.println("Enter the book_price");
		double bPrice=scn.nextDouble();
		System.out.println("Enter the book_date");
		String bDate=sc.nextLine();
		Integer noOfRecAffected=0;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","root");
			st=con.createStatement();
			String insertQuery="insert into book1(book_name,book_price,book_date) values('"+bname+"',"+bPrice+",'"+bDate+"')";
			noOfRecAffected=st.executeUpdate(insertQuery);
			if(noOfRecAffected==1)
				System.out.println("1 records saved");
			else
				System.out.println("Records not Saved");
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		System.out.println("Do you want to add more[y/n]");
		  ch=scn.nextLine().charAt(0);
		}while(ch!='y');
		try {
			st.close();
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}

}
