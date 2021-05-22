package task1;

import java.lang.Math.*;
import java.util.Scanner;

import utilities.InputValidator;

public class Task1 {
	
	static void taskLogic() {
		double num = InputValidator.inputDouble("Enter Number");
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
	}
}
