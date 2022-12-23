package com.csmtech.domain;

import com.csmtech.util.AccountUtil;

public class BankAccount {
	  private String accountNo;
      public String name;
      private Address address;
      private String accounttype;
      private double balance;
      private int  noofTransactions;
	public BankAccount(String name, Address address, String accounttype, double balance) {
		super();
		this.accountNo=AccountUtil.getAccountNumber();
		this.name = name;
		this.address = address;
		this.accounttype = accounttype;
		this.balance = balance;
		this.noofTransactions=0;
	}
	
	public String getAccountNo() {
		return accountNo;
	}

	public void makeDeposite(double amount) {
		this.balance+=amount;
		this.noofTransactions++;
	}
	public void makeWithdraw(double amount) {
		this.balance-=amount;
		this.noofTransactions--;
	}
	public void changeAddress(Address address) {
		this.address=address;
	}
	
	public int getNoofTransactions() {
		return noofTransactions;
	}

	public void setNoofTransactions(int noofTransactions) {
		this.noofTransactions = noofTransactions;
	}

	@Override
	public String toString() {
		return "BankAccount [accountNo=" + accountNo + ", name=" + name + ", address=" + address + ", accounttype="
				+ accounttype + ", balance=" + balance + "]";
	}
	
	
     
}