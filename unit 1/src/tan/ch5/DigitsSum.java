/**
 * 
 */
package tan.ch5;

import java.util.Scanner;
/**
 * DigitsSum.java
 * 
 * Apr,20,2018
 * @author Ian Tan
 */
public class DigitsSum {


	public static void main(String[] args) {
		String number = "";
		int digit = 0;
		int location = 0;
		int numberDigits = 0;
		int counter = 0;
		int sum = 0;
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a positive integer:");
		number = input.nextLine();
		numberDigits = number.length();
		
		while(counter != numberDigits) {
		digit = number.charAt(location);
		digit -= 48;
		sum += digit;
		location += 1;
		counter += 1;
		}
		System.out.println(sum);
}

	}


