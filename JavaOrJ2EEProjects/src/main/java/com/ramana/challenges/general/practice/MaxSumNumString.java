/**
 * 
 */
package com.ramana.challenges.general.practice;

import java.util.Scanner;
import java.util.regex.Pattern;

/**
 * @author RamanaGorle
 *
 */
public class MaxSumNumString {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		//int n = Integer.parseInt(s);
		if (s.length()<1 || s.length() > Math.pow(10, 6)) {
			sc.close();
			throw new IllegalStateException("Enter valid string");
		}
		Pattern pattern = Pattern.compile(".*\\D.*");
		if(pattern.matcher(s).matches()){
			sc.close();
			throw new IllegalStateException("Enter number string only:");
		}
		char[] chars = s.toCharArray();
		int[] digits = new int[chars.length];
		for(int i=0;i<chars.length;i++){
			digits[i] = Integer.parseInt(String.valueOf(chars[i]));
		}
		int multiple=1;
		int addition = 0;
		for(int j=0;j<digits.length-1;j++){
			if(j<digits.length-2 && (digits[j]!=0 && digits[j]!=1) && (digits[j+1]!=0 && digits[j+1]!=1)){
				multiple = multiple*digits[j]*digits[j+1];
				j++;
			} else {
				addition = addition +digits[j];
			}
		}
		//TODO:Not completed
		System.out.println();
		System.out.println("Max possible sum: "+multiple+addition);
		sc.close();
	}

}
