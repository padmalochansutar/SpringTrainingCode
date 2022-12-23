package csm.comtech.domain;

import java.util.Scanner;

import csm.comtech.Bank;
import csm.comtech.BankA;
import csm.comtech.BankB;
import csm.comtech.BankC;

public class Runner {
       public static void main(String[] args) {
       
	   BankA a=new BankA(1000);
	   a.setBalance(1000);
	   System.out.println("the balance of BankA is:"+a.m1(1000));
	   
		  BankB b=new BankB(1000,2000); 
		  b.setBalance(1500);
		  System.out.println("the balance of BankB is:"+b.m1(1500));
		
		
		  BankC c=new BankC(2000, 1500); 
		  c.setBalance(2000);
		  System.out.println("the balance of BankC is:"+c.m1(2000));
		 
}
}
