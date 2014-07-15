package net.hackforums.fizzix.gradecalc.gradescale.impl;

import net.hackforums.fizzix.gradecalc.gradescale.Grade;

/**
 * A representation of the 'D' grade, which has a min score of 60.
 * 
 * @author Fizzix
 *
 */
public class DGrade extends Grade {
	
	/**
	 * Creates a new representation of an 'D' grade.
	 */
	public DGrade() {
		super(new FGrade(), "D", 60);
	}
}
