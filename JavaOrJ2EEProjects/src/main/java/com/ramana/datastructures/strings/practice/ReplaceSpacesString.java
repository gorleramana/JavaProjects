/**
 * 
 */
package com.ramana.datastructures.strings.practice;

import java.util.Scanner;

/**
 * @author RamanaGorle
 *
 */
public class ReplaceSpacesString {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your string here: ");
		String s1 = sc.nextLine();
		System.out.println("String without spaces: " + replacedString(s1));
		sc.close();
	}

	/**
	 * For loop
	 * 
	 * @param s1
	 * @return
	 */
	private static String replacedString(String s1) {
		int spaceCount = 0;
		char[] chars = s1.toCharArray();
		for (int i = 0; i < s1.length(); i++) {
			if (s1.charAt(i) == ' ') {
				spaceCount++;
			}
		}
		char[] newchars = new char[spaceCount * 2 + chars.length];
		for (int j = 0, k = 0; j < newchars.length; k++, j++) {
			if (chars[k] == ' ') {
				newchars[j] = '%';
				newchars[j + 1] = '2';
				newchars[j + 2] = '0';

				j = j + 2;
			} else {
				newchars[j] = chars[k];
			}
		}
		return new String(newchars);
	}

}
