/**
 * 
 */
package com.ramana.datastructures.stacks.practice;

import java.util.Stack;

/**
 * @author RamanaGorle
 *
 */
public class MinEleStack {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		MyStack s = new MyStack();
		s.push(3);
		s.push(5);
		s.getMin();
		s.push(2);
		s.push(1);
		s.getMin();
		s.pop();
		s.getMin();
		s.pop();
		s.peek();
	}

}

class MyStack {
	private Stack<Integer> s;
	private Integer minEle;

	MyStack() {
		s = new Stack<Integer>();
	}

	public void getMin() {
		if (s.isEmpty()) {
			System.out.println("Stack is empty");
			return;
		}
		System.out.println("Min element: " + minEle);
	}

	public void peek() {
		if (s.isEmpty()) {
			System.out.println("Stack is empty");
			return;
		}
		Integer t = s.peek();
		if (t < minEle) {
			System.out.println("Top Element is: " + minEle);
		} else {
			System.out.println("Top Element is: " + t);
		}
	}

	public void pop() {
		if (s.isEmpty()) {
			System.out.println("Stack is empty");
			return;
		}
		Integer t = s.pop();
		if (t < minEle) {
			System.out.println("Element removed: " + minEle);
			minEle = 2 * minEle - t;
		} else {
			System.out.println("Element removed: " + t);
		}
	}

	public void push(Integer x) {
		if (s.isEmpty()) {
			minEle = x;
			s.push(x);
			System.out.println("Element inserted: " + x);
			return;
		}
		if (x < minEle) {
			s.push(2 * x - minEle);
			minEle = x;
		} else {
			s.push(x);
		}
		System.out.println("Number inserted: " + x);
	}
}
