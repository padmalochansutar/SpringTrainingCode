package com.csmtech;

import java.io.BufferedOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Scanner;

class Book implements Serializable {// custom class
	Integer isbn;
	String title;
	Double price;

	public Book(Integer isbn, String title, Double price) {
		super();
		this.isbn = isbn;
		this.title = title;
		this.price = price;
	}

	public Integer getIsbn() {
		return isbn;
	}

	public void setIsbn(Integer isbn) {
		this.isbn = isbn;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Book [isbn=" + isbn + ", title=" + title + ", price=" + price + "]";
	}

}

public class Runner {

	public static void main(String[] args) throws Exception {
		String s="soumya is a good boy";
		byte[] b=s.getBytes();//getbytes() is a string mrthod
		BufferedOutputStream buffer=new BufferedOutputStream(new FileOutputStream("E:\\MyFile\\Buffer.txt"));
	    buffer.write(b);
	    buffer.close();
	}
}

/*
 * ObjectOutputStream oos=new ObjectOutputStream(new
 * FileOutputStream("E:\\MyFile\\testobject.txt"));
 * 
 * Book b=new Book(101,"let us c",221.54); oos.writeObject(b);
 */
/*
 * ObjectInputStream ois=new ObjectInputStream(new
 * FileInputStream("E:\\MyFile\\testobject.txt")); // Object b=ois.readObject();
 * Book b=(Book)ois.readObject(); System.out.println(b); }
 */
// How to create a file

/*
 * File f=null; File d=new File("E:/MyFile","Test1.text"); if(!f.exists()) { try
 * { f.createNewFile(); } catch (IOException e) { System.out.println(); } } } }
 * }
 */
// */
/*
 * File d=new File("c:/Windows"); String[] files=d.list();
 * System.out.println(files.length); for(String x:files) { File f1=new
 * File("c:\\\\Windows",x); if(f1.isFile()) System.out.println(x); }
 * 
 * System.out.println();
 */
/*
 * //
 * 
 * /* File f=null; File d=new File("E:/MyFile","Test1.text"); d.createNewFile();
 */
// file input data
/*
 * File f=new File("E:\\MyFile\\Test1.text"); FileInputStream fs=new
 * FileInputStream(f); while(true) { int i=fs.read(); if(i==-1) break;
 * 
 * System.out.print((char)i); }
 */
/// output for write
/*
 * File f=new File("E:\\MyFile\\Test.text"); FileOutputStream fs=new
 * FileOutputStream(f); while(true) { String s=sc.nextLine(); if(s.equals("-1"))
 * break; for(int i=0;i<s.length();i++) fs.write(s.charAt(i)); fs.write('\n');
 * 
 * 
 * } fs.close(); }
 */
// copy file
/*
 * File f=new File("E:\\MyFile\\Test1.text"); File f1=new
 * File("E:\\MyFile\\Test2.text"); FileInputStream fos=new FileInputStream(f);
 * FileOutputStream fs=new FileOutputStream(f1);
 * 
 * while(true) { int i=fos.read(); if(i==-1) break; fs.write(i); } fos.close();
 * fs.close();
 * 
 * }
 */
