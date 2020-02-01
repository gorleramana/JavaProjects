/**
 * 
 */
package org.caveofprogramming.practice.MultiThreading;

/**
 * @author RamanaGorle
 *
 *         Program 5
 */
public class SynchronizedKeyword {
	// Check making below int by volatile variable, still problem persists
	private int count = 0;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		SynchronizedKeyword sk = new SynchronizedKeyword();
		sk.doWork();
	}

	// Solution for all those issues is below
	public synchronized void increment() {
		count++;
	}

	public void doWork() {
		Thread t1 = new Thread(new Runnable() {

			public void run() {
				for (int i = 0; i < 10000; i++)
					// count++;
					increment();
			}

		});

		Thread t2 = new Thread(new Runnable() {

			public void run() {
				for (int i = 0; i < 10000; i++)
					// count++;
					increment();
			}

		});

		t1.start();
		t2.start();

		// problem 1: without below joins , you get inconsistent results (exp value:
		// 20000)
		// problem 2: even with below joins, you get inconsistent results (exp value:
		// 20000)
		try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		System.out.println("Count updated value: " + count);
	}
}
