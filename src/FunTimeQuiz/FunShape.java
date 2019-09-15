package FunTimeQuiz;

import java.util.concurrent.ThreadLocalRandom;

public class FunShape {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = ThreadLocalRandom.current().nextInt();
		int b = (int) Math.pow(2, 3);
		System.out.println(b);

/*
 * A
 * A B
 * A B C
 */
		
//		for (int j = 1; j <= 6; j++) {
//			for (int i = 1; i <= j; i++) {
//				System.out.print((char)(i+64) + " ");
//			}
//			System.out.println();
//		}
		
		int count = 0;
		for (int j = 1; j <= 4; j++) {
		for (int i = 1; i <= 4; i++) {
			count++;

//			if(j==1 || j==4 || i==1 || i==4 ) {
//			System.out.print("$ ");
//			}
//			else {
//			System.out.print("  ");
			if(count!= 6 && (count != 7) && (count != 10) && (count != 11))
			{
				System.out.print("* ");
			}
			else {
				System.out.print("  ");
			}
			}
		System.out.println();
		}
		
	}
	
		
	}

