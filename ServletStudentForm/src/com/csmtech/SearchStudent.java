package com.csmtech;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SearchStudent extends HttpServlet {
       @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    	resp.setContentType("text/html");
    	PrintWriter pw=resp.getWriter();
    	Long sId=Long.parseLong(req.getParameter("sId"));
    	pw.println("<h2 style='color:yellow'>particular student details</h2>");
    	pw.println("<table border=1>"+"<thead>"+"<tr>"+"<td>sid</td><td>sname</td><td>scgpa</td><td>sdate</td><td>scourse</td><td>sbranch</td><td>sedu</td>"+"</tr>"+"</thead>"+"<tbody>"); 
       try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test3", "root", "root");
		
		
		PreparedStatement ps=con.prepareStatement("select sid,sname,scgpa,sdate,scourse,sbranch,sedu from studentdetails where sid=?");
		ps.setLong(1, sId);
		ResultSet rs=ps.executeQuery();
		
		if(rs.next()==false) {
			pw.println("no record found");
		}
		
		else {
			do {
			
				
					pw.println("<tr><td>"+rs.getLong(1)+"</td><td> "+rs.getString(2)+"</td><td> "+rs.getDouble(3)+"</td><td> "+rs.getString(4)+"</td><td> "+rs.getString(5)+"</td><td> "+rs.getString(6)+"</td><td> "+rs.getString(7)+"</td></tr>" );
			}while(rs.next());
			pw.println("</tbody>"+"</table>");
			pw.println("<a href='index.html'>HOME</a>");
			}
			
			
		
		
	} catch (ClassNotFoundException | SQLException e) {
		e.printStackTrace();
	}
		
}
}     
 
