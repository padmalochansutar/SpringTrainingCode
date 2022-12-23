package com.csmtech.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.csmtech.service.OrderMasterService;
import com.csmtech.service.OrderMasterServiceImpl;
import com.csmtech.util.DbUtil;

public class FrontController extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PrintWriter pw = resp.getWriter();
		pw.println(DbUtil.getSessionFactory().openSession().createQuery("from ProductMaster").list());
		if (req.getServletPath().equals("/date")) {

			
			req.getRequestDispatcher("dateForm.jsp").forward(req, resp);

		}
	}

}
