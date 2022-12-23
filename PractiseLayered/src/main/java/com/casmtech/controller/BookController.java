package com.casmtech.controller;

import java.util.List;
import java.util.Scanner;

import com.csmtech.entity.BookVo;
import com.csmtech.service.BookService;
import com.csmtech.service.BookServiceimpl;

public class BookController {

	public static void main(String[] args) {
		//insert operation code
		/*
		 * Scanner ss=new Scanner(System.in); BookVo bookVo=new BookVo();
		 * System.out.println("Enter bookName,bookPrice,bookDate[dd-mm-yyyy]");
		 * bookVo.setBookName(ss.nextLine().trim());
		 * bookVo.setBookPrice(ss.nextLine().trim());
		 * bookVo.setBookDate(ss.nextLine().trim());
		 * 
		 * BookService bookService=new BookServiceimpl();
		 * System.out.println(bookService.SaveBook(bookVo)+" record(s) inserted");
		 */
		
		//all records read operation
		/*
		 * BookService bookService=new BookServiceimpl(); List<BookVo>
		 * bookListVo=bookService.getAllBooks(); for(BookVo bookVo:bookListVo)//showing
		 * all data System.out.println(bookVo);
		 */
		
	    //for records deletion
		/*
		 * Scanner sc=new Scanner(System.in); Integer noOfRecAffected=0;
		 * System.out.println("Enter the book id for deletion"); Long
		 * bookId=sc.nextLong(); BookService bookService=new BookServiceimpl();
		 * noOfRecAffected=bookService.deleteBookById(bookId); System.out.println(
		 * noOfRecAffected+"records deleted");
		 */
		//for only one record read
		/*
		 * Scanner sc=new Scanner(System.in); System.out.println("Enter the Book id");
		 * Long bookId=sc.nextLong(); BookService bookService=new BookServiceimpl();
		 * BookVo bookVo=bookService.getBookById(bookId); if(bookVo!=null)
		 * System.out.println(bookVo); else System.out.println("no record found");
		 */
		//update record
		/*
		 * Scanner ss=new Scanner(System.in); Scanner sc=new Scanner(System.in);
		 * System.out.println("Enter the Book id"); Long bookId=sc.nextLong();
		 * BookService bookService=new BookServiceimpl(); BookVo
		 * bookVo=bookService.getBookById(bookId); if(bookVo!=null) { System.out.
		 * println("Enter new bookName,new bookPrice,new bookDate[dd-mm-yyyy]");
		 * bookVo.setBookName(ss.nextLine().trim());
		 * bookVo.setBookPrice(ss.nextLine().trim());
		 * bookVo.setBookDate(ss.nextLine().trim()); System.out.println(
		 * bookService.SaveBook(bookVo)+"records updated"); } else {
		 * System.out.println("no record found"); }
		 */
		 Integer choice=0;
		 BookService bookService=new BookServiceimpl();
		 BookVo bookVo=null;
		 Scanner ss=new Scanner(System.in);
		 Scanner sc=new Scanner(System.in);
		 Long bookId=null;
		//menu driven
		 do {
			 
			 
		 System.out.println("1.print all books\n2.print book by id\n3.insert book\n4update book by id\n5delete by id\n6.exit");
		 Scanner s=new Scanner(System.in);
		 System.out.println("Enter your choice[1....6]");
		 choice =s.nextInt();
		 switch(choice) {
		 case 1:
			// BookService bookService=new BookServiceimpl(); 
			 List<BookVo>bookListVo=bookService.getAllBooks();
			 for(BookVo book:bookListVo)
			  System.out.println(book);
			 break;
		 case 2:
			 
			 System.out.println("Enter the Book id");
		       bookId=sc.nextLong(); 
			// BookService bookService=new BookServiceimpl();
			  bookVo=bookService.getBookById(bookId);
			 if(bookVo!=null)
			 System.out.println(bookVo); 
			 else System.out.println("no record found");
			 break;
		 case 3:
			  
			  bookVo=new BookVo();
			  System.out.println("Enter bookName,bookPrice,bookDate[dd-mm-yyyy]");
			  bookVo.setBookName(ss.nextLine().trim());
			  bookVo.setBookPrice(ss.nextLine().trim());
			 bookVo.setBookDate(ss.nextLine().trim()); 
			//  BookService bookService=new BookServiceimpl();
			  System.out.println(bookService.SaveBook(bookVo)+" record(s) inserted");
			 break;
		 case 4:
			 
			 System.out.println("Enter the Book id");
			    bookId=sc.nextLong();
			   bookVo=bookService.getBookById(bookId); if(bookVo!=null) { System.out.
			  println("Enter new bookName,new bookPrice,new bookDate[dd-mm-yyyy]");
			  bookVo.setBookName(ss.nextLine().trim());
			  bookVo.setBookPrice(ss.nextLine().trim());
			  bookVo.setBookDate(ss.nextLine().trim()); System.out.println(
			  bookService.SaveBook(bookVo)+"records updated"); } else {
			  System.out.println("no record found"); }
			 
			 break;
		 case 5:
			 Integer noOfRecAffected=0;
			  System.out.println("Enter the book id for deletion"); 
			  bookId=sc.nextLong(); 
			  noOfRecAffected=bookService.deleteBookById(bookId); 
			  System.out.println( noOfRecAffected+"records deleted");
			 break;
		 case 6:
			 System.out.println("Exit");
			 break;
			default:System.out.println("invalid choice"); 
		 
		 
		 }
		 
		 }while(choice !=6);
		 
		 
		 
		 
		 
	}

}
