package net.hackforums.fizzix.gradecalc.prompt.impl;

import net.hackforums.fizzix.gradecalc.prompt.Prompt;

/**
 * Simply displays the user a welcome message using the system output stream.
 * 
 * @author Fizzix
 *
 */
public class WelcomePrompt implements Prompt<Void> {

	@Override
	public Void display() {
		System.out.println("Welcome to Grade Calculator!");
		return null;
	}

}
