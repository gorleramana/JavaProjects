/**
 * 
 */
package com.ramana.datastructures.sortings.practice;

/**
 * @author RamanaGorle
 *
 */
public class InsertionSorting {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] arr = { 44, 22, 5, 1, 78, 34, 67, 12, 23, 56, 98, 112, 45 };
		System.out.println("Sorted array is: " + insertionSort(arr));
	}

	/**
	 * First as key, select the second element and compare with first and then
	 * swap if necessary, then loop through the previous list again to see they are
	 * ordered properly else swap it again
	 * 
	 * Time complexity: o(n*n)
	 * 
	 * @param arr
	 * @return
	 */
	private static boolean insertionSort(int[] arr) {

		int temp;
		for (int i = 1; i < arr.length; i++) {
			for (int j = i; j > 0; j--) {
				if (arr[j - 1] > arr[j]) {
					temp = arr[j];
					arr[j] = arr[j - 1];
					arr[j - 1] = temp;
				}
			}
		}
		for (int l = 0; l < arr.length; l++) {
			System.out.println(arr[l]);
		}
		return true;
	}

}
