package net.hackforums.fizzix.gradecalc.prompt.impl;

import net.hackforums.fizzix.gradecalc.prompt.Prompt;

/**
 * Simply displays the average grade to the user through the system output
 * stream.
 * 
 * @author Fizzix
 *
 */
public class AverageResultPrompt implements Prompt<Void> {

	/**
	 * This is the string repesentation of the average grade that will be
	 * displayed to the user.
	 */
	private final String averageGrade;

	/**
	 * Creates a prompt that displays the average grade to the user. The
	 * parameter must not be null.
	 * 
	 * @param averageGrade
	 *            The average grade to be displayed.
	 */
	public AverageResultPrompt(String averageGrade) {
		this.averageGrade = averageGrade;
	}

	@Override
	public Void display() {
		System.out.println("Your average grade is: " + this.averageGrade);
		return null;
	}

}
