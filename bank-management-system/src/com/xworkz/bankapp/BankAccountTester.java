package com.xworkz.bankapp;

import com.xworkz.bankapp.bank.BankAccount;
import com.xworkz.bankapp.current.CurrentAccount;
import com.xworkz.bankapp.saving.SavingsAccount;

public class BankAccountTester {
	
	public static void main(String t[]) {
		
		BankAccount account = new BankAccount();
		account.deposit(5000);
		System.out.println("My account balance is " + account.getBalance());
		
		BankAccount friendAccount = new BankAccount();
		friendAccount.deposit(700);
		System.out.println("Friend account balance is " + friendAccount.getBalance());
		
		account.transfer(500.0, friendAccount);
		
		System.out.println("My account balance is " + account.getBalance());
		
		System.out.println("Friend account balance is " + friendAccount.getBalance());
		
		
		System.out.println("********************************************************************");
		
		
		SavingsAccount savingsAccount = new SavingsAccount();
		savingsAccount.deposit(3000);
		
		System.out.println("Savings account balance is "+ savingsAccount.getBalance());
		
		savingsAccount.withDraw(1000);
		
		System.out.println("Savings account balance is "+ savingsAccount.getBalance());
		
		
		SavingsAccount momsAccount = new SavingsAccount();
		momsAccount.deposit(1000);
		savingsAccount.transfer(500, momsAccount);
		
		System.out.println("Savings account balance is "+ savingsAccount.getBalance());
		
		System.out.println("Moms account balance is "+ momsAccount.getBalance());
		
		
		System.out.println("********************************************************************");
		
		
		CurrentAccount currentAccount = new CurrentAccount();
		currentAccount.deposit(5000);
		
		System.out.println("Current account balance is " + currentAccount.getBalance());
		
		currentAccount.withDraw(1500);
		
		System.out.println("Current account balance is " + currentAccount.getBalance());
		
		CurrentAccount dadAccount = new CurrentAccount();
		dadAccount.deposit(7000);
		dadAccount.transfer(3000, dadAccount);
		
		System.out.println("Current account balance is " + currentAccount.getBalance());
		
		System.out.println("Dad account balance is " + dadAccount.getBalance());
		
		
		
		SavingsAccount savingsAccount2 = new SavingsAccount();
		savingsAccount2.interestRate = 0.7;
		savingsAccount2.deposit(1000);
		System.out.println(savingsAccount2.getBalance());
		
		savingsAccount2.periodicInterest();
		
		System.out.println(savingsAccount2.getBalance());
		
		
		
		
		
	}

}
