/**
 * 
 */
package com.ramana.datastructures.stacks.practice;

import java.util.Scanner;
import java.util.Stack;

/**
 * @author RamanaGorle
 *
 */
public class ArrayInto3Stacks {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter the size of the array: ");
//		int n = sc.nextInt();
//		int[] arr = new int[n];
//		System.out.println("Enter the elements into the array: ");
//		for(int i=0;i<n;i++){
//			arr[i] = sc.nextInt();
//		}
		int[] arr = { 44, 22, 5, 1, 78, 34, 67, 12, 23, 56, 98, 112, 45 };
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		int n = arr.length;
		Stack<Integer> s1 = new Stack<Integer>();
		Stack<Integer> s2 = new Stack<Integer>();
		Stack<Integer> s3 = new Stack<Integer>();
		for(int k=0;k<n/3;k++){
			s1.push(arr[k]);
		}
		for(int l=n/3;l<2*n/3;l++){
			s2.push(arr[l]);
		}
		for(int m=2*n/3;m<n;m++){
			s3.push(arr[m]);
		}
		System.out.println("Display the stacks: ");
		System.out.println("Stack one: ");
		while(!s1.isEmpty()){
			System.out.print(s1.pop()+" ");
		}
		System.out.println();
		System.out.println("Stack Two: ");
		while(!s2.isEmpty()){
			System.out.print(s2.pop()+" ");
		}
		System.out.println();
		System.out.println("Stack Three: ");
		while(!s3.isEmpty()){
			System.out.print(s3.pop()+" ");
		}
		System.out.println();
		sc.close();
	}
}
