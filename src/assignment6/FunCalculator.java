package assignment6;
import java.util.Scanner;

public class FunCalculator {

	public static void calculateEvenSum() {
		Scanner input = new Scanner(System.in);
		System.out.println("enter your number");
		int rev = input.nextInt();
		int numb = calculateRev(rev);
		int sum = 0; int count = 1;
		while(numb != 0) {
			if(count % 2 == 0) {
				int digit = numb %10;
				sum+= digit*digit;
			}
			numb /= 10;
			count++;
		}
		if(sum % 9 == 0) {
			System.out.format("%d is your lucky number",rev);
		}
		else {
			System.out.format("is not your lucky number",rev);
		}
		input.close();
	}
	
	public static int calculateRev(int num) {
		
		int rev = 0;
		while(num > 0) {
		int digit = num % 10;	
		rev = rev * 10 + digit;	
		num/= 10;
		}
		return rev;
	}
	
	public static void calcArmstrong() {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter your number");
	int num = sc.nextInt();
	int number = num;
	int sum = 0;
	int power = String.valueOf(number).length();
	 
	
	while(num > 0) {
	int digit = num % 10; //gives one digit at time
	sum += Math.pow(digit, power);
	num/= 10;	
	}

	if(sum == number) {
		System.out.println("Your number is an Armstrong");
	} else {
		System.out.println("Your number is not an Armstrong");
	}
	sc.close();
	}
	
	
	public static void main(String[] args) {

		Scanner c = new Scanner(System.in);
		
		System.out.println("1. Calculate Armstrong \n2. Calculate Lucky Number\n");
		System.out.println("Enter your choice: 1 or 2");
		int choice = c.nextInt();
		
		switch(choice) {
			
		case 1 : calcArmstrong();
				break;
		case 2 : calculateEvenSum();
				break;
				
		default: System.out.println("1. Calculate Armstrong \n2. Calculate Lucky Number \nOops wrong choice");		
		}
		c.close();
	}	

	
}
