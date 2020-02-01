/**
 * 
 */
package org.caveofprogramming.practice.MultiThreading;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * @author RamanaGorle Program 6
 */
public class MultipleLocks {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Starting....");
		final Worker w = new Worker();
		long start = System.currentTimeMillis();

		Thread t1 = new Thread(new Runnable() {
			@Override
			public void run() {
				w.process();
			}
		});

		Thread t2 = new Thread(new Runnable() {
			@Override
			public void run() {
				w.process();
			}
		});

		t1.start();
		t2.start();

		try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		long end = System.currentTimeMillis();
		System.out.println("Diff: " + (end - start));
		System.out.println("List1: " + w.l1.size() + " List2: " + w.l2.size());
	}

}

class Worker {
	private Object lock1 = new Object();
	private Object lock2 = new Object();

	private Random r = new Random();
	List<Integer> l1 = new ArrayList<>();
	List<Integer> l2 = new ArrayList<>();

	public void stageOne() {
		synchronized (lock1) {

			try {
				Thread.sleep(1);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			l1.add(r.nextInt(100));
		}
	}

	public void stageTwo() {
		synchronized (lock2) {
			try {
				Thread.sleep(1);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			l2.add(r.nextInt(100));
		}
	}

	public void process() {
		for (int i = 0; i < 1000; i++) {
			stageOne();
			stageTwo();
		}
	}
}