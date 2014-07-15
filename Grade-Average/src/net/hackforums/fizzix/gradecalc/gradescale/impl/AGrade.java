package net.hackforums.fizzix.gradecalc.gradescale.impl;

import net.hackforums.fizzix.gradecalc.gradescale.Grade;

/**
 * A representation of the 'A' grade, which has a min score of 90.
 * 
 * @author Fizzix
 *
 */
public class AGrade extends Grade {

	/**
	 * Creates a new representation of an 'A' grade.
	 */
	public AGrade() {
		super(new BGrade(), "A", 90);
	}
}
