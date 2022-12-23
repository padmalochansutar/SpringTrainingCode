package com.csm.tech.runner;

import com.csm.tech.Bank;
import com.csm.tech.BankA;
import com.csm.tech.BankB;
import com.csm.tech.BankC;
import com.csm.tech.BankFinder;

public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Bank bank=new BankA(100); System.out.println(bank.getBalance()); bank=new
		 * BankB(150); System.out.println(bank.getBalance()); bank=new BankC(200);
		 * System.out.println(bank.getBalance());
		 */
		BankFinder bankfinder=new BankFinder(new BankB(150));
		bankfinder.getBank();
	}

}
