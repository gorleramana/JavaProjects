/**
 * 
 */
package com.ramana.corejava.general.practice;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * @author RamanaGorle
 *
 */
public class Solution {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		String s = in.nextLine();
		
		int n = getFirstRecurCharPos(s);
		System.out.println("First recur char pos:"+n);
		in.close();
	}

	private static int getFirstRecurCharPos(String s) {
		Map<Character, Integer> map = new HashMap<>();
		for(int i=0;i<s.length();i++){
			if(map.containsKey(s.charAt(i))){
				return i;
			} else {
				map.put(s.charAt(i), 1);
			}
		}
		return 0;
	}

}
