/**
 * 
 */
package com.ramana.datastructures.queues.practice;

/**
 * @author RamanaGorle
 *
 */
public class QueueWithTwoStacks {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		MyQueue queue = new MyQueue();
		queue.enqueue(22);
		queue.enqueue(66);
		queue.enqueue(34);
		queue.enqueue(90);
		queue.enqueue(100);
		queue.enqueue(12);
		queue.enqueue(9);
		queue.enqueue(3);
		queue.enqueue(67);
		queue.enqueue(45);
		System.out.println("Dequeue the elements in the same order: FIFO");
		for(int i=0;i<queue.length;i++){
			System.out.print(queue.dequeue()+" ");
		}
	}

}