package com.csmtech;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

//import com.mysql.cj.protocol.x.SyncFlushDeflaterOutputStream;

public class JdbcUpdation {

	static Connection con = null;
	static Statement st = null;

	public static int insertBook() {
		Scanner sc = new Scanner(System.in);
		Scanner scn = new Scanner(System.in);
		// Scanner sc=null;
		// Scanner scn=null;
		String insertQuery = null;
		Character ch = null;

		System.out.println("Enter the book name,book price,book date");
		String bname = sc.nextLine();
		float bprice = scn.nextFloat();
		String bdate = sc.nextLine();
		insertQuery = "insert  into book1(book_name,book_price,book_date) values ('" + bname + "'," + bprice + ",'"
				+ bdate + "')";

		Integer noofRecAffected = 0;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "root");
			st = con.createStatement();
			noofRecAffected = st.executeUpdate(insertQuery);
			// System.out.println(con);
			if (noofRecAffected == 1)
				System.out.println("record saved");
			else
				System.out.println("record not saved");

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return noofRecAffected;
	}
	/*
	 * try { st.close(); con.close(); } catch (SQLException e) {
	 * e.printStackTrace(); } }
	 */

	public Integer updateBook() {
		Scanner sc = new Scanner(System.in);
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the book_id and book_name");
		int bid = scn.nextInt();
		String bname = sc.nextLine();
		int noofRecAffected = 0;
		String updateQuery = "update book1 set book_name='" + bname + "' where book_id=" + bid;
		System.out.println("update query is" + updateQuery);
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "root");
			st = con.createStatement();
			noofRecAffected = st.executeUpdate(updateQuery);
			System.out.println("After" + noofRecAffected);
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		try {
			st.close();
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return noofRecAffected;
	}

	public Integer deleteBook() {
		Scanner sc = new Scanner(System.in);
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the book_id to delete the record");
		int bid = scn.nextInt();
		// String bname=sc.nextLine();
		int noofRecAffected = 0;
		String deleteQuery = "delete from  book1 where book_id=" + bid;
		System.out.println("update query is" + deleteQuery);
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "root");
			st = con.createStatement();
			noofRecAffected = st.executeUpdate(deleteQuery);
			System.out.println("After" + noofRecAffected);
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		try {
			st.close();
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return noofRecAffected;
	}
	public void showData() {
	    String sql="select book_name from book1";
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "root");
			st = con.createStatement();
			ResultSet rs=st.executeQuery(sql);
			while(rs.next()) {
				System.out.println("Name of the Book is:"+rs.getString(1)+" book ");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		try {
			st.close();
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		Integer choice;
		JdbcUpdation jupdate = new JdbcUpdation();
		//jupdate.showData();
		do {
			Integer noofRecordAffected = 0;

			System.out.println("1.Insert Book\n2.Update Book\n3.Delete Book\n4.Read\n5.Exit");
			System.out.println("Enter ur choice[1...5]:");
			choice = s.nextInt();
			switch (choice) {
			case 1:
				noofRecordAffected = jupdate.insertBook();
				System.out.println(noofRecordAffected + "no of record(s) inserted");
				jupdate.showData();
				break;
			case 2:
				noofRecordAffected = jupdate.updateBook();
				System.out.println(noofRecordAffected + "no of record(s) updated");
				jupdate.showData();
				break;
			case 3:
				noofRecordAffected = jupdate.deleteBook();
				System.out.println(noofRecordAffected + "no of record(s) deleted");
				jupdate.showData();
				break;
			case 4:
				jupdate.showData();
				break;
			case 5:
				break;
			default:
				System.out.println("you have entered wrong input");
				break;

			}
		} while (choice != 5);

		try {
			st.close();
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
