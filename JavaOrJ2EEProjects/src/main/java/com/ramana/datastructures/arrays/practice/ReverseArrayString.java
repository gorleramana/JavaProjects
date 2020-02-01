/**
 * 
 */
package com.ramana.datastructures.arrays.practice;

/**
 * @author RamanaGorle
 *
 */
public class ReverseArrayString {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int arr[] = { 3, 6, 8, 5, 12, 56, 23 };
		String s = "what am doing";
		char chars[] = s.toCharArray();
		int c=0, e=chars.length-1;
		reversedString(chars, c, e);
		printString(chars);
		System.out.println();
		int start = 0, end = arr.length - 1;
		reversedArray(arr, start, end);
		printArry(arr);
	}
	private static void printString(char[] arr) {
		System.out.println(arr.toString());
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	private static void reversedString(char[] arr, int start, int end) {
		// using buffer , you can just add the elements in reverse order
		// without using butter swap them
		if (start >= end)
			return;
		char temp = arr[start];
		arr[start] = arr[end];
		arr[end] = temp;
		reversedString(arr, start + 1, end - 1);
	}
	private static void printArry(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	private static void reversedArray(int[] arr, int start, int end) {
		// using buffer , you can just add the elements in reverse order
		// without using butter swap them
		if (start >= end)
			return;
		int temp = arr[start];
		arr[start] = arr[end];
		arr[end] = temp;
		reversedArray(arr, start + 1, end - 1);
	}

}
