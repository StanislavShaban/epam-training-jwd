package utilities;

import java.util.Scanner;

public class InputValidator {
	
	private static Scanner scan;
	
	public InputValidator() {
		scan = new Scanner(System.in);
	}
	
	public int inputInteger(String outputMessage) {
		System.out.println(outputMessage);
		int value = 0;
		boolean isValid = false;
		do {
			try {
				value = Integer.parseInt(scan.nextLine());
				isValid = true;
			}catch(NumberFormatException e) {
				System.out.println("Enter a valid integer");
			}
			
		}while(!isValid);
		
		return value;
	}
	
	public double inputDouble(String outputMessage) {
		System.out.println(outputMessage);
		double value = 0;
		boolean isValid = false;
		do {
			try {
				value = Double.parseDouble(scan.nextLine());
				isValid = true;
			}catch(NumberFormatException e) {
				System.out.println("Enter a valid double");
			}
			
		}while(!isValid);
		
		return value;
	}
	
	public int inputPositiveInteger(String outputMessage) {
		System.out.println(outputMessage);
		int value = 0;
		boolean isValid = false;
		do {
			try {
				value = Integer.parseInt(scan.nextLine());
				if(value >= 0) {
					isValid = true;
				}else {
					System.out.println("value should be positive!");
					System.out.println(outputMessage);
				}
				
			}catch(NumberFormatException e) {
				System.out.println("Enter a valid integer");
			}
			
		}while(!isValid);
		
		return value;
	}
	
	public double inputPositiveDouble(String outputMessage) {
		System.out.println(outputMessage);
		double value = 0;
		boolean isValid = false;
		do {
			try {
				value = Double.parseDouble(scan.nextLine());
				if(value >= 0) {
					isValid = true;
				}else {
					System.out.println("value should be positive!");
					System.out.println(outputMessage);
				}
			}catch(NumberFormatException e) {
				System.out.println("Enter a valid double");
			}
			
		}while(!isValid);
		
		return value;
	}
}
