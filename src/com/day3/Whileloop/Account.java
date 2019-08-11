package com.day3.Whileloop;
import java.util.Scanner;

public class Account {

	public static void main(String[] args) {
		double balance = 0, minBal = 500, depositAmt = 0, depositAmtTotal = 0;
		Scanner sc = new Scanner(System.in); 
		while( depositAmt < minBal) {
			
			System.out.println("Enter your deposit Amount: ");
			depositAmt = sc.nextInt();	
			depositAmtTotal += depositAmt;
			System.out.println(depositAmtTotal+ " have been added to the account \n");
			depositAmt = depositAmtTotal;
		}
		sc.close(); // orelse you will get sc never closed error
		balance = depositAmt;
		System.out.println("Transaction complete!, your balance is: " +balance	);
	}

}
