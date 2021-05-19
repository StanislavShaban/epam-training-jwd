package services;

public class Service {
	public static boolean validateMonthNumber(int monthNumber) {
		boolean isValid = false;
		if(monthNumber > 0 && monthNumber < 13) {
			isValid = true;
		}else {
			System.out.println("Введите корректный номер месяца");
		}
		return isValid;
	}
	
	public static boolean validateYearNumber(int yearNumber) {
		boolean isValid = false;
		if(yearNumber >= 0) {
			isValid = true;
		}else {
			System.out.println("Год не может быть отрицательным");
		}
		return isValid;
	}
	
	public static boolean isLeanYear(int year) {
		if((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0) ) {
			return true;
		}else {
			return false;
		}
	}
	
	public static int getDaysInMonthByNumber(int monthNumber, int year) {
		switch(monthNumber) {
		case 1:
			return 31;
		case 2:
			if(isLeanYear(year)) {
				return 28;
			} else {
				return 29;
			}
		case 3:
			return 31;
		case 4:
			return 30;
		case 5:
			return 31;
		case 6:
			return 30;
		case 7:
			return 31;
		case 8:
			return 31;
		case 9:
			return 30;
		case 10:
			return 31;
		case 11:
			return 30;
		case 12:
			return 31;
		default:
			return 0;
		}
	}
}
