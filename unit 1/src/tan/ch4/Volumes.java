package tan.ch4;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * Volumes.java
 * 
 * Apr,15,2018
 * @author Ian Tan
 */
public class Volumes {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double length = 0;
		double width = 0;
		double height = 0;
		double volume = 0;
		double radius = 0;
		DecimalFormat df = new DecimalFormat ("###,##0.000");
		
		System.out.println("Rectangular Prism");
		System.out.println("Enter the length:");
		length = input.nextDouble();
		System.out.println("Enter the width:");
		width = input.nextDouble();
		System.out.println("Enter the height:");
		height = input.nextDouble();
		
		volume = length * width * height;
		System.out.println("The volume is: " + volume);
		
		System.out.println("");
		System.out.println("Sphere");
		System.out.println("Enter the radius:");
		radius = input.nextDouble();
		
		volume = 3.14159265359 * (Math.pow(radius * 2, 3)) / 6 ;
		System.out.println("The volume is: " + df.format (volume));
		
		System.out.println("");
		System.out.println("Cube");
		System.out.println("Enter the length of each side:");
		length = input.nextDouble();
		
		volume = Math.pow(length, 3);
		System.out.println("The volume is: " + volume);


	}

}
