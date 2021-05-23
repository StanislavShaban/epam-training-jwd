package task6;

import java.util.Scanner;

import utilities.InputValidator;

public class Task6 {
	
	static void taskLogic() {
		int seconds = 0;
		InputValidator input = new InputValidator();
		seconds = input.inputInteger("Enter seconds:");
		
		int minutes = seconds / 60;
		int hours = minutes / 60;
		System.out.println("Seconds: " + seconds);
		System.out.println("Minutes: " + minutes);
		System.out.println("Hours: " + hours);
	}
}
