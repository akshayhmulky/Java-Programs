package com.day5;

public class Runner {

	public static void main(String[] args) {

	Bank b;
	b = new Bank();
	
	System.out.println(b.getBankName());
	System.out.println(b.getPhoneNumber());
	System.out.println(b.getArea() + "\n");
	
	
	Bank b1;
	b1 = new Bank("Axis Bank", "Aundh", "888888888" );
	
	System.out.println(b1.getBankName());
	System.out.println(b1.getPhoneNumber());
	System.out.println(b1.getArea());

	}

}

