package tan.ch4;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Eggs {
	/**
	 * Eggs.java
	 * 
	 * Apr,3,2018
	 * @author Ian Tan
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int eggs = 0;
		double cost = 0;
		double totalCost = 0;
		DecimalFormat df = new DecimalFormat ("$###,##0.00");
		
		System.out.println("Enter the number of eggs purchased:");
		eggs = input.nextInt();
		
		if (eggs < 48) {
			cost = 0.0416;}
		else if (eggs < 72) {
			cost = 0.0375;}
		else if (eggs < 132) {
			cost = 0.0333;}
		else {
			cost = 0.02616;}
		
		totalCost = cost * eggs;
		
		System.out.println("The bill is equal to: " + df.format (totalCost));
		
		
		}

	}


