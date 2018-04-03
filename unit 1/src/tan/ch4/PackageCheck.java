package tan.ch4;

import java.util.Scanner;

public class PackageCheck {
	/**
	 * PackageCheck.java
	 * 
	 * Apr,3,2018
	 * @author Ian Tan
	 */

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double weight = 0;
		double length = 0;
		double width = 0;
		double height = 0;
		double volume = 0;
		
		System.out.println("Enter package weight in kilograms:");
		weight = input.nextDouble();
		System.out.println("Enter package length in centimeters");
		length = input.nextDouble();
		System.out.println("Enter package width in centimeters");
		width = input.nextDouble();
		System.out.println("Enter package height in centimeters");
		height = input.nextDouble();
		
		volume = length * width * height;
		
		if(volume > 100000 && weight > 27) {
			System.out.println("Too heavy and too heavy");}
		else if(weight > 27) {
			System.out.println("Too heavy");}
		else if(volume > 100000) {
			System.out.println("Too heavy");}
		
	}

}
