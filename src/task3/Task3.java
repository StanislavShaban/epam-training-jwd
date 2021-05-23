package task3;

import utilities.InputValidator;

public class Task3 {
	
	static void taskLogic() {
		boolean isValid = false;
		double squareArea = 0.0;
		InputValidator input = new InputValidator();
		squareArea = input.inputDouble("Enter square area: ");
		double squareSide = Math.sqrt(squareArea);
		double innerSquareSide = squareSide/Math.sqrt(2);
		double innerSquareArea = Math.pow(innerSquareSide, 2);
		System.out.println(innerSquareArea);
	}
}
