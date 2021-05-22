package task2;

import java.util.Scanner;

import utilities.DateTimeUtilities;
import utilities.InputValidator;

public class Task2 {
	
	public static void taskLogic() {
		boolean isMonthNumberValid = false;
		boolean isYearNumberValid = false;
		int monthNumber = 0;
		int yearNumber = 0;
		do {
			monthNumber = InputValidator.inputInteger("Enter month number: ");
			yearNumber = InputValidator.inputInteger("Enter year number: ");
			isMonthNumberValid = DateTimeUtilities.validateMonthNumber(monthNumber);
			isYearNumberValid = DateTimeUtilities.validateYearNumber(yearNumber);
		}while(!isMonthNumberValid && !isYearNumberValid);
		
		if(DateTimeUtilities.isLeanYear(yearNumber) == true) {
			System.out.println(yearNumber + " - Leap year");
		} else {
			System.out.println(yearNumber + " - Non leap year");
		}
		
		int daysInMonth = DateTimeUtilities.getDaysInMonthByNumber(monthNumber, yearNumber);
		System.out.println("There are " + daysInMonth + " day in a month" );
	}
}
