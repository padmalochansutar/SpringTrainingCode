package com.csmtech;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.csmtech.domain.Book;

public class FirstServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//System.out.println(req.getServletPath());
		if(req.getServletPath().equals("/getjspPage")) {
//			req.setAttribute("name", "Amit");
//		    req.setAttribute("rollNo", 123);
//		    req.setAttribute("email", "p@123");
		   List<Book> bookList=new ArrayList<Book>();
		  Book b=new Book(105, "let us c", 345.00);
		  Book b1=new Book(106, "let us c++", 344.60);
		  Book b2=new Book(107, "java", 348.00);
		   bookList.add(b);
		   bookList.add(b1);
		   bookList.add(b2);
		   req.setAttribute("booklist", bookList);
		   req.getRequestDispatcher("mypage.jsp").forward(req,resp);
//		    req.setAttribute("book", b);
//		    req.setAttribute("inList",new ArrayList<Integer>(Arrays.asList(12,13,14)));
		}																																	
	}

}
