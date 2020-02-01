/**
 * 
 */
package com.ramana.datastructures.strings.practice;

import java.util.Scanner;

/**
 * This is the question I faced in face book first round of interview
 * 
 * @author RamanaGorle
 *
 */
public class CharNumInAString {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		//String s = "AAABBCDDEEA";
		System.out.println(printRepeatedChars(s));
		sc.close();
	}

	private static String printRepeatedChars(String s) {
		String output = null;
		char chars[] = s.toCharArray();
		int count = 0;
		for(int i=0;i<chars.length;i++){
			if(output == null){
				output = String.valueOf(chars[i]);
				count = count+1;
			} else {
				if(chars[i-1] == chars[i]){
					count = count +1;
				} else {
					output = output + String.valueOf(count) + String.valueOf(chars[i]);
					count =1;
				}
			}
		}
		output = output + String.valueOf(count);
		return output;
	}

}
