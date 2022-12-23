package com.csmtech;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class GetAllStudent extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		PrintWriter pw=resp.getWriter();
		pw.println("<h2 style='color:blue'>Students Information</h2>");
		pw.println("<table border=1>"+"<thead>"+"<tr>"+"<th>sid</th><th>sname</th><th>scgpa</th><th>sdate</th><th>scourse</th><th>sbranch</th><th>sedu</th>"+"</tr>"+"</thead>"+"<tbody>");
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test3", "root", "root");
			Statement st=con.createStatement();
			String query="select*from studentdetails";
			ResultSet rs=st.executeQuery(query);
			if(rs.next()==false) {
				pw.println("no record found");
			}
			else {
				do {
					
						pw.println("<tr><td>"+rs.getLong(1)+"</td><td> "+rs.getString(2)+"</td><td> "+rs.getDouble(3)+"</td><td> "+rs.getString(4)+"</td><td> "+rs.getString(5)+"</td><td> "+rs.getString(6)+"</td><td> "+rs.getString(7)+"</td></tr>" );
					
				}while(rs.next());
				pw.println("</tbody>"+"</table>");
				pw.println("<a href=\"AddStudent.html\"><h2>Add Student</h2></a>");
			}
				
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		
	}

}
