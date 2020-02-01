/**
 * 
 */
package com.ramana.challenges.general.practice;

/**
 * @author RamanaGorle
 *
 *Google 
 */
public class ReturnNextIntegerFromIntArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int arr[] = {3,4,5,6};//return 3,4,5,7 value
		int arr2[] = {9,9,9};//return 1,0,0,0 value
		
		System.out.println(getNextInteger(arr));
	}

	private static int[] getNextInteger(int[] arr) {
		int result[]	 = new int[arr.length];
		
		for(int i=arr.length-1;i>=0;i--) {
			
		}
		return result;
	}

}
