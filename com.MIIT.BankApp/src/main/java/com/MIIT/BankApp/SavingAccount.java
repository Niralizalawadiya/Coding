package com.MIIT.BankApp;

public class SavingAccount extends Account{

	private  double RegisterPin = 0;
	
	
	public SavingAccount(int accountNumber, int registerPin) {
		super(accountNumber);
		RegisterPin = registerPin ;
		
	}

	@Override
	public void deposite(double amount) {
		// TODO Auto-generated method stub
		
		
	}

	@Override
	public void withdraw(double amount) {
		// TODO Auto-generated method stub
		
	}
	
	

}
