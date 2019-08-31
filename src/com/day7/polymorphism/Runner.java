package com.day7.polymorphism;

public class Runner {

	public static void main(String[] args) {
	Loan companies = new Loan();
	//calculate EMI for companies
	System.out.println("EMI for companies :" + companies.calculateEMI(12, 4500));
	
	Loan individualA = new Loan();
	//calculate EMI for individuals
	System.out.println("EMI for Individual A :" + individualA.calculateEMI(12, 4500, 7.0f));

	Loan individualB = new Loan();
	//calculate EMI for individuals
	System.out.println("EMI for Individual B :" + individualB.calculateEMI(12, 4500, 9.0f));
	
	Loan individualC = new Loan();
	//calculate EMI for individuals
	System.out.println("EMI for Individual C :" + individualC.calculateEMI(12, 4500, 12.0f));
	}

}
