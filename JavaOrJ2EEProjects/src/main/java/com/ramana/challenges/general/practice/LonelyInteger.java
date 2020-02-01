/**
 * 
 */
package com.ramana.challenges.general.practice;

/**
 * @author RamanaGorle
 *
 */
public class LonelyInteger {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] arr = { 0, 5, 13, 19, 33, 41, 0, 19, 5, 13, 33 };
		int result = arr[0];
		for(int i=1;i<arr.length;i++){
			result = result^arr[i];
		}
		/**
		 * Lonely Integer: which is not repeated
		 */
		System.out.println("Lonely integer is: "+result);
	}

}
