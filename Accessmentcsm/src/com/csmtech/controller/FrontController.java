package com.csmtech.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.csmtech.entity.Customer;
import com.csmtech.entity.Product;
import com.csmtech.service.CustomerService;
import com.csmtech.service.CustomerServiceImpl;
import com.csmtech.service.ProductService;
import com.csmtech.service.ProductServiceImpl;




public class FrontController extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PrintWriter pw=resp.getWriter();
		//pw.println(DbUtil.getSessionFactory().openSession().createQuery("From Product").list());
		if(req.getServletPath().equals("/getSalesForm"))
		{
			CustomerService custServ=new CustomerServiceImpl();
			List<Customer> custList=custServ.getAllNames();
			req.setAttribute("custList", custList);
			
			
			
			ProductService prodServ=new ProductServiceImpl();
			List<Product> prodList=prodServ.getAllNames();
			req.setAttribute("prodList", prodList);
			
			req.getRequestDispatcher("saleProcess.jsp").forward(req, resp);
		
		}
		
		
	}

}
