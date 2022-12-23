package com.csmtech;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

import com.csmtech.domain.Book;

class SortOnIsbn implements Comparator<Book>{

	@Override
	public int compare(Book o1, Book o2) {
		return o1.getIsbn()-o2.getIsbn();
	}}
//Array List:-search operation..
public class ArrayList1 {
	
	public static List<Book>getBookFromListOfList(List<List<Book>> lbookList,Integer isbn) {
		List<Book> lbook=null;
		for(List<Book> bookList:lbookList) {
			for(Book b:bookList) {
				System.out.println(b);
				if(b.getIsbn().intValue()==isbn.intValue()) {
					bookList.add(b);
					
				    
				}
			}
		}
		return lbook ;
		
	}
	
	
	public static List<List<Book>>removeBookFromListOfListByisbn(List<List<Book>> lbookList,Integer isbn) {

		for(List<Book> bookList:lbookList) {
			for(Book b:bookList) {
				if(b.getIsbn().intValue()==isbn.intValue()) {
				  bookList.remove(b);
				    
				}
			}
		}
		return lbookList ;
		
	}
   
	
	
	
	public static List<List<Book>>updateBookFromListOfList(List<List<Book>> lbookList,Integer isbn,Double price) {
		
		for(List<Book> bookList:lbookList) {
			for(Book b:bookList) {
				if(b.getIsbn().intValue()==isbn.intValue()) {
					b.setPrice(price);
					//break;
				    
				}
			}
		}
		return lbookList ;
		
	}
	public static void main(String[] args) {
         List<Integer> newList= new ArrayList<Integer>();
         newList.add(10);
         newList.add(50);
         newList.add(30);
         //newList.add(0,99);
        // newList.add(5,100);
         newList.remove(Integer.valueOf(10));
         
         System.out.println(newList);
			/*
			 * for(Integer x:newList) { System.out.println(x);
			 * 
			 * }
			 */
         
			/*
			 * Iterator itr=newList.iterator(); while(itr.hasNext())
			 * System.out.println(itr);
			 */
         
        // Collections.sort(newList);
         Collections.sort(newList);
        // System.out.println(newList);
         
         
         
         List<Book> bookList=new ArrayList<Book>();
         bookList.add(new Book(101,"letus c","bpb",321.00));
         bookList.add(new Book(102,"letus c++","bob",334.00));
         bookList.add(new Book(103,"java","hcr",234.00));
         bookList.add(new Book(304,"php","pb",245.00));
        // System.out.println(bookList);
         List<Book> bookList1=new ArrayList<Book>();
         bookList1.add(new Book(301,"History","bpb",321.00));
         bookList1.add(new Book(302,"Political Science","bob",334.00));
         bookList1.add(new Book(303,"Economics","hcr",234.00));
         bookList1.add(new Book(304,"Education","pb",245.00));
         Collections.sort(bookList,new SortOnIsbn());
       //  System.out.println(bookList);
         List<List<Book>>booksList=new ArrayList<List<Book>>();
         booksList.add(bookList);
         booksList.add(bookList1);
         System.out.println(booksList);
         List<Book> lb=booksList.get(1);
         //System.out.println(lb);//list of list
         //System.out.println(lb.get(3));
         
         
         List<Book> bl=getBookFromListOfList(booksList,304);
         if(bl.size()!=0)
        	 System.out.println(bl);
         else
        	 System.out.println("book not found");
        // System.out.println(removeBookFromListOfListByisbn(booksList, 304)); 
         
         //System.out.println(updateBookFromListOfList(booksList, 304, 246.00));
         
         
         
         
         
         //to findout 
         
         //Collections.sort(bookList, (b1,b2)->b1.getIsbn()-b2.getIsbn());//lambda Expression
         //innerclass used in interface
			/*
			 * Collections.sort(bookList,new Comparator<Book>() {
			 * 
			 * @Override public int compare(Book o1, Book o2) {
			 * 
			 * return o1.getIsbn()-o2.getIsbn(); } }); System.out.println(bookList);
			 */
         
         
         
         
         
         ///LINKED LIST:-insert,update,delete
         
         List<Integer> iList=new ArrayList<Integer>(); 
          
         
	}

}
