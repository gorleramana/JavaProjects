/**
 * 
 */
package com.ramana.datastructures.sortings.practice;

/**
 * @author RamanaGorle
 *
 */
public class SelectionSorting {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] arr = { 44, 22, 5, 1, 78, 34, 67, 12, 23, 56, 98, 112, 45 };
		System.out.println("Sorted array is: " + selectionSort(arr));
	}

	/**
	 * Select first element as key, then search for the least item on the whole
	 * remaining list, and then swap first and the least
	 * 
	 * Time complexity: o(n*n)
	 * 
	 * @param arr
	 * @return
	 */
	private static boolean selectionSort(int[] arr) {
		int temp;
		for (int i = 0; i < arr.length; i++) {
			// min = arr[i];
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					temp = arr[j];
					arr[j] = arr[i];
					arr[i] = temp;
				}
			}
		}
		for (int l = 0; l < arr.length; l++) {
			System.out.println(arr[l]);
		}
		return true;
	}

}
