package task3;

import java.util.Scanner;

import utilities.InputValidator;

public class Task3 {
	
	static void taskLogic() {
		boolean isValid = false;
		double squareArea = 0.0;
		do {
			squareArea = InputValidator.inputDouble("Enter square area");
			isValid = true;
		}while(!isValid);
		
		double squareSide = Math.sqrt(squareArea);
		double innerSquareSide = squareSide/Math.sqrt(2);
		double innerSquareArea = Math.pow(innerSquareSide, 2);
		System.out.println(innerSquareArea);
	}
}
