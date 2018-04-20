package tan.ch5;

import java.util.Scanner;
/**
 * CarRecall2.java
 * 
 * Apr,20,2018
 * @author Ian Tan
 */
public class CarRecall2 {

	public static void main(String[] args) {
		double carNum = 1;
		Scanner input = new Scanner(System.in);
		
		while(carNum != 0){
			System.out.println("Enter the cars\'s model number or 0 to quit: ");
			carNum = input.nextDouble();
		
			if (carNum == 119 || carNum == 179 || carNum == 189 || carNum == 780 || carNum >= 195 && carNum <= 221) {
				System.out.println("Your car is defective. It must be repaird.");}
			else if(carNum == 0){	
			}
			else {
				System.out.println("Your car is not defective.");
			}
		}
	}

}
