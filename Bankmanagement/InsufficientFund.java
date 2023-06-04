package com.Bankmanagement;

public class InsufficientFund extends Exception {
    
	double amount;

	public void InsufficientFund(double amount) {
		
		this.amount = amount;
	}
	public double getamount() {
		return this.amount;
	}
}
