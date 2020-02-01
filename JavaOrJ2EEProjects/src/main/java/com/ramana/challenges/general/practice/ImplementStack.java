/**
 * 
 */
package com.ramana.challenges.general.practice;

/**
 * @author RamanaGorle
 *
 */
public class ImplementStack {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//Test , yet to test, it's failing
		MyStack ms = new MyStack(5);
		ms.push(4);
		ms.push(6);
		ms.push(9);
		ms.push(43);
		ms.pop();
		ms.push(10);
		ms.push(34);
		ms.pop();
		ms.push(90);
		
		if(!ms.isEmpty())
		System.out.println(ms.peek());
	}

}

class MyStack {
	private int array[];
	private int top;
	private int capacity;

	MyStack(int cap) {
		this.array = new int[capacity];
		this.capacity = cap;
		this.top = -1;
	}

	public void push(int item) {
		if (isFull())
			throw new RuntimeException("Stack is Full");
		array[++top] = item;
	}

	public int pop() {
		if (isEmpty())
			throw new RuntimeException("Stack is Empty");
		return array[top--];
	}

	public int peek() {
		return array[top];
	}

	public boolean isEmpty() {
		return top == -1;
	}

	public boolean isFull() {
		return top == capacity - 1;
	}
}