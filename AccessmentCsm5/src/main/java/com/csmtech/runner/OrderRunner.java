package com.csmtech.runner;

import java.sql.ResultSet;
import java.util.Scanner;

public class OrderRunner {

	public static void main(String[] args) {
		Integer choice=0;
        Scanner sc=new Scanner(System.in);
        ResultSet rs=null;
        do {
        System.out.println("1.insert order\n2.update order\n3.delete order\n4.display order\n5.exit");
        choice=sc.nextInt();
        System.out.println("Enter the no[1...5] ");
        switch(choice) {
        case 1:
        	System.out.println("Enter product name:");
			String pname=sc.nextLine().trim();
			System.out.println("Enter order date:[dd/mm/yyyy]");
			String  odate=sc.nextLine().trim();
			System.out.println("Enter quantity ");
			String oqty=sc.nextLine().trim();
			
        	break;
        case 2:
        	break;
        case 3:
        	break;
        case 4:
        	break;
        case 5:
        	System.out.println("Exit");
        	break;
        	default:System.out.println("invalid");
        }
        }while(rs.next()!=false);
	}

}
