/**
 * 
 */
package com.ramana.datastructures.stacks.practice;

import java.util.Stack;

/**
 * @author RamanaGorle
 *
 */
public class SortingStack {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Stack<Integer> s1 = new Stack<Integer>();
		s1.push(22);
		s1.push(11);
		s1.push(45);
		s1.push(99);
		s1.push(55);
		s1.push(77);
		s1.push(100);
		s1.push(34);
		sortedStack(s1);
	}

	private static void sortedStack(Stack<Integer> s) {
		Stack<Integer> tempStack = new Stack<Integer>();
		while(!s.isEmpty()){
			int temp = s.pop();
			while(!tempStack.isEmpty() && tempStack.peek()>temp ){
				s.push(tempStack.pop());
			}
			tempStack.push(temp);
		}
		System.out.println("Sorted elements are : ");
		int length = tempStack.size();
		for(int i=0;i<length;i++){
			System.out.print(tempStack.pop()+" ");
		}
	}

}
