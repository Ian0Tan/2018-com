package tan.ch4;

import java.text.DecimalFormat;
import java.util.Scanner;

public class BacteriaGrowth {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat ("###,##0");
		double fAnount = 0;
		double iAnount = 0;
		double constant = 0;
		double time = 0;
		double pow = 0;
		
		System.out.println("Enter");
		iAnount = input.nextDouble();
		System.out.println("Enter");
		constant = input.nextDouble();
		System.out.println("Enter");
		time = input.nextDouble();
		
		pow = constant * time;
		System.out.println(pow);
		fAnount = Math.pow(iAnount , pow);
		System.out.println(fAnount);
	}

}
