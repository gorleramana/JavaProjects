/**
 * 
 */
package com.ramana.datastructures.hackerrank.practice;

import java.util.HashMap;
import java.util.Map;

/**
 * @author RamanaGorle
 *
 */
public class DivisibleSumPairs {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] arr = { 1, 3, 2, 6, 1, 2 };
		System.out.println(divisibleSumPairs(6, 3, arr));
	}

	static int divisibleSumPairs(int n, int k, int[] ar) {
		int count = 0;
		Map<Integer, Integer> pairs = new HashMap<>();
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (i != j && (ar[i] + ar[j]) % k == 0
						&& (pairs.isEmpty() || !(pairs.containsKey(i)) && !(pairs.get(i) == j))) {

					pairs.put(i, j);
					count++;
				}
			}
		}
		return count;
	}
}
