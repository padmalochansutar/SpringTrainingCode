package com.csmtech.controller;

import java.util.Scanner;

import com.csmtech.domain.Address;
import com.csmtech.domain.BankAccount;
import com.csmtech.util.AccountUtil;

public class Runner {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Scanner ss=new Scanner(System.in);
		System.out.println("Enter no of depositors:");
		int noofDepositors=sc.nextInt();
		BankAccount[] BA=new BankAccount[noofDepositors];
		System.out.println("Enter bank account info:");
		for(int i=0;i<BA.length;i++) {
			System.out.println("Enter name:");
			String name=ss.nextLine();
			System.out.println("Enter Account type[savings/current]:");
			String actype=ss.nextLine();
			System.out.println("Enter initial balance:");
		    double bal=ss.nextDouble();
		    System.out.println("Enter the address");
		    System.out.println("House No:");
		    String houseNo=sc.nextLine();
		    System.out.println("lane:");
		    String lane=sc.nextLine();
		    System.out.println("Zip:");
		    String zip=sc.nextLine();
			BA[i]=new BankAccount(name,new Address(houseNo,lane,zip),actype,bal);
			
			
		}
		 
		System.out.println("\n1. Search Account\n2.Make Deposit\n3.Withdrawl\n4.Address change\n5.Transaction count\n6.Exit");
	     System.out.println("1.....6");
		int choice=sc.nextInt();
		String acNo;
		double newBal;
		switch(choice) {
		case 1:
			System.out.println("Enter Account No:");
			 acNo=ss.nextLine();
			System.out.println("The Account info is:");
			for(BankAccount x:BA) {
				if(x.getAccountNo().equals(acNo))
				 System.out.println(x);
			}
			break;
		case 2:
			System.out.println("Enter Account No:");
			 acNo=ss.nextLine();
			 System.out.println("Enter deposit amount:");
			 newBal=sc.nextDouble();
			 for(BankAccount x:BA) {
					if(x.getAccountNo().equals(acNo)) {
						x.makeDeposite(newBal);
					 System.out.println(x);
				}
			}
			 break;
		case 3:
			System.out.println("Enter Account No:");
			 acNo=ss.nextLine();
			 System.out.println("Enter withdrawl amount:");
			 newBal=sc.nextDouble();
			 for(BankAccount x:BA) {
					if(x.getAccountNo().equals(acNo)) {
						x.makeDeposite(newBal);
					 System.out.println(x);
				}
			}
		break;
		case 4:
			System.out.println("Enter Account No:");
			 acNo=ss.nextLine();
			 for(BankAccount x:BA) {
					if(x.getAccountNo().equals(acNo)) {
						x.makeDeposite(newBal);
					 System.out.println(x);
					 System.out.println("Enter new address");
					    System.out.println("House No:");
					    String houseNo=sc.nextLine();
					    System.out.println("lane:");
					    String lane=sc.nextLine();
					    System.out.println("Zip:");
					    String zip=sc.nextLine();
					    x.changeAddress(new Address(houseNo,lane,zip));
					    System.out.println(x);
				}
			}
			 break;
		case 5:
			 System.out.println("Enter Account No:");
			 acNo=ss.nextLine();
			 for(BankAccount x:BA) {
					if(x.getAccountNo().equals(acNo)) {
						System.out.println(x.getNoofTransactions()+"no.of transactions are");
					}
			 }
			 break;
		case 6:
			break;
			 
	}

}
}
