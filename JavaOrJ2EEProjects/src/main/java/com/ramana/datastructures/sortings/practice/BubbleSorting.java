/**
 * 
 */
package com.ramana.datastructures.sortings.practice;

/**
 * @author RamanaGorle
 *
 */
public class BubbleSorting {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] arr = { 44, 22, 5, 1, 78, 34, 67, 12, 23, 56, 98, 112, 45 };
		System.out.println("Sorted array is: " + bubbleSort(arr));
	}

	/**
	 * Compare first two elements, swap them if needed, then move to next two
	 * and so on. Once an iteration is complete.Do the same again in next
	 * iteration until n iterations.
	 * 
	 * Time complexity: Best - o(n), Average - o(n*n), Worst - o(n*n)
	 * 
	 * @param arr
	 * @return
	 */
	private static boolean bubbleSort(int[] arr) {
		for (int l = 0; l < arr.length - 1; l++) {
			for (int m = 0; m < arr.length - 1 - l; m++) {
				if (arr[m] > arr[m + 1]) {
					int temp = arr[m + 1];
					arr[m + 1] = arr[m];
					arr[m] = temp;
				}
			}
		}
		for (int j = 0; j < arr.length; j++) {
			System.out.println(arr[j]);
		}
		return true;
	}

}
