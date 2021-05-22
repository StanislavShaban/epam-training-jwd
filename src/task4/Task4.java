package task4;

import java.util.Scanner;

import utilities.InputValidator;
import utilities.MathUtilities;

public class Task4 {
	
	public static void taskLogic() {
		boolean isValid = false;
		int firstNumber = 0;
		int secondNumber = 0;
		int thirdNumber = 0;
		int fourthNumber = 0;
		do {
			firstNumber = InputValidator.inputInteger("Enter first number:");
			secondNumber = InputValidator.inputInteger("Enter second number:");
			thirdNumber = InputValidator.inputInteger("Enter third number:");
			fourthNumber = InputValidator.inputInteger("Enter fourth number:");
			isValid = true;
		}while(!isValid);
		
		int evenNumberCounter = 0;
		int[] evenNumberArray = new int[] {firstNumber, secondNumber, thirdNumber, fourthNumber};
		for(int item : evenNumberArray) {
			if(MathUtilities.isEvenNumber(item)) {
				evenNumberCounter++;
			}
		}
		
		if(evenNumberCounter > 1) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}
	}
}
