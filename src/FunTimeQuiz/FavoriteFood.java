package FunTimeQuiz;

import java.util.Scanner;

public class FavoriteFood {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in); //User input
	
	System.out.println("Enter your top five favourite foods.\n");
	String [] favFood = new String[3];
	
	for (int i = 0; i < favFood.length; i++) {
	    System.out.print("Food " + (i + 1) + ": ");
	    favFood[i] = sc.nextLine();
	}
	
	System.out.println("No more memory to store favourite food");
	
	sc.close();
	}

}
