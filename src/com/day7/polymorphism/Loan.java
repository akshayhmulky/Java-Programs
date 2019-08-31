package com.day7.polymorphism;

public class Loan {
	
	//Rate of Interest for Companies is 8%, and Individuals: 7%, 9% and 12%
	private float interestRate = 8.0f;
	
	public double calculateEMI(int tenure, double principal) {
		//Calculate Simple Interest
		double simpleInterest = (principal * tenure * interestRate)/100;
		//Calculate EMI 
		double emi = (simpleInterest + principal)/tenure;
		return emi;
	}
	
	public double calculateEMI(int tenure, double principal, float interestRate) {
		//Calculate Simple Interest
		double simpleInterest = (principal * tenure * interestRate)/100;
		//Calculate EMI 
		double emi = (simpleInterest + principal)/tenure;
		return emi;
	}
	

}
