package com.csmtech.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.csmtech.entity.Product;
import com.csmtech.entity.Sales;
import com.csmtech.service.ProductService;
import com.csmtech.service.ProductServiceImpl;
import com.csmtech.service.SalesService;
import com.csmtech.service.SalesServiceImpl;

public class ProcessSales extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PrintWriter pw=resp.getWriter();
		String custId=req.getParameter("custId");
		//Integer cuId=Integer.parseInt("custId");		//String cusid="custid";
		Integer prodId=Integer.parseInt(req.getParameter("ProdId"));
		System.out.println(prodId+"prodId");
		Integer sQty=Integer.parseInt(req.getParameter("salQty"));
		
		
		
		Sales sales=new Sales();
		sales.setCustId(custId);
	    sales.setProdId(prodId);
		sales.setsQty(sQty);
		sales.setsDate(new Date());
		
		
		
		
		SalesService salesService=new SalesServiceImpl();
		salesService.saveSales(sales);
		
		
		
		
		

}
}
