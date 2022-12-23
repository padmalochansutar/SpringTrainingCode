package com.csmtech;

import java.util.Scanner;

public class MenuDriven1 {
	public static void main(String[] args) {
		int a,b,c;
		int choice;
		Scanner sc=new Scanner(System.in);
		while(true) {
			//creating menu
			System.out.println("press 1 for Addition");
			System.out.println("press 2 for Subtraction");
			System.out.println("press 3 for Multiplication");
			System.out.println("press 4 for Division");
			System.out.println("press 5 for Exit");
			//Asking user to input choice
			System.out.println("Make your choice");
			choice=sc.nextInt();
			switch(choice) {
			case 1:
				System.out.println("Enter the first no:");
				a=sc.nextInt();
				System.out.println("Enter the second no:");
				b=sc.nextInt();
				c=a+b;
				System.out.println("The addition of result is"+c);
				break;
			case 5:
				System.exit(0);
				default:
					System.out.println("invalid choice");
				
			}
		}
	}

}
