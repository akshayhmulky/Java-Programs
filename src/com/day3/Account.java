package com.day3;

public class Account {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double balance =500, amount=700;
		
		if(amount <= 0) {
			//checking if you use is adding negative amount
			System.out.println("Negative amount cannot be withdrawn");
		}
		else if(amount > balance){
			//checking if user have sufficient balance
			System.out.println("No sufficient balance");
			
		}
		else {
			
			balance-= amount;
			//displaying successful message post withdrawal
			System.out.println("Withdraw successful!, your current balance is:" + " " + balance);
		}
	}

}
