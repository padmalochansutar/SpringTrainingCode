package com.csmtech.controller;


	
	import java.util.Scanner;

	import com.csmtech.entity.BookVo;
	import com.csmtech.service.BookService;
	import com.csmtech.service.BookServiceImpl;

	public class BookController {

		public static void main(String[] args) {
			/*
			 * Scanner ss=new Scanner(System.in); BookVo bookvo=new BookVo();
			 * System.out.println("Enter book name,  publication date[dd-mm-yyyy] and price"
			 * ); bookvo.setBook_name(ss.nextLine().trim());
			 * bookvo.setBook_date(ss.nextLine().trim());
			 * bookvo.setBook_price(ss.nextLine().trim());
			 * 
			 * BookService bookService=new BookServiceImpl();
			 * System.out.println(bookService.saveBook(bookvo)+" record(s) inserted");
			 */
			//delete operation
			/*
			 * Scanner sc=new Scanner(System.in); BookService bookService=new
			 * BookServiceImpl(); Integer noOfRecordsAffected=0;
			 * System.out.println("Enter the id from deletion operation"); Long
			 * bookId=sc.nextLong(); noOfRecordsAffected =
			 * bookService.deleteBookById(bookId);
			 * System.out.println(noOfRecordsAffected+"rows deleted");
			 */
			Scanner ss=new Scanner(System.in);
			System.out.println("Enter the book id");
			Long bookId=ss.nextLong();
			bookService.getBookById();

		}

	}


