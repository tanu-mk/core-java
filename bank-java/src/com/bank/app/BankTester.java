package com.bank.app;

public class BankTester {
	
	public static void main(String t[]) {
		
		Bank.storeBankNames("State Bank of India , Dasarahalli");
		Bank.storeBankNames("ICICI , Navarag");
		Bank.storeBankNames("HDFC , Yeswantpur");
		Bank.storeBankNames("Karnataka Bank , Peenya");
		Bank.storeBankNames("Bank of Baroda , ManjunathNagar");
		
		Bank.getBankNames();
	}
	
	

}
