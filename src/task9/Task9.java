package task9;

import utilities.InputValidator;

public class Task9 {

	static void taskLogic() {
		InputValidator input = new InputValidator();
		double radius = input.inputDouble("Input radius: ");
		System.out.println("Length: " + calculateLength(radius));
		System.out.println("Area: " + calculateArea(radius));
	}
	
	private static double calculateLength(double radius){
        return 2 * Math.PI * radius;
    }
	
    private static double calculateArea(double radius){
        return Math.PI * Math.pow(radius,2);
    }
}
