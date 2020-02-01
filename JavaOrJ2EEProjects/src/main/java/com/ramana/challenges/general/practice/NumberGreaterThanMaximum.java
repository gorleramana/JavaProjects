/**
 * 
 */
package com.ramana.challenges.general.practice;

/**
 * This is customized exception that comes in number to words conversion
 * 
 * @author RamanaGorle
 *
 */
public class NumberGreaterThanMaximum extends Exception {
	/**
	 * The below is the default serial version UID
	 */
	private static final long serialVersionUID = 1L;

	public NumberGreaterThanMaximum(String s) {
		/**
		 * Call constructor of parent Exception
		 */
		super(s);
	}
}
