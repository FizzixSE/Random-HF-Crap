package net.hackforums.fizzix.gradecalc.gradescale.impl;

import net.hackforums.fizzix.gradecalc.gradescale.Grade;

/**
 * A representation of the 'C' grade, which has a min score of 70.
 * 
 * @author Fizzix
 *
 */
public class CGrade extends Grade {
	
	/**
	 * Creates a new representation of an 'C' grade.
	 */
	public CGrade() {
		super(new DGrade(), "C", 70);
	}
}
