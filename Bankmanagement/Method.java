package com.Bankmanagement;


public class Method   {
	 int acno;
	 String Username;
	 double balance;
	 double deposit;
	 double withdraw;
	 
	    public Method(int acno, String username, double balance) {
		
		this.acno = acno;
		this.Username = username;
		this.balance = balance;
	    System.out.println("HI "+ this.Username+ "your account number is "+this.acno +"and total balanace is "+this.balance);
	    }
	    
	      public void addDeposit(double amount)  {
		  if(amount> 1000000) {
			  System.out.println("Your Deposit amount should be less than 10 lakh");
		  }
		  else {
			  this.balance= this.balance + amount;
			  System.out.println("Money deposited");
			  System.out.println("Your total balance is :"+this.balance);
		  }
	  }
	      public void Withdraw(double amount) throws InsufficientFund{
		  if(amount<= balance) {
			 this.balance= this.balance -amount;
			 System.out.println("Your total balance is :"+this.balance);
		 }
		  else {
			 double need= amount-this.balance;
			 System.out.println("Sorry you dont have enough money to withdraw you need more "+need +"to withdraw.");
		 }
	 }
	      public void totalbalance() {
	    	  System.out.println("Your balance is :"+this.balance);
	      }
	 
	}
