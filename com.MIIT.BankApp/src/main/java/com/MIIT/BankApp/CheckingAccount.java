package com.MIIT.BankApp;

public class CheckingAccount extends Account{
	
	private  double RegisterPin = 0;
	

	public CheckingAccount(int accountNumber, int registerPin) {
		super(accountNumber);
		RegisterPin =registerPin;
	}

	public  void deposite(double amount) {
		
		if (amount >0) {
			Balance +=amount;
			System.out.println("Current Balance is " +Balance);
		
		}else {
			System.out.println("A negitive Amount cannot be deposite");
		}
	}
	
	public  void withdraw(double amount) throws InvalidAccountException {
		
		if (Balance -amount < 0) {
			
			throw new InvalidAccountException("You don't have enough Balance.");
		}else {
			Balance -=amount;
			System.out.println("Current Balance is " +Balance);
			
		}
	}
}
