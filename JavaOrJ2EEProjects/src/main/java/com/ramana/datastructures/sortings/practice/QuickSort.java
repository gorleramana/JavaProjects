/**
 * 
 */
package com.ramana.datastructures.sortings.practice;

import java.util.Arrays;

/**
 * @author RamanaGorle
 *
 */
public class QuickSort {

	private static int[] theArray;
	private static int arraySize;
	/**
	 * @param args
	 */
	public static void main(String[] args) {

		QuickSort quickSort = new QuickSort(10);
		quickSort.generateRandomArray();
		System.out.println(Arrays.toString(QuickSort.theArray));
		
		quickSort.partitionArray(35);
		System.out.println(Arrays.toString(QuickSort.theArray));
	}

	public void partitionArray(int pivot){
		int leftPointer = -1;
		int rightPointer = arraySize;
		while(true){
			while(leftPointer<(arraySize-1) && theArray[++leftPointer]<pivot);
				//printHorzArray(leftPointer, rightPointer);
				System.out.println(theArray[leftPointer]+" in index "+leftPointer+" is bigger then the pivot value "+pivot);
				while(rightPointer>0 && theArray[--rightPointer]>pivot);
				//printHorzArray(leftPointer, rightPointer);
				System.out.println(theArray[rightPointer]+" in index "+rightPointer+" is smaller then the pivot value "+pivot);
				//printHorzArray(leftPointer, rightPointer);
				
				if(leftPointer>=rightPointer)break;
				else {
				//	swapValues(leftPointer,rightPointer);
					System.out.println(theArray[leftPointer]+" was swapped for "+theArray[rightPointer]);
				}
		}
	}
	QuickSort (int newArraySize){
		this.arraySize = newArraySize;
		theArray = new int[arraySize];
		generateRandomArray();
	}

	private void generateRandomArray() {
		// TODO Auto-generated method stub
		
	}
}
