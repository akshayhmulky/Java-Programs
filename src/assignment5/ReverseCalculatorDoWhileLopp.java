package assignment5;

import java.util.Scanner;

public class ReverseCalculatorDoWhileLopp {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);	
		
		System.out.println("Do While Loop: ");
		System.out.println("Enter the number to be reversed");
		int num = sc.nextInt();
		int num2 = num;
		int rev = 0;

		
		do{
		int digit = num2%10;
		rev = rev*10 + digit;
		num2/=10;
		}while(num2>0);
		
		System.out.format("Reverse of %d is %d",num, rev);
		sc.close();	

	}

}
