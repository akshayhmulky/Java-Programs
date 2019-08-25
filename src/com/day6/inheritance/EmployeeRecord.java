package com.day6.inheritance;

public class EmployeeRecord {

	public static void main(String[] args) {

		PermanentEmployees rajiv = new PermanentEmployees();
		
		rajiv.setName("Rajiv");
		rajiv.setEmpId(100);
		rajiv.setBasicPay(10000);
		rajiv.setHRA(4000);
		rajiv.setExp(6);
		rajiv.calculateSalary(); //Activating calculateSalary method within PermanentEmployees Class
		
		System.out.println("Permanent Employee Record:");
		System.out.println("Name: "+ rajiv.getName());
		System.out.println("Emp ID: "+ rajiv.getEmpId());
		System.out.println("Basic Pay: "+ rajiv.getBasicPay());
		System.out.println("HRA: "+ rajiv.getSalary());
		System.out.println("Experience: "+ rajiv.getExp());
		System.out.println("Salary Calculation: " + "VariableComponent"+ "("+rajiv.getVariableComponent()+ ")" +   " + BasicPay" + "("+ rajiv.getBasicPay()+ ")" + " + HRA" + "("+ rajiv.getHRA() +")");
		System.out.println("Salary: "+ rajiv.getSalary());
		System.out.println("\n");
		
		ContractEmployees raj = new ContractEmployees();
		
		raj.setName("Raj");
		raj.setEmpId(102);
		raj.setWages(300);
		raj.setHours(20);
		raj.calculateSalary(); //Activating calculateSalary method within ContractEmployees Class
		
		System.out.println("Contract Employee Record:");
		System.out.println("Name: "+ raj.getName());
		System.out.println("Emp ID: "+ raj.getEmpId());
		System.out.println("Wage: "+ raj.getWages());
		System.out.println("Hours: "+ raj.getHours());
		System.out.println("Salary Calculation: " + "Hours"+ "("+raj.getHours()+ ")" +   " * Wages" + "("+ raj.getWages()+ ")");
		System.out.println("Salary: "+ raj.getSalary());
		

	}

}
