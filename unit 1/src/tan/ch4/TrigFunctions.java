package tan.ch4;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * TrigFunctions.java
 * 
 * Apr,15,2018
 * @author Ian Tan
 */
public class TrigFunctions {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat ("###,##0.0##");
		double angle = 0;
		double sine = 0;
		double cosine = 0;
		double tangent = 0;
		double radians = 0;

		System.out.println("Enter an angle in degrees:");
		angle = input.nextDouble();
		radians = Math.toRadians(angle);
		sine = Math.sin(radians);
		cosine = Math.cos(radians);
		tangent = Math.tan(radians);
		
		System.out.println("Sine: " + df.format (sine));
		System.out.println("Cosine: " + df.format (cosine));
		System.out.println("Tangent: " + df.format (tangent));
	}

}
