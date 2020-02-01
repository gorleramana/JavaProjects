/**
 * 
 */
package com.ramana.corejava.general.practice;

/**
 * @author RamanaGorle
 * 
 *         A journey to write double checked locking of CustomSingleton class in Java.
 *         
 *         A real time example: Factory method pattern or Decorator design
 *         pattern and has been used a lot even inside JDK like
 *         java.lang.Runtime is an example of CustomSingleton class.
 */
class CustomSingleton {

	/**
	 * Without volatile modifier it's possible for another thread in Java to see
	 * half initialized state of _instance variable, but with volatile variable
	 * guaranteeing happens-before relationship, all the write will happen on
	 * volatile _instance before any read of _instance variable.
	 */
	private volatile static CustomSingleton _instance;

	private CustomSingleton() {
		/**
		 * preventing CustomSingleton object instantiation from outside
		 */
	}

	/**
	 * 1st version: creates multiple instance if two thread access this method
	 * simultaneously
	 **/

	public static CustomSingleton getInstance() {
		if (_instance == null) {
			_instance = new CustomSingleton();
		}
		return _instance;
	}

	/**
	 * 2nd version : this definitely thread-safe and only creates one instance of
	 * CustomSingleton on concurrent environment but unnecessarily expensive due to cost
	 * of synchronization at every call.
	 **/
	public static synchronized CustomSingleton getInstanceTS() {
		if (_instance == null) {
			_instance = new CustomSingleton();
		}
		return _instance;
	}

	/**
	 * 3rd version : An implementation of double checked locking of CustomSingleton.
	 * Intention is to minimize cost of synchronization and improve performance, by
	 * only locking critical section of code, the code which creates instance of
	 * CustomSingleton class. By the way this is still broken, if we don't make _instance
	 * volatile, as another thread can see a half initialized instance of CustomSingleton.
	 */
	public static CustomSingleton getInstanceDC() {
		if (_instance == null) {
			synchronized (CustomSingleton.class) {
				if (_instance == null) {
					_instance = new CustomSingleton();
				}
			}
		}
		return _instance;
	}
}
