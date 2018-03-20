package tan.ch3;
/**
 * PizzaCost.java
 * 
 * Mar,20,2018
 * @author Ian Tan
 */

import java.util.Scanner;

public class PizzaCost {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double diameter = 0;
		double cost = 0;
		System.out.println("Enter the diameter in of the pizza in inches: ");
		diameter = input.nextDouble();
		cost = 1.75 + 0.05 * Math.pow(diameter, 2);
		System.out.println("The cost of making the pizza is: $" + cost);
		// TODO Auto-generated method stub
	}

}
