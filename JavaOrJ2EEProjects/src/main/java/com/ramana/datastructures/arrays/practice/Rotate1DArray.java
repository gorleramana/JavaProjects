/**
 * 
 */
package com.ramana.datastructures.arrays.practice;

/**
 * @author RamanaGorle
 *
 */
public class Rotate1DArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int arr[] = {3, 6, 8, 5, 12, 56, 23};
		leftRotateArray(arr, 2);
		rightRotateArray(arr, 2);
	}

	private static void leftRotateArray(int[] arr, int k) {
		// Using additional buffer
		int buffer[] = new int[arr.length];
		int j=0;
		for(int i=k;i<arr.length;i++,j++){
			buffer[j] = arr[i];
		}
		for(int l=0;l<k;l++){
			buffer[j] = arr[l];
			j++;
		}
		System.out.print("Left rotation: ");
		for(int m=0;m<buffer.length;m++){
			System.out.print(buffer[m]+" ");
		}
		System.out.println();
		//Using bubble sort logic, we can do this too
		
	}

	private static void rightRotateArray(int[] arr, int k) {
		int buffer[] = new int[arr.length];
		int j=0;
		for(int i=arr.length-k;i<arr.length;i++,j++){
			buffer[j] = arr[i];
		}
		for(int l=0;l<arr.length-k;l++){
			buffer[j] = arr[l];
			j++;
		}
		System.out.print("Right rotation: ");
		for(int m=0;m<buffer.length;m++){
			System.out.print(buffer[m]+" ");
		}
	}

}
