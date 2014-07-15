package net.hackforums.fizzix.gradecalc.gradescale;

import net.hackforums.fizzix.gradecalc.gradescale.impl.AGrade;

/**
 * This class is used to find a grade's String representation based on the int
 * representation of the score.
 * 
 * @author Fizzix
 *
 */
public class GradeFinder {

	/**
	 * Converts the grade from an int based score to a string based grade.
	 * 
	 * @param score
	 *            The score to convert.
	 */
	public String getGradeRepresentation(int score) {
		return new AGrade().getRepresentation(score);
	}
}
