/**
 * 
 */
package com.ramana.challenges.general.practice;

import java.util.HashMap;
import java.util.Map;

/**
 * @author RamanaGorle
 *
 */
public class TwoSum {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] arr = { -2, 3, 7, 4, 8 };
		int r[] = returnIndices(arr, 6);
		for (int i = 0; i < r.length; i++) {
			System.out.print(r[i]+" ");
		}
		System.out.println();
		int[] arr2 = { 2, 3, 7, 3, 8 };
		int r2[] = returnIndices2(arr2, 6);
		if (r2 != null) {
			for (int i = 0; i < r.length; i++) {
				System.out.print(r2[i]+" ");
			}
		} else {
			System.out.println("There is no such pair exists.");
		}

	}

	private static int[] returnIndices(int[] arr, int total) {
		// Brute force algorithm
		int[] ind = new int[2];
		int k = 0;
		for (int i = 0; i < arr.length; i++) {

			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] + arr[j] == total) {
					ind[k++] = i;
					ind[k++] = j;
				}
			}
		}
		return ind;

	}

	private static int[] returnIndices2(int[] arr, int total) {
		Map<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < arr.length; i++) {
			if (map.containsKey(total - arr[i])) {
				return new int[] { i, map.get(total - arr[i]) };
			}
			map.put(arr[i], i);
		}
		return null;

	}
}
