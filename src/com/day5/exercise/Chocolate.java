package com.day5.exercise;

public class Chocolate {
	
	private int barCode;
	private String name;
	private int weight;
	private int cost;
	
	Chocolate(){ //default constructor
		barCode = 101;
		name = "Munch";
		weight = 12;
		cost = 20;
	}

	public int getBarCode() {
		return barCode;
	}

	public void setBarCode(int barCode) {
		this.barCode = barCode;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public int getCost() {
		return cost;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}
	
	


}
