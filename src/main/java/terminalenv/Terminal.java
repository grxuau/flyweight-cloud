package terminalenv;

import java.util.NoSuchElementException;
import java.util.Scanner;

public class Terminal {
	private final String ENVIRONMENT_VAR_USER = "$";
	private final String ENVIRONMENT_VAR_ADMIN = "#";
	
	private Scanner inputScanner;
	
	public String parseInput() {
		//TODO try-with-resources
		try {
			inputScanner = new Scanner(System.in);
			print(ENVIRONMENT_VAR_USER);
			String userInput = inputScanner.nextLine();
			userInput.trim();
			return userInput;
		} catch (NoSuchElementException e) {
			printError("Unexpected error! Terminal shuts down...");
			//TODO: add environment save
			//TODO: add doc with status codes
			System.exit(-1);
			return null;
		}
	}
	
	public void displayStartInformation() {
		String welcomeMessage = "Welcome to Flyweight Cloud! \n" +
								"Do you have an account?";
	}
	
	private final String ANSI_RESET = "\u001B[0m";
	private final String ANSI_GREEN_BACKGROUND = "\u001B[32m";
	
	public final void print(String message) {
		System.out.print(ANSI_GREEN_BACKGROUND + message + ANSI_RESET);
	}
	
	public final void println(String message) {
		System.out.println(ANSI_GREEN_BACKGROUND + message + ANSI_RESET);
	}
	
	public final void printError(String errorMessage) {
		System.err.print(errorMessage);
	}
	
	public final void printlnError(String errorMessage) {
		System.err.println(errorMessage);
	}
}
