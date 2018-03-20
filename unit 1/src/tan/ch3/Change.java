package tan.ch3;
/**
 * Change.java
 * 
 * Mar,20,2018
 * @author Ian Tan
 */

import java.util.Scanner;

public class Change {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int cents = 0;
		int quarters = 0;
		int dimes = 0;
		int nickels = 0;
		
		System.out.println("Enter the change in cents: ");
		cents = input.nextInt();
		quarters = cents / 25;
		cents = cents - quarters * 25;
		dimes = cents / 10;
		cents = cents - dimes * 10;
		nickels = cents / 5;
		cents = cents - nickels * 5;
		System.out.println("Quarters: " + quarters);
		System.out.println("Dimes: " + dimes);
		System.out.println("Nickels: " + nickels);
		System.out.println("Pennies: " + cents);
		
		// TODO Auto-generated method stub

	}

}
