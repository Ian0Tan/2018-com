package tan.ch4;

import java.util.Scanner;

/**
 * Grade.java
 * 
 * Apr,4,2018
 * @author Ian Tan
 */

public class Grade {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double grade = 0;
		char letter = 'F';
		
		System.out.println("Enter the percentage");
		grade = input.nextDouble();
		
		if(grade >= 90) {
			letter = 'A';}
		else if(grade >= 80) {
			letter = 'B';}
		else if(grade >= 70) {
			letter = 'C';}
		else if(grade >= 60) {
			letter = 'D';}
		System.out.println("The corresponding letter grade is: " + letter);

	}
}

