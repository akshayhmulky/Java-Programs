package assignment5;
import java.util.Scanner;

public class ReverseCalculatorWhileLoop {

	public static void main(String[] args) {

	Scanner sc = new Scanner(System.in);	
	
	System.out.println("While Loop: ");
	System.out.println("Enter the number to be reversed");
	int num = sc.nextInt();
	int num2 = num;
	int rev = 0;

	
	while(num2>0){
	int digit = num2%10;
	rev = rev*10 + digit;
	num2/=10;
	}
	System.out.format("Reverse of %d is %d",num, rev);
	sc.close();
	}
}
