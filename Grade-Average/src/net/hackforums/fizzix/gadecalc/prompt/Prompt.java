package net.hackforums.fizzix.gradecalc.prompt;

/**
 * Represents some generic kind of prompt to the user.
 * 
 * @author Fizzix
 *
 * @param <T>
 *            The type of the response that display returns. If nothing is to be
 *            returned, use Void.
 */
public interface Prompt<T> {

	/**
	 * Displays the prompt and parses/returns a value if needed. Never returns
	 * null, unless the type <code>T</code> is Void.
	 * 
	 * @throws RuntimeException
	 *             If there is a problem, it will throw a
	 *             <code>RuntimeException</code> of some type indicating what
	 *             the problem was.
	 */
	public T display();
}
