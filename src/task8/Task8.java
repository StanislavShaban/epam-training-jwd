package task8;

import utilities.InputValidator;

public class Task8 {
	
	static void taskLogic() {
		int x = 0;
		InputValidator input = new InputValidator();
		x = input.inputInteger("Enter value: ");
		System.out.println("Result: " + calculateFunction(x));
		
	}
	
	private static double calculateFunction(int x){
        double calculationResult = 0;
        if(x >= 3) {
        	calculationResult = firstFunction(x);
        }
        else {
        	calculationResult = secondFunction(x);
        }
        return calculationResult;
    }
	
    private static double firstFunction(int x){
        return -(Math.pow(x,2)) + 3 * x + 9;
    }
    
    private static double secondFunction(int x){
        if((Math.pow(x,3) - 6) == 0) {
        	return 0;
        }
        
        return 1 / (Math.pow(x,3) - 6);
    }
}
