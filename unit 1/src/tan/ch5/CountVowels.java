package tan.ch5;

import java.util.Scanner;

public class CountVowels {

	public static void main(String[] args) {
		String text = "";
		double letterNum = 0;
		int location = 0;
		int numberDigits = 0;
		int counter = 0;
		int vowels = 0;
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter text:");
		text = input.nextLine();
		
		numberDigits = text.length();
		
		while(counter != numberDigits) {
			letterNum = text.charAt(location);
			if (letterNum == 65 || letterNum == 69 || letterNum == 73 ||  letterNum == 79 || letterNum == 85 || letterNum == 97 || letterNum == 101 || letterNum == 105 || letterNum == 111 || letterNum == 117) {
				vowels += 1;
				
			}
			location += 1;
			counter += 1;
		}
		System.out.println("The number of vowels in "+ text + " is " + vowels);

}
}




