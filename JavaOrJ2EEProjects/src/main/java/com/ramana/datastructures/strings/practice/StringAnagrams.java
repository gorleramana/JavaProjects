/**
 * 
 */
package com.ramana.datastructures.strings.practice;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author RamanaGorle
 *
 */
public class StringAnagrams {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your strings here: ");
		String s1 = sc.next();
		String s2 = sc.next();
		System.out.println("Strings are Anagrams: "+areAnagrams(s1, s2));
		sc.close();
	}

	/**
	 * Sorting approach 
	 * 
	 * @param s1
	 * @param s2
	 * @return
	 */
	private static boolean areAnagrams(String s1, String s2) {
		char[] chars1 = s1.toCharArray();
		char[] chars2 = s2.toCharArray();
		Arrays.sort(chars1);
		Arrays.sort(chars2);
		//System.out.println(chars1.equals(chars2));//false
		//System.out.println(chars1.toString().equals(chars2.toString()));//false
		
		return Arrays.equals(chars1, chars2);
	}

}
