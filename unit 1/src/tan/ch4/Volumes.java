package tan.ch4;

import java.util.Scanner;

public class Volumes {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double length = 0;
		double width = 0;
		double height = 0;
		double volume = 0;
		
		System.out.println("");
		System.out.println("");
		length = input.nextDouble();
		System.out.println("");
		width = input.nextDouble();
		System.out.println("");
		height = input.nextDouble();
		
		volume = length * width * height;
		System.out.println(volume);

	}

}
