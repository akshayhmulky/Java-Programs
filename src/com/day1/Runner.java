package com.day1;

public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Employee Chhavvi = new Employee();
		Employee Jatin = new Employee();
		
		//seting data for Chhavvi and Jatin
		Chhavvi.setName("Chavvi A");
		Chhavvi.setEmpId("Emp101");
		
		Jatin.setName("Jatin Sharma");
		Jatin.setEmpId("Emp102");
		
		//Ouput the data
		System.out.println("Jatin's Employee Id is :" + " " +Jatin.getEmpId());
		System.out.println("Chhavvi's Full name is :"+ " " +Chhavvi.getName());
		
		
	}

}
