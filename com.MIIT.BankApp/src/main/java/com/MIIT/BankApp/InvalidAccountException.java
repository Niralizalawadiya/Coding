package com.MIIT.BankApp;

public class InvalidAccountException extends Exception{
	
	public InvalidAccountException() {
		super();
		
	}
	
	public InvalidAccountException(String msg) {
		super(msg);
	}

}
