/**
 * 
 */
package com.ramana.challenges.general.practice;

/**
 * @author RamanaGorle
 *
 */
public class ReverseString {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String s = "Hello";
		
		StringBuilder sb = new StringBuilder(s);
		System.out.println(sb.reverse().toString());
		
		StringBuilder sb2 = new StringBuilder();//To avoid creating multiple strings (creating references)
		for(int i=s.length()-1;i>=0;i--) {
			sb2.append(s.charAt(i));
		}
		System.out.println(sb2.toString());
		
		for(int i=s.length()-1;i>=0;i--) {
			System.out.print(s.charAt(i));
		}
	}

}
