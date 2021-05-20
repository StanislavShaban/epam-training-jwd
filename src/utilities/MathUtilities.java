package utilities;

public class MathUtilities {
	public static int getLastDigit(double number) {
		return (int)number % 10;
	}
	
	public static boolean isEvenNumber(int number) {
		return number % 2 == 0;
	}
	
	public static boolean isPerfectNumber(int number) {
		int denominatorSum = 0;
		for(int i = 1; i < number; i++ ) {
			if(number % i == 0) {
				denominatorSum += i;
			}
		}
		return number == denominatorSum;
	}
}
