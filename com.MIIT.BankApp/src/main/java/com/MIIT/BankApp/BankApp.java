package com.MIIT.BankApp;

import java.util.Scanner;

public class BankApp {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		Account accounts[] = new Account[10];
		int numAccounts = 0;
		int opt;
		do {
			opt = showMenu(sc);
			System.out.println();
			
			if(opt == 1) {
				accounts[numAccounts++] = createaccount(sc);
			}else if(opt == 2) {
				deposite(accounts, numAccounts,sc);
			}else if(opt ==3) {
				try {
					withdraw(accounts, numAccounts, sc);
				} catch (InvalidAccountException e) {
					
					e.printStackTrace();
				}
			}
			else {
				System.out.println("Good Bye!!");
			}
			
			System.out.println();
			
			
		}while (opt != 5); 
	}
	
	// For Create New Account
		public static int accountMenu(Scanner sc) {
			System.out.println("Select Account type");
			System.out.println("1.Current Account");
			System.out.println("2.Saving Account");
			
			int opt;
			do {	
				System.out.println("Enter choice:");
				opt = sc.nextInt();
			}while(opt<1 || opt>2);
			
			return opt;
		}
		
		
		public static Account createaccount(Scanner sc) {
			
			Account account =null;
			int opt = accountMenu(sc);
			int accountNumber;
			int resiterPin;
			switch(opt) {
			case '1':
				System.out.println("Enter Current Account  Number:");
				accountNumber =sc.nextInt();
				System.out.println("Enter Your Register Pin:");
				resiterPin =sc.nextInt();
				account = new CheckingAccount(accountNumber, resiterPin);
				System.out.println("Succsfully Register Account Number :" +accountNumber+ " And Your Pin is:"  +resiterPin);
				break;
				
			default :
				System.out.println("Enter Saving Account Number:");
				accountNumber =sc.nextInt();
				System.out.println("Enter Your Register Pin:");
				resiterPin =sc.nextInt();
				account = new CheckingAccount(accountNumber, resiterPin);
				System.out.println("Succsfully Register Account Number :" +accountNumber+ " And Your Pin is:"  +resiterPin);

				
			}
			return account;
		}
		
		public static int searchAccount(Account accounts[], int count, int accountNumber) {
			for(int i=0; i<count; i++) {
				if(accounts[i].getAccountNumber() == accountNumber) {
					return i;
				}
			}
			return -1;
		}
		
		public static void deposite(Account account[], int count, Scanner sc) {
			
			System.out.println("Enter Account Number: ");
			int accountNumber = sc.nextInt();
			
			//search
			int index = searchAccount(account, count, accountNumber);
			
			if(index >= 0) {
			System.out.println("Enter Amount you want to Deposite");
			double amount = sc.nextDouble();
			account[index].deposite(amount);
			}
			else {
				System.out.println(" Account is not exists" +accountNumber);
			}
		}
		
		public static void withdraw(Account accounts[], int count, Scanner sc) throws InvalidAccountException {
			
			System.out.println("enter account Number");
			int accountNumber = sc.nextInt();
			
			int index = searchAccount(accounts, count, accountNumber);
			
			if(index>=0) {
			System.out.println("Enter Amount you want to Withdraw");
			double amount = sc.nextDouble();
			accounts[index].withdraw(amount);
			}
			else {
				System.out.println("No Account exists" +accountNumber);
			}
			
		}
		
		

	
	
	public static  int showMenu(Scanner sc) {
		System.out.println("--------Welcome-------");
		System.out.println("1.Create New Account");
		System.out.println("2.Deposite");
		System.out.println("3.Withdraw");
		System.out.println("4.Exit");
		
		int opt = 0;
		
		do {
			
				System.out.println("=======Enter your choice=======");
				opt =sc.nextInt();
				
		 	}while(opt < 1 || opt > 4);
		return opt;
	}

}
