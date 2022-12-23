package com.csmtech.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.csmtech.entity.OrderMaster;
import com.csmtech.entity.ProductMaster;
import com.csmtech.entity.StoreData;
import com.csmtech.service.OrderMasterService;
import com.csmtech.service.OrderMasterServiceImpl;
import com.csmtech.service.ProductMasterServiceImpl;

public class Process extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String firstDate = req.getParameter("ftdate");
		String lastDate = req.getParameter("ltdate");
		OrderMasterService orderMaster = new OrderMasterServiceImpl();
		List<OrderMaster> orderMasterList=orderMaster.getOrderBydate(firstDate, lastDate);
		
		List<StoreData> storeDataList=new ArrayList<StoreData>();
		for(OrderMaster list:orderMasterList) {
			StoreData storeData=new StoreData();
			ProductMaster productMaster=new ProductMasterServiceImpl().getProductById(list.getProdId());
			storeData.setProdName(productMaster.getProdName());
			storeData.setOrderDate(list.getOrderDate());
			storeData.setOrderQty(list.getOrderQty());
			storeData.setOrderValue(list.getOrderQty()*productMaster.getProdRate());
			storeDataList.add(storeData);
			
		}
		req.setAttribute("storeData", storeDataList);
		req.getRequestDispatcher("dateForm.jsp").include(req, resp);
		
		
		
	}
	}


