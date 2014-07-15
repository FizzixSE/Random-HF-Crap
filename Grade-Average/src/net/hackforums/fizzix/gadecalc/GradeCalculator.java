package net.hackforums.fizzix.gradecalc;

import net.hackforums.fizzix.gradecalc.gradescale.GradeFinder;
import net.hackforums.fizzix.gradecalc.prompt.Prompt;
import net.hackforums.fizzix.gradecalc.prompt.impl.AverageResultPrompt;
import net.hackforums.fizzix.gradecalc.prompt.impl.RequestGradePrompt;
import net.hackforums.fizzix.gradecalc.prompt.impl.WelcomePrompt;

/**
 * Calculates the average of 8 grades.
 * 
 * @author Fizzix
 *
 */
public class GradeCalculator {

	public static void main(String[] args) {
		// Display the welcome prompt
		new WelcomePrompt().display();

		// Keeps track of the sum of grades
		int sum = 0;

		// Asks for grades 1-8 (inclusive) and adds them to sum
		for (int i = 1; i <= 8; i++) {
			sum += getGrade(i);
		}

		// Calculates the average of the 8 grades
		int average = sum / 8;

		// Gets the String representation of the averaged grade
		String averagedGrade = new GradeFinder()
				.getGradeRepresentation(average);

		// Displays the averaged grade's string representation
		new AverageResultPrompt(averagedGrade).display();
	}

	/**
	 * Prompts the user for a grade, parses it, then returns the parsed
	 * response.
	 * 
	 * @param i
	 *            - The grade number to ask for in the prompt.
	 */
	private static int getGrade(int i) {
		// Creates a new prompt to ask for and parse the grade
		Prompt<Integer> current = new RequestGradePrompt(i);
		// Displays the prompt, which returns the grade in boxed form
		Integer result = current.display();

		// The result is auto-unboxed, which is fine because it will never
		// return null
		return result;
	}

}
