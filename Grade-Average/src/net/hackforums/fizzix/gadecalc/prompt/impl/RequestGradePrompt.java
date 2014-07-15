package net.hackforums.fizzix.gradecalc.prompt.impl;

import java.util.Scanner;

import net.hackforums.fizzix.gradecalc.prompt.Prompt;

/**
 * Simply prompts the user for an int, via the system input stream, after
 * displaying what to input via the system output stream.
 * 
 * @author Fizzix
 *
 */
public class RequestGradePrompt implements Prompt<Integer> {

	/**
	 * The number that is displayed to the user indicating which grade this
	 * prompt corresponds to.
	 */
	private int number;

	/**
	 * Creates a prompt that first asks the user to input a grade corresponding
	 * the the given number, then receives input and parses it.
	 * 
	 * @param number
	 *            The number that corresponds to the grade that should be
	 *            provided.
	 */
	public RequestGradePrompt(int number) {
		this.number = number;
	}

	@Override
	public Integer display() {
		// Ask for the grade
		System.out.println("Please insert grade #" + number + ":");

		// Create a scanner and have it autoclose
		try (Scanner in = new Scanner(System.in)) {
			// Get the input from the scanner
			String input = in.nextLine();
			try {
				// Attempts to parse the input as an integer
				return Integer.parseInt(input);
			} catch (NumberFormatException e) {
				// Tells the user their input was not accepted and to try again
				System.out.println("Invalid input, try again.");
				// Recursively calls this method; if the user is retarded they
				// may cause a stack overflow here
				return display();
			}
		}
		// No catch block, as there isn't anything we can do about it and we'll
		// just down the call stack to be handled at a higher level
	}
}
