package com.xworkz.bankapp.bank;

public class BankAccount {
	
	public String name;
	public String ifscCode;
	public String branchName;
	public int accountNo;
	
	private double balance;
	
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	public double getBalance() {
		return balance;
	}
	
	public BankAccount() {
		
		System.out.println("Bank account object is created");
	}
	
	public double deposit(double  balance) {
		
		 this.balance = this.balance + balance;
		 return  this.balance;
	}
	
	
	public double withDraw(double  balance) {
		
		this.balance = this.balance - balance;
		return  this.balance;
	}
	
	
	public void transfer(double amount, BankAccount anotherAccount) {            //(est amount, transfer madtha ero account);
		
		System.out.println("Transferring to another account");
		
		withDraw(amount);
		anotherAccount.deposit(amount);
		
		System.out.println("Transaction is done........transaction successfull");
		
		
		
	}

}
