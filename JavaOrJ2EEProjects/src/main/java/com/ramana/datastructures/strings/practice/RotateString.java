/**
 * 
 */
package com.ramana.datastructures.strings.practice;

import java.util.Scanner;

/**
 * @author RamanaGorle
 *
 */
public class RotateString {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your strings here: ");
		String s1 = sc.next();
		String s2 = sc.next();
		System.out.println("s2 is a rotation of s1: " + isSubstring(s1, s2));
		System.out.println("s2 is a rotation of s1: " + isSubstring2(s1, s2));
		sc.close();
	}

	/**
	 * using indexOf method
	 * 
	 * @param s1
	 * @param s2
	 * @return
	 */
	private static boolean isSubstring(String s1, String s2) {
		return (s1.length() == s2.length()) && ((s1 + s1).indexOf(s2) != -1);
	}

	/**
	 * using substring method
	 * 
	 * @param s1
	 * @param s2
	 * @return
	 */
	private static boolean isSubstring2(String s1, String s2) {
		String s3 = s1 + s1;
		for (int i = 0; i < s2.length(); i++) {
			if (s1.length() == s2.length() && s2.equalsIgnoreCase(s3.substring(i, i + s2.length()))) {
				return true;
			}
		}
		return false;
	}

}
