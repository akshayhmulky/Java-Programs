package com.day7.assignment1;

public class PlayerRating {

	private int playerPosition;
	private String playerName;
//	private double criticRatingOne;
//	private double criticRatingTwo;
//	private double criticRatingThree;
	private double averageRating;
	private char category;
	
	//parameterized constructor
	public PlayerRating(int playerPosition, String playerName) {
		super();
		this.playerPosition = playerPosition;
		this.playerName = playerName;
	}
	
	public void calculateAverageRating(double criticRatingOne, double criticRatingTwo) {
		//Calculate Average Rating
		averageRating = (criticRatingOne + criticRatingTwo)/2;
	}
	
	public void calculateAverageRating(double criticRatingOne, double criticRatingTwo, double criticRatingThree) {
		//Calculate Average Rating
		averageRating = (criticRatingOne + criticRatingTwo + criticRatingThree)/3;
	}
	
	//Calculate Category
	public void calculateCategory() {
		if(averageRating > 9) {
			category = 'A';
		}
		else if(averageRating >6 && averageRating <=9 ) {
			category = 'B';
		}
		else if(averageRating >0 && averageRating <=6 ) {
			category = 'C';
		}
	}
	
	public void display() {
		//displaying the details of a player
		System.out.println("Name of the Player: " + playerName);
		System.out.println("Position: " + playerPosition);
		System.out.println("Rating of the Player: " + averageRating);
		System.out.println("Category of the Player: " + category);
		System.out.println("\n");
	}
	
	
	
}
