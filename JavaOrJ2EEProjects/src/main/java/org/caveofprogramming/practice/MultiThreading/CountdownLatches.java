/**
 * 
 */
package org.caveofprogramming.practice.MultiThreading;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author RamanaGorle
 *
 *         Program 8
 */
public class CountdownLatches {

	/**
	 * CountDownLatch is a synchronization aid that allows one or more threads to
	 * wait until a set of operations being performed in other threads completes.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		CountDownLatch cl = new CountDownLatch(3);

		ExecutorService executor = Executors.newFixedThreadPool(3);

		for (int i = 0; i < 3; i++) {
			executor.submit(new Processor3(cl));
		}

		try {
			cl.await();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		System.out.println("Completed");
	}

}

class Processor3 implements Runnable {

	private CountDownLatch latch;

	public Processor3(CountDownLatch l) {
		this.latch = l;
	}

	@Override
	public void run() {
		System.out.println("Started..");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		latch.countDown();
	}

}