package services;

import java.util.Scanner;

import utilities.DateTimeUtilities;
import utilities.MathUtilities;

public class Service {
	
	private static void guessLastDigit() {
		Scanner scan = new Scanner(System.in);
		boolean isContinued = true;
		while(isContinued) {
			System.out.println("Введите число: ");
			double num = scan.nextDouble();
			num = Math.pow(num, 2);
			int lastDigit = (int)num%10;
			
			int numberSquareLastDigit = 0;
			
			switch(lastDigit) {
			case 2: 
				numberSquareLastDigit = 4;
				break;
			case 3: 
				numberSquareLastDigit = 9;
				break;
			case 4: 
				numberSquareLastDigit = 6;
				break;
			case 7: 
				numberSquareLastDigit = 9;
				break;
			case 8: 
				numberSquareLastDigit = 4;
				break;
			case 9: 
				numberSquareLastDigit = 1;
				break;
			default: 
				numberSquareLastDigit = lastDigit;
				break;
			}
			System.out.println(numberSquareLastDigit);
			System.out.println("Завершить программу?");
			System.out.println("Нажмите 1 для продолжения или любой символ для выхода");
			String choice = "";
			choice = scan.next();
			if(choice == "1") {
				
			}
		}
	}
	
	private static void detectMonthAndYearType() {
		Scanner scan = new Scanner(System.in );
		boolean isMonthNumberValid = false;
		boolean isYearNumberValid = false;
		int monthNumber = 0;
		int yearNumber = 0;
		do {
			try {
				System.out.println("Введите номер месяца: ");
				monthNumber = Integer.parseInt(scan.nextLine());
				System.out.println("Введите год: ");
				yearNumber = Integer.parseInt(scan.nextLine());
				isMonthNumberValid = DateTimeUtilities.validateMonthNumber(monthNumber);
				isYearNumberValid = DateTimeUtilities.validateYearNumber(yearNumber);
			} catch(NumberFormatException e ) {
				System.out.println("Введите корректное число");
			}
		}while(!isMonthNumberValid && !isYearNumberValid);
		
		if(DateTimeUtilities.isLeanYear(yearNumber) == true) {
			System.out.println(yearNumber + " - Високосный год");
		} else {
			System.out.println(yearNumber + " - Не високосный год");
		}
		
		int daysInMonth = DateTimeUtilities.getDaysInMonthByNumber(monthNumber, yearNumber);
		System.out.println("В месяце " + daysInMonth + " дней" );
	}
	
	public static void getInnerSquareArea() {
		Scanner scan = new Scanner(System.in);
		boolean isValid = false;
		double squareArea = 0.0;
		do {
			try {
				System.out.println("Enter square area");
				squareArea = Double.parseDouble(scan.nextLine());
				isValid = true;
			}catch(NumberFormatException e) {
				System.out.println("Entered invalid value");
			}
		}while(!isValid);
		
		double squareSide = Math.sqrt(squareArea);
		double innerSquareSide = squareSide/Math.sqrt(2);
		double innerSquareArea = Math.pow(innerSquareSide, 2);
		System.out.println(innerSquareArea);
	}
	
	public static void hasAtLeastTwoEvenNumber() {
		Scanner scan = new Scanner(System.in);
		boolean isValid = false;
		int firstNumber = 0;
		int secondNumber = 0;
		int thirdNumber = 0;
		int fourthNumber = 0;
		do {
			try {
				
				System.out.println("Enter first number:");
				firstNumber = Integer.parseInt(scan.nextLine());
				
				System.out.println("Enter second number:");
				secondNumber = Integer.parseInt(scan.nextLine());
				
				System.out.println("Enter third number:");
				thirdNumber = Integer.parseInt(scan.nextLine());
				
				System.out.println("Enter fourth number:");
				fourthNumber = Integer.parseInt(scan.nextLine());
				
				isValid = true;
				
				
			} catch(NumberFormatException e) {
				System.out.println("Entered invalid value");
			}
		}while(!isValid);
		
		int evenNumberCounter = 0;
		
		if(MathUtilities.isEvenNumber(firstNumber)) {
			evenNumberCounter++;
		}
		if(MathUtilities.isEvenNumber(secondNumber)) {
			evenNumberCounter++;
		}
		if(MathUtilities.isEvenNumber(thirdNumber)) {
			evenNumberCounter++;
		}
		if(MathUtilities.isEvenNumber(fourthNumber)) {
			evenNumberCounter++;
		}
		if(evenNumberCounter > 1) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}
	}
	
	public static void detectPerfectNumber() {
		Scanner scan = new Scanner(System.in);
		boolean isValid = false;
		int number = 0;
		do {
			try {
				System.out.println("Enter number:");
				number = Integer.parseInt(scan.nextLine());
				isValid = true;
			} catch(NumberFormatException e) {
				System.out.println("Entered invalid value");
			}
		}while(!isValid);
		
		if(MathUtilities.isPerfectNumber(number)) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}
	}
}
