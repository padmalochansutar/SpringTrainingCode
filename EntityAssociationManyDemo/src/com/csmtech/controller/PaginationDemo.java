package com.csmtech.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class PaginationDemo extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setAttribute("pageNo", Integer.parseInt(req.getParameter("pageNo")));
		
		req.getRequestDispatcher("./getstudentInfo").forward(req, resp);
	}

}
