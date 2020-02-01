/**
 * 
 */
package com.ramana.corejava.general.practice;

import java.util.Arrays;

/**
 * @author RamanaGorle
 *
 *         Whenever we need own copy not to use default implementation we call
 *         it as deep copy, whenever we need deep copy of the object we need to
 *         implement according to our need.
 * 
 *         So for deep copy we need to ensure all the member class also
 *         implement the Cloneable interface and override the clone() method of
 *         the object class.
 *         
 *         Unlike the shallow copy, a deep copy is a fully independent copy of an object.
 */
public class DeepCopy {
	/**
	 * A deep copy means actually creating a new array and copying over the values
	 */

	private int[] data;

	// altered to make a deep copy of values
	public DeepCopy(int[] values) {
		data = new int[values.length];
		for (int i = 0; i < data.length; i++) {
			data[i] = values[i];
		}
	}

	public void showData() {
		System.out.println(Arrays.toString(data));
	}
}
