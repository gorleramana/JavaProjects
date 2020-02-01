/**
 * 
 */
package org.caveofprogramming.practice.MultiThreading;

import java.util.LinkedList;
import java.util.Random;

/**
 * @author RamanaGorle
 *
 *         Program 11
 */
public class LowLevelSynchronization {

	/**
	 * @param args
	 * @throws InterruptedException
	 */
	public static void main(String[] args) throws InterruptedException {
		final Processor5 p = new Processor5();

		Thread t1 = new Thread(new Runnable() {

			@Override
			public void run() {
				try {
					p.produce();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}

		});

		Thread t2 = new Thread(new Runnable() {

			@Override
			public void run() {
				try {
					p.consume();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}

		});

		t1.start();
		t2.start();

		t1.join();
		t2.join();
	}
}

class Processor5 {
	private LinkedList<Integer> list = new LinkedList<>();
	private final int LIMIT = 10;
	private Object lock = new Object();

	public void produce() throws InterruptedException {
		int value = 0;
		while (true) {
			synchronized (lock) {
				if (list.size() == LIMIT) {
					lock.wait();
				}
				list.add(value++);
				lock.notify();
			}
		}

	}

	/**
	 * Synchronized block is more preferred way because it doesn’t lock the Object,
	 * synchronized methods lock the Object and if there are multiple
	 * synchronization blocks in the class, even though they are not related, it
	 * will stop them from execution and put them in wait state to get the lock on
	 * Object.
	 * 
	 * @throws InterruptedException
	 */
	public void consume() throws InterruptedException {
		Random r = new Random();
		while (true) {
			synchronized (lock) {
				if (list.size() == 0) {
					lock.wait();
				}
				System.out.print("List size: " + list.size());
				int v = list.removeFirst();
				System.out.println(" ; Removed value: " + v);
				lock.notify();
			}
			Thread.sleep(r.nextInt(1000));
		}

	}
}