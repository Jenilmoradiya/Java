package com.Bankmanagement;

import java.util.Scanner;


public class Bank {


	public static void main(String[] args) {
		double amount  ;		
		Scanner sc =new Scanner(System.in);   
	
		System.out.println("Please write the following details");
	
		System.out.println("-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-");
		System.out.println("Wirte your account number :");
		int acno=sc.nextInt();

		System.out.println("Enter your Username :");
	    String username=sc.next();
	
	    System.out.println("Enter intial balanace :");
	    double balance=sc.nextDouble();
	    
	    System.out.println("-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-");
	    
	    
	    Method m=new Method(acno ,username, balance);
	    
	    while(true) {
	    	System.out.println("Select any one from the above :");
	   
	    	System.out.println("-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-");
	        System.out.println(" 1)Deposit");
	    	System.out.println(" 2)Withdraw");
	    	System.out.println(" 3)Check Balance");
	    	System.out.println(" 4)Exit");
	    	
	    	System.out.println("-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-");
	    	System.out.println("Your choice is :");
	    	int a=sc.nextInt();
	    	System.out.println("-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-");
	    	
	    	if(a==1) {
	    		System.out.println("Enter the amount you want to deposit :");
	    	    amount=sc.nextDouble();
	    		m.addDeposit(amount);
	    	}
	    	else if(a==2) {
	    		try {
	    		System.out.println("Enter the amount you want to withdraw :");
	    		amount=sc.nextDouble();
	    		m.Withdraw(amount);
	    		}catch(InsufficientFund e) {
	    			System.out.println("You need another "+e.getamount()+"in your account to withdraw.");
	    		}
	    	  }
	    	else if(a==3) {
	    	m.totalbalance();
	    	}
	    	else if(a==4) {
	    		 
	    		System.out.println("Thanks for your visit to Java's bank");
	    		break;
	    	}
	    	
	    	
	    	}
	    }
	}

