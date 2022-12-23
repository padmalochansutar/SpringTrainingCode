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
	public String saveData(@ModelAttribute Sales sales1, @RequestParam("bookid") Book bookid,
			@RequestParam("idlibraryid") Library libraryid,
			@RequestParam("quantity") Integer squantity,HttpServletResponse resp , Model model) throws IOException
			 {
		System.out.println("the book name is:"+sales1.getBook());
		System.out.println("the boook id is:"+bookid);
		PrintWriter pw=resp.getWriter();
		 if(squantity>=bookid.getQuantity()) {
			 model.addAttribute("msg","<h2>Out Of Stock</h2>");
			return "sales";
		 }
		t=libraryid;
		bookData=bookid;
		System.out.println("the book data is:"+bookData);
		//Integer data=bookData.getBookid();
	     // Integer quqn=bookRepository.findByQuqntity(data);
	    bookData.setQuantity(bookData.getQuantity()-squantity);
	    bookRepository.save(bookData);
//	System.out.println("the book quqntity is:"+quqn);
//	    Integer updateData=quqn-squantity;
//	    System.out.println("the updateis:"+updateData);
//	    Book book=new Book();
//	    book.setQuantity(updateData);
//	    System.out.println("the id is:"+data);
//	    //bookRepository.updateData(book,data);
	   
		Sales sales=new Sales();
		
		sales.setDate(new Date());
		sales.setBook(bookid);
		sales.setLibrary(libraryid);
		sales.setSquantity(squantity);
		salesRepository.save(sales);
		
		
		return "forward:/getData";
	}
	@GetMapping("/getData")
   public String getDatabyId(Model model) {
		System.out.println("the method data is"+t);
//		Sales s=salesRepository.findSalesByLibraryId(t);
//	  System.out.println("the data is:"+s);
//	  Integer lid= t.getIdlibraryid();
//	  salesRepository.findData(lid);
		Integer ldata=t.getIdlibraryid();
		Integer bdata=bookData.getBookid();
		Integer count=0;
		String s = null;
		Integer cou=(int) bookRepository.count();
		List<Book> bookL=new ArrayList<Book>();
		for(int i=1;i<=cou;i++) {
			
			 List<Object[]> sales=salesRepository.findAll(ldata,i);
			 for (Object[] objects : sales) {
					count=count+(int)objects[2];
					s=(String) objects[1];
				}
			 Book b=new Book(s,count);
			
			 bookL.add(b);
			 count=0;
		}
		System.out.println(bookL);
		String name=t.getName();
		model.addAttribute("bookL",bookL);
		model.addAttribute("nameList",name);
		return "sales";
	  
   }
   
}
