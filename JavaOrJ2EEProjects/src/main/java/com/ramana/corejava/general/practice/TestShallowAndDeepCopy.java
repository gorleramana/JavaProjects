/**
 * 
 */
package com.ramana.corejava.general.practice;

/**
 * @author RamanaGorle
 *
 *         There is no hard and fast rule defined for selecting between shallow
 *         copy and deep copy but normally we should keep in mind that if an
 *         object has only primitive fields, then obviously we should go for
 *         shallow copy, but if the object has references to other objects, then
 *         based on the requirement, shallow copy or deep copy should be done.
 *         If the references are not updated then there is no point to initiate
 *         a deep copy
 * 
 *         Lazy Copy:--
 *         A lazy copy can be defined as a combination of both shallow
 *         copy and deep copy. The mechanism follows a simple approach – at the
 *         initial state, shallow copy approach is used. A counter is also used
 *         to keep a track on how many objects share the data. When the program
 *         wants to modify the original object, it checks whether the object is
 *         shared or not. If the object is shared, then the deep copy mechanism
 *         is initiated.
 */
public class TestShallowAndDeepCopy {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/**
		 * Testing Shallow copy
		 * 
		 * This can lead to unpleasant side effects if the elements of values are
		 * changed via some other reference
		 */
		int[] vals = { 3, 7, 9 };
		ShallowCopy e = new ShallowCopy(vals);
		e.showData(); // prints out [3, 7, 9]
		vals[0] = 13;
		/**
		 * Very confusing, because we didn't intentionally change anything about the
		 * object e refers to
		 */
		e.showData(); // prints out [13, 7, 9]

		/**
		 * Testing Deep Copy
		 */
		int[] values = { 3, 7, 9 };
		DeepCopy d = new DeepCopy(values);
		d.showData(); // prints out [3, 7, 9]
		values[0] = 13;
		d.showData(); // prints out [3, 7, 9]

		/**
		 * changes in array values will not be shown in data values.
		 */
	}

}
