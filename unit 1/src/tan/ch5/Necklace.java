package tan.ch5;

import java.util.Scanner;

public class Necklace {

	public static void main(String[] args) {
		
		int startnumber1 = 0;
		int startnumber2 = 0;
		int number1 = 0;
		int number2 = 0;
		int necklace = 0;
		Scanner input = new Scanner(System.in);
		
		System.out.println("1");
		number1 = input.nextInt();
		startnumber1 = number1 ;
		System.out.println("2");
		number2 = input.nextInt();
		startnumber2 = number2 ;
		
		do {
			number2 = number1 + number2;
			number1 = number2;
			
			System.out.println(number2);
			
		} while ( number1 != startnumber1 && number2 != startnumber2);

	}

}
