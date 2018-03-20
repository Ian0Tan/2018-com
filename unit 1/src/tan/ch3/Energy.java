package tan.ch3;
/**
 * Energy.java
 * 
 * Mar,20,2018
 * @author Ian Tan
 */
import java.util.Scanner;

public class Energy {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		double mass = 0;
		double energy = 0;
		double  lightBulbs = 0;
		
		System.out.println("Enter the mass in kilograms: ");
		mass = input.nextDouble();
		energy = mass * 9 * Math.pow(10,16);
		lightBulbs = energy / 360000;
		System.out.println("The energy in Joules is " + energy);
		System.out.println("The number of 100-watt light bulbs is " + lightBulbs);
		// TODO Auto-generated method stub

	}

}
