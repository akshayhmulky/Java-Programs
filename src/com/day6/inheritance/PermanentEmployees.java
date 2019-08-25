package com.day6.inheritance;

public class PermanentEmployees extends Employees {
	
	private double basicPay;
	private double HRA;
	private int exp;	
	
	
	public double getBasicPay() {
		return basicPay;
	}
	public void setBasicPay(double basicPay) {
		this.basicPay = basicPay;
	}
	public double getHRA() {
		return HRA;
	}
	public void setHRA(double hRA) {
		HRA = hRA;
	}
	public int getExp() {
		return exp;
	}
	public void setExp(int exp) {
		this.exp = exp;
	}
	
	
	
	public void calculateSalary() {
		
		//updating setSalary setter in Employees class, by acquiring variableComponent, basicPay and HRA
		setSalary(getVariableComponent() + basicPay + HRA);
	}
	
	
	public double getVariableComponent() {
		double variableComponent=0;
		
		if(exp < 3) {
			
			variableComponent = (0 * basicPay)/100;
		}
		else if(exp >=3 && exp <5) {
			
			variableComponent = (5 * basicPay)/100;
		}
		else if(exp >= 10) {
			
			variableComponent = (12 * basicPay)/100;
				
		}
		return variableComponent;
	}
	

}
