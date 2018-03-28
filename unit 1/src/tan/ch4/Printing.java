package tan.ch4;

import java.util.Scanner;
import java.text.DecimalFormat;
/**
 * Printing.java
 * 
 * Mar,28,2018
 * @author Ian Tan
 */
public class Printing {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int number = 0;
		double cost = 0;
		double total = 0;
		DecimalFormat df = new DecimalFormat ("$###,##0.00");
		
		System.out.println("Enter the number of copies to be printed:");
		number = input.nextInt();
		if (number <= 99) {
			cost = 0.3;}
		else if (number <= 499) {
			cost = 0.28;}
		else if (number <= 749) {
			cost = 0.27;}		
		else if (number <= 1000) {
			cost = 0.26;}
		else {
			cost = 0.25;}
		
	total = number * cost;
	System.out.println("Price per copy: " + df.format (cost));
	System.out.println("total cost is: " + df.format (total));
	}

}
