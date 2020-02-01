/**
 * 
 */
package com.ramana.datastructures.sortings.practice;

/**
 * @author RamanaGorle
 *
 */
public class ShellSorting {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] arr = { 44, 22, 5, 1, 78, 34, 67, 12, 23, 56, 98, 112, 45 };
		System.out.println("Sorted array is: " + shellSort(arr));
	}

	/**
	 * Highly efficient algorithm: Create an interval and swap the elements if
	 * needed, and then reduce the interval to half and do the same again
	 * 
	 * Time complexity is : o(n*n)
	 * 
	 * @param arr
	 * @return
	 */
	private static boolean shellSort(int[] arr) {
		int n = arr.length;

		// Start with a big gap, then reduce the gap
		for (int gap = n / 2; gap > 0; gap /= 2) {
			// Do a gapped insertion sort for this gap size.
			// The first gap elements a[0..gap-1] are already
			// in gapped order keep adding one more element
			// until the entire array is gap sorted
			for (int i = gap; i < n; i ++) {
				// add a[i] to the elements that have been gap
				// sorted save a[i] in temp and make a hole at
				// position i
				int temp = arr[i];

				// shift earlier gap-sorted elements up until
				// the correct location for a[i] is found
				int j;
				for (j = i; j >= gap && arr[j - gap] > temp; j -= gap)
					arr[j] = arr[j - gap];

				// put temp (the original a[i]) in its correct
				// location
				arr[j] = temp;
			}
		}
		for (int j = 0; j < arr.length; j++) {
			System.out.println(arr[j]);
		}
		return true;
	}

}
