package com.day4.array;

public class EmployeeRecord {

	public static void main(String[] args) {

		double salary[] = {23500.0, 25080.0, 28760.0, 22340.0, 19890.0};
		double totalSalary = 0, averageSalary =0;
		int maxSalaryEmployeeCount = 0, minSalaryEmployeeCount = 0;
		
		
		System.out.println("Total number of Employees" + " " +salary.length);
		
		for(int i=0; i< salary.length; i++) {
			
			totalSalary += salary[i];
		}
		
		//calculate average salary and try to display in on the screen
		averageSalary = totalSalary/salary.length;
		System.out.println("Average salary is : " + averageSalary);
		
		//Find the no of employees who get the salary greater than average salary
		//Find the no of employees who get the salary  less than average salary
		
		for(int j = 0; j < salary.length; j++) {
			
			if(salary[j] > averageSalary) { 
				maxSalaryEmployeeCount += 1; //Calculate count of employees with sal greater than Avg sal
			}
			else {
				minSalaryEmployeeCount +=1;  //Calculate count of employees with sal greater than Avg sal
			}
				
		}
		
		System.out.println("No. of employees getting salary greater than average salary: " + maxSalaryEmployeeCount);	
		System.out.println("No. of employees getting salary greater than average salary: " + minSalaryEmployeeCount);	
		
	}

}
