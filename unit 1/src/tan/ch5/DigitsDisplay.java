package tan.ch5;

import java.util.Scanner;
/**
 * DigitsDisplay.java
 * 
 * Apr,20,2018
 * @author Ian Tan
 */
public class DigitsDisplay {

	public static void main(String[] args) {
		String number = "";
		char digit = ' ';
		int location = 0;
		int numberDigits = 0;
		int counter = 0;
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a positive integer:");
		number = input.nextLine();
		numberDigits = number.length();
		
		while(counter != numberDigits) {
		digit = number.charAt(location);
		System.out.println(digit);
		location += 1;
		counter += 1;
		}

}
}