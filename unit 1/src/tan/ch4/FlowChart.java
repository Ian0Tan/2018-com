/**
 * 
 */
package tan.ch4;

import java.util.Scanner;

/**
 * Spending.java
 * 
 * Mar,28,2018
 * @author Ian Tan
 */
public class FlowChart {
	

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int imput = 0;
		int remainder = 0;

		imput = input.nextInt();
	if (imput >= 0) {
			System.out.println("Positive");}
		else{
			System.out.println("Negative");}
	
		remainder = imput % 7;
		
	if (remainder == 0){
			System.out.println("It is divisible by 7");}
		else{
			System.out.println("It is not divisible by 7");	
		}
	}
}
