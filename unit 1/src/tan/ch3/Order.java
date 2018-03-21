package tan.ch3;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Order {

	public static void main(String[] args) {
		
		DecimalFormat df = new DecimalFormat ("$###,##0.00");
		Scanner input = new Scanner(System.in);
		int burgers = 0;
		int fries = 0;
		int sodas = 0;
		double totalBeforeTax = 0;
		double tax = 0;
		double totalAfterTax = 0;
		
		System.out.println("Enter the number of burgers");
		burgers = input.nextInt();
		System.out.println("Enter the number of fries");
		fries = input.nextInt();
		System.out.println("Enter the number of sodas");
		sodas = input.nextInt();
		
		totalBeforeTax = burgers * 1.69 + fries * 1.09 + sodas * 0.99;
		tax = totalBeforeTax * 0.065;
		totalAfterTax = totalBeforeTax + tax;
		System.out.println("Total before tax " + df.format (totalBeforeTax));
		System.out.println("Tax: " + df.format (tax));
		System.out.println("Final total: " + df.format (totalAfterTax));
		// TODO Auto-generated method stub

	}

}