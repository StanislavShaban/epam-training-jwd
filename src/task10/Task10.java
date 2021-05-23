package task10;

import utilities.InputValidator;

public class Task10 {

	static void taskLogic() {
		InputValidator input = new InputValidator();
		int a = input.inputInteger("Enter segment start point: ");
		int b = input.inputInteger("Enter segment end point: ");
		int h = input.inputPositiveInteger("Enter segment step: ");
		
		calculateBySteps(a, b, h);
	}
	
    public static void calculateBySteps(double a,double b,double h){
        if(h == 0 || ((a - b > 0) && h > 0)|| ((a - b < 0) && h < 0)) {
            return;
        }
        
        for(double x = a; x <= b; x += h){
            System.out.println("| arg: "+ x +"| value: " + Math.tan(x));
        }
    }
}
