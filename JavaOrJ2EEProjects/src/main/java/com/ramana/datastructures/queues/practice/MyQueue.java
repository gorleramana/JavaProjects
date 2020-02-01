/**
 * 
 */
package com.ramana.datastructures.queues.practice;

import java.util.Stack;

/**
 * @author RamanaGorle
 *
 */
public class MyQueue {
	Stack<Integer> st1; 
	Stack<Integer>	st2;
	int length;
	
	public MyQueue(){
		st1 = new Stack<Integer>();
		st2 = new Stack<Integer>();
	}
	
	public void enqueue(int x){
		if(st1.isEmpty()){
			st1.push(x);
			return;
		} else {
			st1.push(x);
		}
		this.length = st1.size();
	}
	public int dequeue(){
		if(st1.isEmpty() && st2.isEmpty()){
			throw new IllegalStateException("Queue is empty");
		}
		if(st2.isEmpty()){
			while(!st1.isEmpty()){
				st2.push(st1.pop());
			}
			this.length = st2.size();
		}
		return st2.pop();
	}	
}
