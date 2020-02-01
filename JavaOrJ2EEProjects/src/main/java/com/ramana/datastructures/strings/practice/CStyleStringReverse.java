/**
 * 
 */
package com.ramana.datastructures.strings.practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 * @author RamanaGorle
 *
 */
public class CStyleStringReverse {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your string here: ");
		String s = sc.nextLine();
		System.out.println("Reversed string: "+reverseString(s));
		System.out.println("Reversed string: "+reverseString2(s));
		System.out.println("Reversed string: "+reverseString3(s));
		System.out.println("Reversed string: "+reverseString4(s));
		reverseString5(s);
		sc.close();
	}
	/**
	 * Using StringBuffer reverse method
	 * 
	 * @param s
	 * @return
	 */
	public static String reverseString(String s){
		StringBuffer sb = new StringBuffer(s);
		sb.reverse();
		return sb.toString();
	}
	/**
	 * Rotate each char
	 * @param s
	 * @return
	 */
	public static String reverseString2(String s){
		char[] chars = s.toCharArray();
		char temp;
		for(int i=0, j=chars.length-1;i<j;i++,j--){
			temp = chars[i];
			chars[i] = chars[j];
			chars[j] = temp;
		}
		return new String(chars);
	}
	/**
	 * This method without using additional buffer
	 */
	public static String reverseString3(String s){
		String returnS = "";
		for(int i=s.length()-1;i>=0;i--){
			returnS = returnS + s.charAt(i);
		}
		return returnS;
	}
	/**
	 * Use byte
	 */
	public static String reverseString4(String s){
		
		byte []inputString = s.getBytes();
		byte []result = new byte[inputString.length];
		for(int i=0;i<inputString.length;i++){
			result[i] = inputString[inputString.length-1-i];
		}
		return new String(result);
	}
	/**
	 * Use Collections
	 */
	public static void reverseString5(String s){
		
		List<Character> list = new ArrayList<>();
		for(int i=0;i<s.length();i++){
			list.add(s.charAt(i));
		}
		Collections.reverse(list);
		System.out.print("Reversed string: ");
		list.forEach(System.out::print);
	}

}
