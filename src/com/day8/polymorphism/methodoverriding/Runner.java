package com.day8.polymorphism.methodoverriding;

public class Runner {

	public static void main(String[] args) {
		
	CarLoan c1 = new CarLoan();
	//Display Car EMI
	System.out.println("Car EMI: " + c1.calculateEMI());
	}

}
