package com.csmtech;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class GetAllStudents extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		PrintWriter pw = resp.getWriter();
		pw.println("<h2 style='color:red'>Students Information</h2>");
		pw.println("<table border=1>" + "<thead>" + "<tr>"
				+ "<th>rollno</th><th>name</th><th>cgpa</th><th>doa</th><th>course</th><th>branch</th><th>edu</th>"
				+ "</tr>" + "</thead>" +"<tbody>");
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/practise", "root", "root");
			PreparedStatement ps = con.prepareStatement("select rollno,name,cgpa,doa,course,branch,edu from student1");
			ResultSet rs = ps.executeQuery();
			if (rs.next() == false) {
				pw.println("no record found");
			} else {
				do {
					pw.println("<tr><td>"+rs.getLong(1) + "</td><td> " + rs.getString(2) + "</td><td> " + rs.getDouble(3) + "</td><td> " + rs.getString(4)
							+ "</td><td> " + rs.getString(5) + "</td><td> " + rs.getString(6) + "</td><td> " + rs.getString(7) + "</td></tr>");

				} while (rs.next());
				pw.println("</tbody>"+"</table>");
				pw.println("<a href='index.html'>home</a>");
			}
			rs.close();
			ps.close();
			con.close();
			pw.close();
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}

	}

}
