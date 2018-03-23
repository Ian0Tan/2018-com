package tan.ch3;
/**
 * DivAndMod.java
 * 
 * Mar,22,2018
 * @author Ian Tan
 */

import java.util.Scanner;

public class DivAndMod {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int int1 = 0;
		int int2 = 0;
		int answer = 2;
		
		System.out.println("Enter an integer:");
		int1 = input.nextInt();
		System.out.println("Enter a second integer:");
		int2 = input.nextInt();
		
		answer = int1 / int2;
		System.out.println(int1 + " / " + int2 + " = " + answer);
		answer = int1 % int2;
		System.out.println(int1 + " % " + int2 + " = " + answer);
		System.out.println(" ");
		answer = int2 / int1;
		System.out.println(int2 + " / " + int1 + " = " + answer);
		answer = int2 % int1;
		System.out.println(int2 + " % " + int1 + " = " + answer);
		// TODO Auto-generated method stub

	}

}
