package com.day3.ifelse;

public class Account {

	public static void main(String[] args) {
		
		double balance = 600;  //Account balance
		double amount = 600; 
		System.out.println("Amount to withdraw" + " " + amount);

		
		if(amount <= 0 || amount > balance) {
			//checking if you use is adding negative amount or trying to withdraw amount greater than balance
			System.out.println("Transaction Failed!");

		}
		else {			
			balance-= amount;
			//displaying successful message post withdrawal
			System.out.println("Withdraw successful!, your current balance is:" + " " + balance);
		}
		
	}

}
