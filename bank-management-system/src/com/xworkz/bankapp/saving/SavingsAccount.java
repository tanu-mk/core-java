package com.xworkz.bankapp.saving;

import com.xworkz.bankapp.bank.BankAccount;

public class SavingsAccount extends BankAccount {

		public double newBalance;
		public double interestRate;
		
		public SavingsAccount() {
			
			System.out.println("Savings Account object is created");
		}
		
		/*public SavingsAccount(double interestRate) {
			
			this.interestRate = interestRate;
		}
		
		
		public double periodicInterest(double amount, double interest) {
			
			this.newBalance = newBalance + (amount*interest);
			
			return newBalance;
		}*/
		
		public void periodicInterest() {
			double newBalance = getBalance() * interestRate/100;
			deposit(newBalance);
		
			
			
			
		}
}

