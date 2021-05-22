package task6;

import java.util.Scanner;

import utilities.InputValidator;

public class Task6 {
	
	static void taskLogic() {
		boolean isValid = false;
		int seconds = 0;
		do {
			seconds = InputValidator.inputInteger("Enter seconds:");
			isValid = true;
		}while(!isValid);
		
		int minutes = seconds / 60;
		int hours = minutes / 60;
		System.out.println("Seconds: " + seconds);
		System.out.println("Minutes: " + minutes);
		System.out.println("Hours: " + hours);
	}
}
