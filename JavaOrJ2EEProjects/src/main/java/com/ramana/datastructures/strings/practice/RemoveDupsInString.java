/**
 * 
 */
package com.ramana.datastructures.strings.practice;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * @author RamanaGorle
 *
 */
public class RemoveDupsInString {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your string here: ");
		String s = sc.nextLine();
		System.out.println("Removed duplicate chars in String: " + removeDuplicateChars(s));
		System.out.println("Removed duplicate chars in String: " + removeDuplicateChars2(s));
		System.out.println("Removed duplicate chars in String: " + removeDuplicateChars3(s));
		System.out.println("Removed duplicate chars in String: " + removeDuplicateChars4(s));
		sc.close();
	}

	/**
	 * Brute force technique using additional buffers (used a char array)
	 * 
	 * @param s
	 * @return
	 */
	public static String removeDuplicateChars(String s) {
		char[] chars = s.toCharArray();
		for (int i = 0; i < chars.length; i++) {
			for (int j = i + 1; j < chars.length; j++) {
				if (chars[i] == chars[j]) {
					chars[j] = ' ';
				}
			}
		}
		return new String(chars);
	}

	/**
	 * Sorting technique using additional buffers
	 * 
	 * @param s
	 * @return
	 */
	public static String removeDuplicateChars2(String s) {
		char[] chars = s.toCharArray();
		Arrays.sort(chars);
		//System.out.println("After sorting: "+new String(chars));
		for (int i = 0; i < chars.length; i++) {
			if (i+1<chars.length && chars[i] == chars[i + 1]) {
				chars[i + 1] = ' ';
			}
		}
		return new String(chars).replaceAll("\\s","");
	}
	/**
	 * Without using additional buffers
	 * 
	 * @param s
	 * @return
	 */
	public static String removeDuplicateChars3(String s) {
		Set<Character> st = new LinkedHashSet<>();
		for(int i=0;i<s.length();i++){
			st.add(s.charAt(i));
		}
		String s1 = "";
		for(Character c: st){
			s1 = s1 + c.toString();
		}
		return s1;
	}
	/**
	 * This me
	 * @param s
	 * @return
	 */
	public static String removeDuplicateChars4(String s) {
		    StringBuilder noDupes = new StringBuilder();
		    for (int i = 0; i < s.length(); i++) {
		        String si = s.substring(i, i + 1);
		        if (noDupes.indexOf(si) == -1) {
		            noDupes.append(si);
		        }
		    }
		    return noDupes.toString();
	}
}
