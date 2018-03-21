package tan.ch3;

import java.util.Scanner;

/**
 * TimeConversion.java
 * 
 * Mar,21,2018
 * @author Ian Tan
 */

public class TimeConversion {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int time = 0;
		int hours = 0;
		
		System.out.println("Enter the time in minutes: ");
		time = input.nextInt();
		hours = time / 60;
		time = time - hours * 60;
		System.out.println("The time is: " + hours + ":" + time);

		// TODO Auto-generated method stub

	}

}
