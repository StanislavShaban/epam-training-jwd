package task5;

import java.util.Scanner;

import utilities.InputValidator;
import utilities.MathUtilities;

public class Task5 {
	
	static void taskLogic() {
		int number = 0;
		InputValidator input = new InputValidator();
		number = input.inputInteger("Enter number:");
		
		if(MathUtilities.isPerfectNumber(number)) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}
	}
}
