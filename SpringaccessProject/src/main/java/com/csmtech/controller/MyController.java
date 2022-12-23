package com.csmtech.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.management.loading.PrivateClassLoader;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestParam;


import com.csmtech.module.Sales;
import com.csmtech.repository.SalesRepository;

@Controller
public class MyController {
	@Autowired
	private  SalesRepository salesRepository;
	@GetMapping("/test")
	public String getData(Model model) {
	model.addAttribute("salesList",salesRepository.findAll());
		return "indexfile";
	
		
	}
	@GetMapping("/getSalesByLibraryId")
	public void getSalesByLibraryId(@RequestParam("libraryId") Integer libraryId , HttpServletResponse resp) throws IOException {
		PrintWriter pw=resp.getWriter();
		List<Object[]> sales=salesRepository.findSalesBylibraryid(libraryId);
		String t="";
		t+="<option value='"+0+"'>"+"--SELECT--"+"</option>";
		for (Object[] objects : sales) {
			System.out.println(objects[0]+"  "+objects[1]);
			t+="<option value='"+objects[0]+"'>"+objects[1]+"</option>";
			
		}
		pw.println(t);
	}
	@GetMapping("/getBookQuantity")
	public void getBookQuantity(@RequestParam("bquantity") Integer bquantity , HttpServletResponse resp) throws IOException {
		System.out.println(bquantity);
		PrintWriter pw=resp.getWriter();
		List<Object[]> sales=salesRepository.findSalesBylibraryid(bquantity);
		//String t="";
		Object t=0;
		for (Object[] objects : sales) {
			System.out.println("the quantity of data is:"+objects[2]);
			 t=objects[2];
			
		}
		System.out.println("the last value is:"+t);
		pw.println(t);
		
		
	}

}
