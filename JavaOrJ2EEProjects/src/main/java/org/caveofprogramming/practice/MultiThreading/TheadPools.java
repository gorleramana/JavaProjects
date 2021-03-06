/**
 * 
 */
package org.caveofprogramming.practice.MultiThreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 * @author RamanaGorle
 *
 *         Program 7
 */
public class TheadPools {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ExecutorService executor = Executors.newFixedThreadPool(2);

		for (int i = 0; i < 5; i++) {
			executor.submit(new Processor2(i));
		}
		executor.shutdown();
		System.out.println("All tasks submitted. ");
		try {
			executor.awaitTermination(1, TimeUnit.DAYS);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("All tasks completed.");
	}

}

class Processor2 implements Runnable {

	private int id;

	public Processor2(int id) {
		this.id = id;
	}

	@Override
	public void run() {
		System.out.println("Starting..." + id);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Completed..." + id);
	}
}