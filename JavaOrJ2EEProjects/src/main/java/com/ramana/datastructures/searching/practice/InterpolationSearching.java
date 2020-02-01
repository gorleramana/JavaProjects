/**
 * 
 */
package com.ramana.datastructures.searching.practice;

/**
 * @author RamanaGorle
 *
 */
public class InterpolationSearching {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] arr = { 0, 5, 13, 19, 22, 41, 55, 68, 72, 81, 98 };
		int c = 55;
		System.out.println("Found the element: " + interpolationSearch(c, arr));
	}

	private static boolean interpolationSearch(int c, int[] arr) {
		int lo = 0;
		int high = arr.length - 1;

		while (lo <= high) {
			/**
			 * Interpolation search formula
			 */
			int mid = lo + ((high - lo) / (arr[high] - arr[lo])) * (c - arr[lo]);

			if (arr[mid] == c) {
				return true;
			} else if (arr[mid] > c) {
				high = mid - 1;
			} else {
				lo = mid + 1;
			}
		}
		return false;
	}

}
