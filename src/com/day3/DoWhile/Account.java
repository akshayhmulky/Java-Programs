package com.day3.DoWhile;

public class Account {

	public static void main(String[] args) {

		double balance = 0, minBal = 500, depositAmt = 600;
	
		do {
			
			System.out.println("$100 have been added to the account");
			depositAmt += 100;
		}
		while(depositAmt < minBal);
		balance = depositAmt;
		System.out.println("Transaction complete!");
		System.out.println("My balance is " + " " + balance);

	}

}
