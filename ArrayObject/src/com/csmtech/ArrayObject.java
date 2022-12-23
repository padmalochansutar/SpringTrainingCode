package com.csmtech;

import java.awt.print.Book;
import java.util.Scanner;
 class Book{
	 private int isbn;
	 private String name;
	 private double price;
	 public Book() {
		 this.isbn=100;
		 this.name="no book assign";
		 
	 }
	public Book(int isbn, String name, double price) {
		super();
		this.isbn = isbn;
		this.name = name;
		this.price = price;
	}
	public int getIsbn() {
		return isbn;
	}
	public void setIsbn(int isbn) {
		this.isbn = isbn;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Book [isbn=" + isbn + ", name=" + name + ", price=" + price + "]";
	}
	 
 }

public class ArrayObject {
	public static void main(String[] args) {
		/*
		 * Scanner scn=new Scanner(System.in); int isbn; String name; double price;
		 * 
		 * Book[] B=new Book[3]; System.out.println("Enter 3 book info"); for(int
		 * i=0;i<B.length;i++) { System.out.println("Enter isbn"); isbn=scn.nextInt();
		 * scn.nextLine(); System.out.println("Enter name"); name=scn.nextLine();
		 * System.out.println("Enter price"); price=scn.nextDouble(); B[i]=new
		 * Book(isbn,name,price);
		 * 
		 * } System.out.println("three book info are:"); for(Book x:B)
		 * System.out.println(x);
		 */
		Book b=new Book(101,"java",2000);
		System.out.println(b);
	}

}
