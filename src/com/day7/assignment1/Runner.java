package com.day7.assignment1;

public class Runner {

	public static void main(String[] args) {

		
	PlayerRating jasprit = new PlayerRating(4, "Jasprit Bumrah");
	jasprit.calculateAverageRating(9, 8);  //calling calculateAverageRating method
	jasprit.calculateCategory();  //calling calculateCategory method
	jasprit.display();
	
	PlayerRating vinay = new PlayerRating(8, "Vinay N");
	vinay.calculateAverageRating(9, 10, 11);
	vinay.calculateCategory();
	vinay.display();

	}

}
