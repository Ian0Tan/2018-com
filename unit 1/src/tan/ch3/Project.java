package tan.ch3;
/**
 * Project.java
 * 
 * Mar,22,2018
 * @author Ian Tan
 */

import java.text.DecimalFormat;

import java.util.Scanner;

public class Project {
public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat ("##0.00%");
		double designing = 0;
		double coding = 0;
		double debugging = 0;
		double testing = 0;
		double total = 0;
		double designingPercent = 0;
		double codingPercent = 0;
		double debuggingPercent = 0;
		double testingPercent = 0;
		
		System.out.println("Enter the amount spent last month on the following items: ");
		System.out.println(" ");
		System.out.println("Designing:");
		designing = input.nextDouble();
		System.out.println("Coding:");
		coding = input.nextDouble();
		System.out.println("Debugging:");
		debugging = input.nextDouble();
		System.out.println("Testing:");
		testing = input.nextDouble();
		System.out.println(" ");
		
		total = designing + coding + debugging + testing;
		designingPercent = (designing / total);
		codingPercent = (coding / total);
		debuggingPercent = (debugging / total);
		testingPercent = (testing / total);
		
		System.out.println("Task		% Time");
		System.out.println("Designing	" + df.format (designingPercent));
		System.out.println("Coding		" + df.format (codingPercent));
		System.out.println("Debugging	" + df.format (debuggingPercent));
		System.out.println("Testing		" + df.format (testingPercent));
		// TODO Auto-generated method stub

	}

}
