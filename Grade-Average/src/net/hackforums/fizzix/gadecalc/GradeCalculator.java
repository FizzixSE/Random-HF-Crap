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

	private Scanner input;

	/**
	 * Creates a prompt that first asks the user to input a grade corresponding
	 * the the given number, then receives input and parses it.
	 * 
	 * @param in
	 *            The scanner that will be used to read input.
	 * @param number
	 *            The number that corresponds to the grade that should be
	 *            provided.
	 */
	public RequestGradePrompt(Scanner in, int number) {
		this.input = in;
		this.number = number;
	}

	@Override
	public Integer display() {
		// Ask for the grade
		System.out.println("Please insert grade #" + number + ":");

		// Get the input from the scanner
		try {
			String in = input.nextLine();
			// Attempts to parse the input as an integer
			return Integer.parseInt(in);
		} catch (NumberFormatException e) {
			// Tells the user their input was not accepted and to try again
			System.out.println("Invalid input, try again.");
			// Recursively calls this method; if the user is retarded they
			// may cause a stack overflow
			return display();
		}

	}
}
