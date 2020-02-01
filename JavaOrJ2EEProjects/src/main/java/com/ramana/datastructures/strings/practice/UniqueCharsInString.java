/**
 * 
 */
package com.ramana.datastructures.strings.practice;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * @author RamanaGorle
 *
 */
public class UniqueCharsInString {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your string here: ");
		String s = sc.next();

		if (hasUniqueChars(s) && hasUniqueChars2(s) && hasUniqueChars3(s) && hasUniqueChars4(s)) {
			System.out.println("Entered string has all unique chars");
		} else {
			System.out.println("Entered string has not unique chars");
		}

		sc.close();
	}

	/**
	 * Brute force technique approach - use two loops
	 * 
	 * @param s
	 * @return
	 */
	public static boolean hasUniqueChars(String s) {
		for (int i = 0; i < s.length(); i++) {
			for (int j = i + 1; j < s.length(); j++) {
				if (s.charAt(i) == s.charAt(j)) {
					return false;
				}
			}
		}
		return true;
	}

	/**
	 * Sorting approach with additional buffer
	 * 
	 * @param s
	 * @return
	 */
	public static boolean hasUniqueChars2(String s) {
		char[] chars = s.toCharArray();
		Arrays.sort(chars);
		for (int i = 0; i < chars.length; i++) {
			if (i + 1 < chars.length && chars[i] == chars[i + 1]) {
				return false;
			}
		}
		return true;
	}

	/**
	 * Using an additional buffer
	 * 
	 * @param s
	 * @return
	 */
	public static boolean hasUniqueChars3(String s) {
		char[] chars = s.toCharArray();
		Map<Character, Integer> map = new HashMap<>();
		for (int i = 0; i < chars.length; i++) {
			if (map.isEmpty()) {
				map.put(chars[i], 1);
			} else {
				if (map.containsKey(chars[i])) {
					return false;
				}
				map.put(chars[i], 1);
			}
		}
		return true;
	}

	/**
	 * Using string methods and without using buffer
	 * 
	 * @param s
	 * @return
	 */
	public static boolean hasUniqueChars4(String s) {
		for (int i = 0; i < s.length(); i++) {
			if ((s.substring(i + 1, s.length())).contains(String.valueOf(s.charAt(i)))) {
				return false;
			}
		}
		return true;
	}
}
