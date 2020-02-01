/**
 * 
 */
package com.ramana.corejava.general.practice;

import java.util.Arrays;

/**
 * @author RamanaGorle
 *
 *         A shallow copy of an object copies the ‘main’ object, but doesn’t
 *         copy the inner objects. The ‘inner objects’ are shared between the
 *         original object and its copy.
 *
 *         whenever we use default implementation of clone we get shallow copy
 *         of object means it creates new instance and copies all the fields of
 *         object to that new instance and returns it as object type, we need to
 *         explicitly cast it back to our original object. This is shallow copy
 *         of the object.
 * 
 *         clone() method of the object class support shallow copy of the
 *         object. if the object contains primitive as well as non primitive or
 *         reference type variable in shallow copy, the cloned object also
 *         refers to the same object to which the original objects refers as
 *         only the object references get copied and not the referred object
 *         themselves.
 * 
 *         That's why the name shallow copy or shallow cloning in java. If only
 *         primitive type fields or immutable objects are there then there is no
 *         difference between shallow and deep copy in java.
 */
public class ShallowCopy {
	private int[] data;

	// makes a shallow copy of values
	public ShallowCopy(int[] values) {
		data = values;
	}

	public void showData() {
		System.out.println(Arrays.toString(data));
	}
}
