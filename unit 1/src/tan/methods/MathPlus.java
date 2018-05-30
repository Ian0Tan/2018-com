package tan.methods;

import java.util.Scanner;

public class MathPlus {

	public static void main(String[] args) {
		int[] nums = {6,9,4};
		System.out.println( min(nums));


		//Adds two int numbers together and returns the total
	}
	public static int add(int num1, int num2) {
		int total = num1 + num2;
		return total;

		//Adds two double numbers together and returns the total 
	}
	public static double add(double num1, double num2) {
		double total = num1 + num2;
		return total;

		//Adds two long numbers together and returns the total
	}
	public static long add(long num1, long num2) {
		long total = num1 + num2;
		return total;

		//Subtract two int numbers and returns the answer	
	}
	public static int subtract(int num1, int num2) {
		int total = num1 - num2;
		return total;

		//Subtract two double numbers and returns the answer	
	}
	public static double subtract(double num1, double num2) {
		double total = num1 - num2;
		return total;

		//Subtract two long numbers and returns the answer
	}
	public static long subtract(long num1, long num2) {
		long total = num1 - num2;
		return total;

		//Multiply two int numbers and returns the product
	}
	public static int mutliply(int num1, int num2) {
		int total = num1 * num2;
		return total;

		//Multiply two double numbers and returns the product
	}
	public static double mutliply(double num1, double num2) {
		double total = num1 * num2;
		return total;

		//Multiply two double numbers and returns the product
	}
	public static long mutliply(long num1, long num2) {
		long total = num1 * num2;
		return total;

		//Divides two int numbers and returns the quotient as an int
	}
	public static long divide(int num1, int num2) {
		int total = num1 / num2;
		return total;

		//Divides two double numbers and returns the quotient
	}
	public static double divide(double num1, double num2) {
		double total = num1 / num2;
		return total;

		//Divides two long numbers and returns the quotient as a long
	}
	public static long divide(long num1, long num2) {
		long total = num1 / num2;
		return total;

		//Returns the factorial of the given number. Throws an ArithmeticException if the number is less than 0.	
	}
	public static long factorial(int num1) {
		long total = 0;
		if(num1 < 0) {
			throw new ArithmeticException("number can not be zero"
					+ "");
		}
		else if(num1 == 0) {
			total = 1;
			return total;
		}
		else {
			total = num1;
			for (int count = 1 ; count < num1; count++) {
				total = total * count;
			}
		}
		return total;

		//Returns the hypotenuse of a triangle given the length of the other two sides
	}
	public static double hypotenuse(double num1, double num2) {
		double total = Math.sqrt((num1 * num1) + (num2 * num2));
		return total;
	}
	//Returns true if the number given is prime, and false otherwise.
	public static boolean prime(int num1) {
		double divAnswer = 0;
		boolean total = true;

		for (int count = 2 ; count < num1; count++) {
			divAnswer = num1 % count;
			if (divAnswer == 0){
				total = false;
			}

		}

		return total;
	}
	//Adds all the int numbers in the array and returns the sum
	public static int sum(int[] nums) {
		int total = 0;
		for(int i=0; i < nums.length; i++) {
			total += nums[i];
		}
		return total;	
	}
	//Adds all the double numbers in the array and returns the sum
	public static double sum(double[] nums) {
		double total = 0;
		for(int i=0; i < nums.length; i++) {
			total += nums[i];
		}
		return total;	
	}
	//Adds all the long numbers in the array and returns the sum
	public static long sum(long[] nums) {
		long total = 0;
		for(int i=0; i < nums.length; i++) {
			total += nums[i];
		}
		return total;	
	}
	
	public static int min(int[] nums) {
		int minIn = 0;
		for(int i=1; i < nums.length; i++) {
			if(nums[i] < nums[minIn]) {
			minIn = i;	
			}
		
		}
		return minIn;	
	}

}
