package task5;

import java.util.Scanner;

import utilities.InputValidator;
import utilities.MathUtilities;

public class Task5 {
	
	static void taskLogic() {
		boolean isValid = false;
		int number = 0;
		do {
			number = InputValidator.inputInteger("Enter number:");
			isValid = true;
		}while(!isValid);
		
		if(MathUtilities.isPerfectNumber(number)) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}
	}
}
