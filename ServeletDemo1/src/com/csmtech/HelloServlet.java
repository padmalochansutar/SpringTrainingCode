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

import org.apache.jasper.runtime.ProtectedFunctionMapper;

public class HelloServlet extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// resp.getWriter().println("Hello Servlet");
		resp.setContentType("text/html");
		PrintWriter pw = resp.getWriter();
		pw.println("HELLO :-" + req.getParameter("name"));
		pw.println("CGPA:-" + req.getParameter("cgpa"));
		pw.println("DATE OF ADMISSION:-" + req.getParameter("doa"));
		pw.println(" Which Course :-" + req.getParameter("course"));
		pw.println("Branch:-" + req.getParameter("branch"));
		pw.println("Education is so far:-" );
		String[] edus=req.getParameterValues("edu");
		pw.println(Arrays.toString(edus).substring(1,Arrays.toString(edus).length()-1));

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/practise", "root", "root");
			PreparedStatement ps = con.prepareStatement("insert into student1(name,cgpa,doa,course,branch,edu) values (?,?,?,?,?,?)");
			ps.setString(1, req.getParameter("name").trim());
			ps.setDouble(2, Double.parseDouble(req.getParameter("cgpa").trim()));
			ps.setString(3, req.getParameter("doa").trim());
			ps.setString(4, req.getParameter("course").trim());
			ps.setString(5, req.getParameter("branch").trim());
			ps.setString(6,Arrays.toString(edus).substring(1,Arrays.toString(edus).length()-1));
			pw.println(ps.executeUpdate()+" records saved");
			pw.println("<a href='http:localhost:8080/ServeletDemo1'>home</a>");
			ps.close();
			con.close();
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}

}
