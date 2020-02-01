/**
 * 
 */
package com.ramana.corejava.general.practice;

/**
 * @author RamanaGorle
 *
 *         Using Enum to create CustomSingleton is by far most simple and effective
 *         way to create thread-safe CustomSingleton in Java, as thread-safety
 *         guarantee is provided by Java programming language itself. You don't
 *         need to bother about thread-safety issue. Since Enum instances are by
 *         default final in Java, it also provides safety against multiple
 *         instance due to serialization.
 * 
 *         we are talking about thread-safety during instance creation of
 *         CustomSingleton class and not when we call any method of CustomSingleton class.
 *         If your CustomSingleton class maintain any state and contains method to
 *         modify that state, you need to write code to avoid and thread-safety
 *         and synchronization issues.
 * 
 */
public enum EnumSingleton {
	/**
	 * If this suits your need than this is the most easy way of writing thread-safe
	 * CustomSingleton in Java.
	 */
	INSTANCE;

	public void show() {
		System.out.println("CustomSingleton using Enum in Java");
	}
}
