package FunTimeQuiz;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);	
	System.out.print("Enter the String to be reversed: "); 
	String str = sc.next();	//Enter String to be reversed
	String rev= "";
	int n = str.length()-1; //calculate length
	
	while(n>=0){
	rev = rev + str.charAt(n);	
	n--;
	}
	
	System.out.format("Reverse of %s is %s",str,rev); //Output
	sc.close();
	}


}
