/**
 * 
 */
package com.ramana.datastructures.stacks.practice;

import java.util.LinkedList;
import java.util.Stack;

/**
 * @author RamanaGorle
 *
 */
public class SetOfStacks {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		MyStackSet setOfStacks = new MyStackSet();
		setOfStacks.push(1);
		setOfStacks.push(2);
		setOfStacks.push(3);
		setOfStacks.push(4);
		setOfStacks.push(5);
		setOfStacks.push(6);
		setOfStacks.push(7);
		setOfStacks.push(8);
		setOfStacks.push(9);
		setOfStacks.printStacks();
		setOfStacks.popAt(1);
        setOfStacks.popAt(0);
        setOfStacks.printStacks();
	}

}

class MyStackSet {
	private Integer THRESHOLD = 3;
	private LinkedList<Stack<Integer>> listOfStacks = new LinkedList<Stack<Integer>>();;

	public void push(Integer x) {
		if (listOfStacks.isEmpty() || listOfStacks.getLast().size() >= THRESHOLD) {
			Stack<Integer> stack = new Stack<Integer>();
			stack.push(x);
			listOfStacks.add(stack);
		} else {
			listOfStacks.getLast().push(x);
		}
	}

	public Integer pop() {
		if (listOfStacks.isEmpty()) {
			throw new IllegalStateException("List is empty");
		}
		Stack<Integer> last = listOfStacks.getLast();
		int k = last.pop();
		if (last.isEmpty()) {
			listOfStacks.removeLast();
		}
		return k;
	}

	public Integer peek() {
		if (listOfStacks.isEmpty()) {
			throw new IllegalStateException("List is empty");
		}
		return listOfStacks.getLast().peek();
	}

	public void printStacks() {
		for (Stack<Integer> stack : listOfStacks) {
			for (int item : stack) {
				System.out.print(item + " ");
			}
			System.out.println();
		}
	}

	public Integer popAt(int index) {
		if (listOfStacks.isEmpty()) {
			throw new IllegalStateException("List is empty");
		}
		if (index < 0 || index > listOfStacks.size()) {
			throw new IllegalStateException("Not a valid index");
		}
		int x = listOfStacks.get(index).pop();
		for (int i = index; i < listOfStacks.size() - 1; i++) {
			Stack<Integer> curr = listOfStacks.get(i);
			Stack<Integer> next = listOfStacks.get(i + 1);
			curr.push(next.remove(0));
		}
		if (listOfStacks.getLast().isEmpty()) {
			listOfStacks.removeLast();
		}
		return x;
	}
}