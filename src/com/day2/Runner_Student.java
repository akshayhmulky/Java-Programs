package com.day2;

public class Runner_Student {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student Vampire = new Student();
		Student Blackpanther = new Student();
		
		Vampire.setAge(29);
		Vampire.setName("Vampire A");;
		Vampire.setYearOfJoin(2019);;
		
		Blackpanther.setAge(28);
		Blackpanther.setName("Black Panther Wakanda");
		Blackpanther.setYearOfJoin(2019);
		
		//Ouput the data
		System.out.println("Vampire's Age is :" + " " +Vampire.getAge());
		System.out.println("Blackpanther's Full name is :"+ " " +Blackpanther.getName());
		System.out.println("Blackpanther's Year of Joining is :"+ " " +Blackpanther.getYearOfJoin());

	}

}
