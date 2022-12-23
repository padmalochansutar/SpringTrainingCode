package com.csmtech;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Arrays;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class StudentDetails extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		
		PrintWriter pw=resp.getWriter();
		pw.println("<h2>name:</h2>"+req.getParameter("name"));
		pw.println("cgpa"+req.getParameter("cgpa"));
		pw.println("date"+req.getParameter("date"));
		pw.println("course"+req.getParameter("course"));
		pw.println("branch"+req.getParameter("branch"));
		pw.println("Education is so far....");
		String[] edus=req.getParameterValues("edu");
		pw.println(Arrays.toString(edus).substring(1,Arrays.toString(edus).length()-1));
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test3", "root", "root");
			PreparedStatement ps=con.prepareStatement("insert into studentdetails(sname,scgpa,sdate,scourse,sbranch,sedu)values(?,?,?,?,?,?)");
			ps.setString(1,req.getParameter("name") );
			ps.setDouble(2, Double.parseDouble(req.getParameter("cgpa")));
			ps.setString(3,req.getParameter("date"));
			ps.setString(4,req.getParameter("course"));
			ps.setString(5, req.getParameter("branch"));
			ps.setString(6, Arrays.toString(edus).substring(1,Arrays.toString(edus).length()-1));
			int rs=ps.executeUpdate();
			if(rs!=0) {
				pw.println("1 records inserted");
			}
			else {
				pw.println("1 record not inserted");
			}
			pw.println(" <a href=\"./getAllStudent\" style='color:red'>View All Student</a>");
			pw.println("<a href=\"search.html\"><h2>Search id</h2></a>");
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		
	}

}
