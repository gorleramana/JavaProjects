/**
 * 
 */
package com.ramana.corejava.general.practice;

/**
 * @author RamanaGorle
 *
 *         You can also create thread safe CustomSingleton in Java by creating
 *         CustomSingleton instance during class loading. static fields are
 *         initialized during class loading and Classloader will guarantee that
 *         instance will not be visible until its fully created. Here is example
 *         of creating thread safe singleton in Java using static factory
 *         method. Only disadvantage of this implementing CustomSingleton patter using
 *         static field is that this is not a lazy initialization and CustomSingleton
 *         is initialized even before any clients call there getInstance()
 *         method.
 */
public class StaticSingleton {
	private static final StaticSingleton INSTANCE = new StaticSingleton();

	private StaticSingleton() {
	}

	/**
	 * here we are not creating CustomSingleton instance inside getInstance() method
	 * instead it will be created by ClassLoader. Also private constructor makes
	 * impossible to create another instance , except one case. You can still access
	 * private constructor by reflection and calling setAccessible(true). By the way
	 * You can still prevent creating another instance of CustomSingleton by this way by
	 * throwing Exception from constructor.
	 * 
	 * @return
	 */
	public static StaticSingleton getInstance() {
		return INSTANCE;
	}

	public void show() {
		System.out.println("Singleon using static initialization in Java");
	}
}
