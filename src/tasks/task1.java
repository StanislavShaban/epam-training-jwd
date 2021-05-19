package tasks;

import java.lang.Math.*;
import java.util.Scanner;

import services.Service;

public class task1 {
	
	
	
	public static void main(String[] args ) {
		//guessLastDigit();
		detectMonthAndYearType();
	}
	
	/*
	 * @Description Method guesses the last digit of the incoming number square
	 * @Params 
	 */
	
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
				isMonthNumberValid = Service.validateMonthNumber(monthNumber);
				isYearNumberValid = Service.validateYearNumber(yearNumber);
			} catch(NumberFormatException e ) {
				System.out.println("Введите корректное число");
			}
		}while(!isMonthNumberValid && !isYearNumberValid);
		
		if(Service.isLeanYear(yearNumber) == true) {
			System.out.println(yearNumber + " - Високосный год");
		} else {
			System.out.println(yearNumber + " - Не високосный год");
		}
		
		int daysInMonth = Service.getDaysInMonthByNumber(monthNumber, yearNumber);
		System.out.println("В месяце " + daysInMonth + " дней" );
	}
	
	
}
