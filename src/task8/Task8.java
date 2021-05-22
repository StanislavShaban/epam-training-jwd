package task8;

public class Task8 {
	
	static void taskLogic() {
		int x = 0;
		calculateFunction(x);
		
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
        double result = -(Math.pow(x,2)) + 3 * x + 9;
        return result;
    }
    
    private static double secondFunction(int x){
        if((Math.pow(x,3) - 6) == 0) {
        	return 0;
        }
        
        double result = 1 / (Math.pow(x,3) - 6);
        return result;
    }
}
