package tan.ch3;
/**
 * ObjectHeight.java
 * 
 * Mar,19,2018
 * @author Ian Tan
 */

import java.util.Scanner;

public class ObjectHeight {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		double time = 0;
		double height = 0;
		
		System.out.println("Enter a time less then 4.5 seconds: ");
		time = input.nextDouble();
		height = 100 - 4.9 * Math.pow(time, 2);
		System.out.println("The heightof the object is: " + height + " meters");
		// TODO Auto-generated method stub
	}

}
