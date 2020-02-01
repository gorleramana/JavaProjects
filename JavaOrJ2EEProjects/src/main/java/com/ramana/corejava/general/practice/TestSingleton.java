/**
 * 
 */
package com.ramana.corejava.general.practice;

/**
 * @author RamanaGorle
 *
 */
public class TestSingleton {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//Testing singleton 
		CustomSingleton.getInstance();
		// Here is how to access this StaticSingleton
		StaticSingleton.getInstance().show();
		// testing enum singleton
		EnumSingleton.INSTANCE.show();
	}

}
