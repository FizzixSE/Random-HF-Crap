package net.hackforums.fizzix.gradecalc.gradescale.impl;

import net.hackforums.fizzix.gradecalc.gradescale.Grade;

/**
 * A representation of the 'B' grade, which has a min score of 80.
 * 
 * @author Fizzix
 *
 */
public class BGrade extends Grade {
	
	/**
	 * Creates a new representation of an 'B' grade.
	 */
	public BGrade() {
		super(new CGrade(), "B", 80);
	}
}
