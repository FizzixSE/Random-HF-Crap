package net.hackforums.fizzix.gradecalc.gradescale;

/**
 * An abstract representation of a grade that is used to map numeric scores to
 * different representations.
 * 
 * @author Fizzix
 *
 */
public abstract class Grade {

	/**
	 * The next best grade that is possible.
	 */
	protected final Grade nextBest;

	/**
	 * The base string representation of this grade. An example of this would
	 * be, "A".
	 */
	protected final String baseRepresentation;

	/**
	 * The minimum score needed to be this grade.
	 */
	protected final int minimumScore;

	/**
	 * Creates a new instance of <code>Grade</code> with the given parameters.
	 * This is only to be called by subclasses of Grade.
	 * 
	 * @param nextBest
	 *            The next best grade in the scale.
	 * @param baseRepresentation
	 *            The base representation of this grade in String form.
	 * @param minimumScore
	 *            The minimum score to achieve this grade.
	 */
	protected Grade(Grade nextBest, String baseRepresentation, int minimumScore) {
		this.nextBest = nextBest;
		this.baseRepresentation = baseRepresentation;
		this.minimumScore = minimumScore;
	}

	/**
	 * Returns the complete string repesentation of this grade. If appropriate,
	 * it will add a "+" to the end, or a "-". It must always return a string
	 * representation.
	 * 
	 * @param score
	 *            The score we are to represent.
	 */
	public String getRepresentation(int score) {

		// If the given score is lower than the minimum score
		if (this.minimumScore > score) {
			// get the next best representation
			return nextBest.getRepresentation(score);
		}

		// Otherwise, figure out the representation for this grade range
		String rep = this.baseRepresentation;

		// Add "+" to the base if 5 higher than min
		if (score >= this.minimumScore + 5) {
			rep += '+';
		}
		return rep;
	}
}
