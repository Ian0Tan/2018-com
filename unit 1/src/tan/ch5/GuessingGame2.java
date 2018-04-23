package tan.ch5;

import java.util.Scanner;

/**
 * GuessingGame.java
 * 
 * Apr,4,2018
 * @author Ian Tan
 */

public class GuessingGame2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int secret = 0;
		int player = 0;
		
		
		secret = (int) (Math.random() * 18) + 2 ;
		
		do {
			System.out.println("Enter a number between 1 and 20:");
			player = input.nextInt();
			if (player == secret) {
				System.out.println("You Won!");}
			else {
				System.out.println("Try again");}
		} while (player != secret);
}
}