package net.hackforums.fizzix.gradecalc.gradescale.impl;

import net.hackforums.fizzix.gradecalc.gradescale.Grade;

/**
 * A representation of the 'F' grade, which has a min score of 50.
 * 
 * @author Fizzix
 *
 */
public class FGrade extends Grade {

	/**
	 * Creates a new representation of an 'F' grade.
	 */
	public FGrade() {
		super(null, "F", 50);
	}

	@Override
	public String getRepresentation(int score) {
		// Terminal node will always return the base
		// seeing there is no '+' case
		return this.baseRepresentation;
	}
}
