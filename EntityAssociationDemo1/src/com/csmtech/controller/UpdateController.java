package com.csmtech.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;

import com.csmtech.entity.Student;
import com.csmtech.util.DbUtil;

public class UpdateController extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Session session=DbUtil.getSessionFactory().openSession();
		req.setAttribute("upstudent", session.get(Student.class, Long.parseLong(req.getParameter("rollNo"))));
		req.getRequestDispatcher("./getstudentInfo").forward(req, resp);
		
		
	}

}
