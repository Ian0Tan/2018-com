package tan.ch5;

import java.util.Scanner;
/**
 * PrimeNumber.java
 * 
 * Apr,18,2018
 * @author Ian Tan
 */
public class PrimeNumber {

	public static void main(String[] args) {
		double number = 0;
		double divAnswer = 0;
		boolean prime = true;
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a number:");
		number = input.nextDouble();

		for (int count = 2 ; count < number; count++) {
			divAnswer = number % count;
			if (divAnswer == 0){
				prime = false;
			}
			
			}
		if (prime == true)	{
			System.out.println("it is prime");
		}
		else {
			System.out.println("it is not prime");
		}
		
	}	

}
