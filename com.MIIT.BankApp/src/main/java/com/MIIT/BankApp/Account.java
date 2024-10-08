package com.MIIT.BankApp;

public abstract class Account {
	
	private int accountNumber;
	protected double Balance;
	private int RegisterPin ;
	
	
	//Default constructor
	public Account() {
		super();
		
	}
	
	
	
	public Account(int accountNumber) {
		super();
		this.accountNumber = accountNumber;
		Balance= 0;
	}



	public int getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
	public double getBalance() {
		return Balance;
	}
	public void setBalance(double balance) {
		Balance = balance;
	}
	public int getRegisterPin() {
		return RegisterPin;
	}
	public void setRegisterPin(int registerPin) {
		RegisterPin = registerPin;
	}
	
	public abstract void deposite(double amount);
	
	public abstract void withdraw(double amount) throws InvalidAccountException;
	
	
	

}
