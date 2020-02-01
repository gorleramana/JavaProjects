/**
 * This program will search given string
 */
package com.ramana.challenges.general.practice;

/**
 * @author RamanaGorle
 *
 */
public class Nino3 {

	public static boolean binarySearch(String[] sortedStrings, String searchValue) {
		int result;
		result = BinarySearchString.searchString(sortedStrings, searchValue);
		if (result >= 0) {
			return true;
		}
		return false;
	}

	public static void main(String args[]) {

		String[] names = new String[] { "peach", "apple", "fig", "mango", "orange", "blueberry" };
		String searchString = "banana";
		boolean resultValue = Nino3.binarySearch(names, searchString);
		System.out.println(resultValue);
	}

}

class BinarySearchString {

	public static int searchString(String[] names, String key) {
		int first = 0;
		int last = names.length;

		while (first < last) {
			int mid = (first + last) / 2;
			if (key.compareTo(names[mid]) < 0) {
				last = mid;
			} else if (key.compareTo(names[mid]) > 0) {
				first = mid + 1;
			} else {
				return mid;
			}
		}
		return -(first + 1);
	}
}