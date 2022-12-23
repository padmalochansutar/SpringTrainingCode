package com.csmtech;

import java.util.Scanner;

public class User {
   public static void main(String[] args) {
	Scanner scn=new Scanner(System.in);
	System.out.println("Enter the first no:");
	int a=scn.nextInt();
	System.out.println("Enter the second no:");
	int b=scn.nextInt();
	System.out.println("Enter the third no:");
	int c=scn.nextInt();
	//Average av=new Average();
	//int res=Average.calculate(a,b,c);
    //System.out.println(res);
	System.out.println(Average.calculate(a,b,c));
	
	
}
}
