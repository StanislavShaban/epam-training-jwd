package utilities;

import java.util.Scanner;

public class InputValidator {
	
	private static Scanner scan;
	
	public InputValidator() {
		scan = new Scanner(System.in);
	}
	
	public static int inputInteger(String outputMessage) {
		System.out.println(outputMessage);
		
		while(scan.hasNextInt()) {
			System.out.println("Enter valid integer number\n");
			System.out.println(outputMessage);
			scan.next();
		}
		
		return scan.nextInt();
	}
	
	public static double inputDouble(String outputMessage) {
		System.out.println(outputMessage);
		
		while(scan.hasNextDouble()) {
			System.out.println("Enter valid double number\n");
			System.out.println(outputMessage);
			scan.next();
		}
		
		return scan.nextDouble();
	}
}
