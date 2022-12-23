package com.csm.tech;

public class BankFinder {
	private Bank bank;
	public BankFinder(Bank bank){
		this.bank=bank;
	}
	public void getBank() {
		System.out.println(bank.getBalance());
	}

}
