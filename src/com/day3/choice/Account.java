package com.day3.choice;

public class Account {

	public static void main(String[] args) {

	int choice = 0;
	choice = 6;
	
	switch(choice){
		
		case 1 : System.out.println("First choice executed"); 
				 break;
			
		case 2 : System.out.println("Second choice executed"); 
			     break;
		
		case 3 : System.out.println("Third choice executed"); 
				 break;
		
		default : System.out.println("Default statement executed!");		 
	}

	}

}
