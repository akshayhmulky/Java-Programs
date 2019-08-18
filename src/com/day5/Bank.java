package com.day5;

public class Bank {
	
	private String bankName, area;
	private String phoneNumber;
	
	Bank(){ //Default constructor
		bankName = "HFDC";
		area = "Gandhi Nagar";
		phoneNumber = "9999999999";
		
	}
	
	
	public Bank(String bankName, String area, String phoneNumber) { //parameterized constructor
		super();
		this.bankName = bankName;
		this.area = area;
		this.phoneNumber = phoneNumber;
	}


	//Getters
	public String getBankName() {
		return bankName;
	}

	public String getArea() {
		return area;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}


		
	
	
	

}
