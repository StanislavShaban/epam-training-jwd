package task4;

import utilities.InputValidator;
import utilities.MathUtilities;

public class Task4 {
	
	public static void taskLogic() {
		int firstNumber = 0;
		int secondNumber = 0;
		int thirdNumber = 0;
		int fourthNumber = 0;
		
		InputValidator input = new InputValidator();
		
		firstNumber = input.inputInteger("Enter first number:");
		secondNumber = input.inputInteger("Enter second number:");
		thirdNumber = input.inputInteger("Enter third number:");
		fourthNumber = input.inputInteger("Enter fourth number:");
		
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
