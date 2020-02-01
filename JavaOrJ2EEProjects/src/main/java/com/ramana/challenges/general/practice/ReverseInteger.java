/**
 * 
 */
package com.ramana.challenges.general.practice;

/**
 * @author RamanaGorle
 *
 */
public class ReverseInteger {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int a = 2345;
		StringBuilder sb = new StringBuilder(String.valueOf(a));
		System.out.println(Integer.parseInt(sb.reverse().toString()));
		
		//without using parseInt
		StringBuilder sb2 = new StringBuilder(String.valueOf(a));
		String s = sb2.reverse().toString();
		for(int i=0;i<s.length();i++) {
			int r = s.charAt(i)-'0';
			System.out.print(r);//still printing them as separate integers
		}
		
		System.out.println();
		
		int r = 0;
		int l = s.length()-1;
		for(int i=0;i<s.length();i++) {
			int x = s.charAt(i)-'0';
			r = (int) (r + x*Math.pow(10, l--));
		}
		System.out.println(r);
		
		//without using the math functions 
		int rev = 0;
		while(a!=0) {
			rev = rev*10 + a%10;
			a /= 10;
		}
		System.out.println(rev);
	}

}
