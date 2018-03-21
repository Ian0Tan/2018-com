package tan.ch3;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Spending {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat ("##0.00%");
		double food = 0;
		double clothing = 0;
		double entertainment = 0;
		double rent = 0;
		double total = 0;
		double foodPercent = 0;
		double clothingPercent = 0;
		double entertainmentPercent = 0;
		double rentPercent = 0;
		
		food = input.nextDouble();
		clothing = input.nextDouble();
		entertainment = input.nextDouble();
		rent = input.nextDouble();
		
		total = food + clothing + entertainment + rent;
		foodPercent = (food / total);
		clothingPercent = (clothing / total);
		entertainmentPercent = (entertainment / total);
		rentPercent = (rent / total);
		
		System.out.println( df.format (foodPercent));
		System.out.println( df.format (clothingPercent));
		System.out.println( df.format (entertainmentPercent));
		System.out.println( df.format (rentPercent));
		// TODO Auto-generated method stub

	}

}
