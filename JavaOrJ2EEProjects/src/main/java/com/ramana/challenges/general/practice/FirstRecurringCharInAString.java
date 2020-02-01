/**
 * 
 */
package com.ramana.challenges.general.practice;

import java.util.HashMap;
import java.util.Map;

/**
 * @author RamanaGorle
 *
 *Google
 */
public class FirstRecurringCharInAString {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String s = "DBCABA";
		Map<Character, Integer> map = new HashMap<>();
		
		for(int i=0;i<s.length();i++) {
			if(map.containsKey(s.charAt(i))) {
				System.out.println(s.charAt(i));
				break;
			}
			map.put(s.charAt(i), 1);
		}

	}

}
