package tan.ch4;

import java.util.Scanner;

/**
 * GuessingGame.java
 * 
 * Apr,4,2018
 * @author Ian Tan
 */

public class GuessingGame {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int secret = 0;
		int player = 0;
		
		
		secret = (int) (Math.random() * 18) + 2 ;
		System.out.println("Enter a number between 1 and 20:");
		player = input.nextInt();
		
		System.out.println("Computer's Number: " + secret);
		System.out.println("Player's Number:" + player);
		
		if (player == secret) {
			System.out.println("You Won!");}
		else {
			System.out.println("Better luck next time.");}
}
}