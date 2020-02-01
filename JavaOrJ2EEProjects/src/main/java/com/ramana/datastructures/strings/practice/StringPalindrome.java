/**
 * 
 */
package com.ramana.datastructures.strings.practice;

import java.util.Scanner;

/**
 * @author RamanaGorle
 *
 */
public class StringPalindrome {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your string here: ");
		String s1 = sc.next();
		System.out.println("String is palindrome: " + isPalindrome(s1));
		sc.close();
	}

	/**
	 * StringBuffer approach
	 * @param s1
	 * @return
	 */
	private static boolean isPalindrome(String s1) {
		StringBuffer s2 = new StringBuffer(s1);
		s2.reverse();
		if (s2.toString().equals(s1)) {
			return true;
		}
		return false;
	}
}
