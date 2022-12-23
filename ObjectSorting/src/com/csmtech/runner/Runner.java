package com.csmtech.runner;

import java.util.Arrays;
import java.util.Comparator;
class Book implements Comparable <Book>{//default order //we cannot write multiple order
	private int bookId;
	private String title;
	private double price;
	public Book(int bookId, String title, double price) {
		super();
		this.bookId = bookId;
		this.title = title;
		this.price = price;
	}
	public int getBookId() {
		return bookId;
	}
	public void setBookId(int bookId) {
		this.bookId = bookId;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Book [bookId=" + bookId + ", title=" + title + ", price=" + price + "]";
	}
	@Override
	public int compareTo(Book o) {
		if(this.bookId>o.bookId)
			return -1;
//		else if(this.bookId==o.bookId)
//			if(this.price>o.price)
//				return -1;
//			else 
//				return 1;
	return 1;
		//return this.title.compareTo(o.title);
	}
	
}





public class Runner {

	public static void main(String[] args) {
		
       int [] A= {4,8,2,6};//no.array sort
       char[] ch= {'z','p','a','l','n'};//character sort
       String[] s= {"abc","ghi","dfe","vxi","acf"};
       Book[] b=new Book[6];
       b[0]=new Book(101,"let us c",225.65);
       b[1]=new Book(87,"let us c++",220.65);
       b[2]=new Book(104,"java",625.25);
       b[3]=new Book(108,"os",625.25);
       b[4]=new Book(109,"python",625.25);
       b[4]=new Book(155,"operating System concept",404.65);
       Comparator c=new Comparator<Book>() {//comparator java.util and comaprable java.lang//custom order we can create multiple order

		@Override
		public int compare(Book o1, Book o2) {
			
			return o1.getBookId()-o2.getBookId();
		}
    	   
       };
       //Compare<Book> c1=( o1, o2)->o2.getBookId()-o1.getBookId(){
    	   //ret
    	   
       //};
      
		/*
		 * Comparator<Book> p=new Comparator<Book>() {
		 * 
		 * @Override public int compare(Book o1, Book o2) { // TODO Auto-generated
		 * method stub return (int)(o2.getPrice()-o1.getPrice()); }
		 * 
		 * }; System.out.println(Arrays.toString(b));//it show only for written in class
		 * book overriding method
		 */     //  Arrays.sort(b,(o1,o2)->o2.getBookId()-o1.getBookId());
       //Arrays.sort(b,(b1,b2)->(int)(b2.getPrice()-b1.getPrice()));
       //if bookmprice is same then it is sorting in bookid oreder
       Arrays.sort(b,(b1,b2)->{
    	   if(b1.getPrice()!=b2.getPrice())
    		   return (int)(b2.getPrice()-b1.getPrice());
    	   else{
    		   return b1.getBookId()-b2.getBookId();
    	   }
    	   
       });
       System.out.println(Arrays.toString(b));
       
       System.out.println(Arrays.toString(b));
       //System.out.println(s);
       System.out.println(Arrays.toString(s));
       Arrays.sort(s);
       System.out.println(Arrays.toString(s));
       System.out.println(Arrays.toString(ch));
       Arrays.sort(ch);
       
       System.out.println(Arrays.toString(ch));
       System.out.println(Arrays.toString(A));
	//sorting
       Arrays.sort(A);
       System.out.println(Arrays.toString(A));
	}

}
