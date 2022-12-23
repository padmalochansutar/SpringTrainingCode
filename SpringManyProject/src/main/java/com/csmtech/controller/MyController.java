package com.csmtech.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;

import javax.servlet.http.HttpServletResponse;
import javax.xml.bind.ParseConversionEvent;

import org.aspectj.weaver.NewConstructorTypeMunger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.context.Theme;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestParam;

import com.csmtech.model.Book;
import com.csmtech.model.Library;
import com.csmtech.model.Sales;
import com.csmtech.repository.BookRepository;
import com.csmtech.repository.LibraryRepository;
import com.csmtech.repository.SalesRepository;

@Controller
public class MyController {
	@Autowired
	private LibraryRepository libraryRepository;
	@Autowired
	private BookRepository bookRepository;
	@Autowired
	private SalesRepository salesRepository;
	
	List<Book> findAll;
	
	@GetMapping("/test")
	public String getData(Model model) {
		
		model.addAttribute("libraryList", libraryRepository.findAll());
		 findAll = bookRepository.findAll();
		System.out.println("findData:"+findAll);
		model.addAttribute("bookList",findAll);
		String s="Out of Stock";
		model.addAttribute("s");
		return "sales";
		
	}
	Library t;
	Book bookData;
	Integer bquantity;
	@GetMapping("/saveData")
	public String saveData(@ModelAttribute Sales sales1) {
		System.out.println(sales1);
		salesRepository.save(sales1);
		return null;
		
   
   
}
}
