package com.csmtech.runner;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class Runner {

	public static void main(String[] args) {
		
				SimpleDateFormat format= new SimpleDateFormat("dd-MM-yyyy");
				Student[] s=new Student[5];
				try {
					s[0]=new Student(187675,"Anita pradhan",fm.parse("06-02-2021"),"9876667656");
					s[1]=new Student(187676,"Mahesh Das",fm.parse("16-08-2020"),"9876665378");
					s[2]=new Student(187673,"Amit Sahoo",fm.parse("23-08-2020"),"8249675467");
					s[3]=new Student(187672,"Harish Mahapatra",fm.parse("03-11-2021"),"7078654356");
				} catch (ParseException e) {
					e.printStackTrace();
				}
				ObjectOutputStream obs = null;
				try {
					obs = new ObjectOutputStream(new FileOutputStream("D:/my file/enrollment.txt"));
				} catch (FileNotFoundException e1) {
					e1.printStackTrace();
				} catch (IOException e1) {
					e1.printStackTrace();
				}
				try {
					obs.writeObject(s);
					obs.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
				
				Scanner scn=new Scanner(System.in);
				System.out.println("Enter student name");
				String name=scn.nextLine();
				
				
				
				ObjectInputStream ois = null;
				try {
					ois = new ObjectInputStream(new FileInputStream("D:/my file/enrollment.txt"));
				} catch (FileNotFoundException e) {
				} catch (IOException e) {
				}
				Student[] ss = null;
				try {
					ss = (Student[]) ois.readObject();
					ois.close();
				} catch (ClassNotFoundException e) {
					e.printStackTrace();
				} catch (IOException e) {
					e.printStackTrace();
				}
				
				System.out.println(Arrays.toString(ss));
				for(int i=0;i<ss.length;i++) {
					if(ss[i].getName().equals(name)) {
						System.out.println(ss[i]);
					}
				}
			}

		}
	}

}
