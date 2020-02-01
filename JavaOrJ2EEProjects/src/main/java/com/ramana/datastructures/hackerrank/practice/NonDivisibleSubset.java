/**
 * 
 */
package com.ramana.datastructures.hackerrank.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

/**
 * @author RamanaGorle
 *
 */
public class NonDivisibleSubset {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] arr = { 278, 576, 496, 727, 410, 124, 338, 149, 209, 702, 282, 718, 771, 575, 436 };
		int k = 7;
		List<Integer> list = Arrays.stream(arr).boxed().collect(Collectors.toList());
		System.out.println(nonDivisibleSubset(k, list));

	}

	public static int nonDivisibleSubset(int k, List<Integer> s) {
		// Write your code here
		List<Integer> result = new ArrayList<>();
		for (int i = 0; i < s.size(); i++) {
			for (int j = i + 1; j < s.size(); j++) {
				int sum = s.get(i) + s.get(j);
				if (sum % k != 0) {
					if (!result.contains(s.get(i)))
						result.add(s.get(i));
					if (!result.contains(s.get(j)))
						result.add(s.get(j));
				}

			}
		}
		return result.size();
	}
}
