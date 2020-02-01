/**
 * 
 */
package org.caveofprogramming.practice.MultiThreading;

import java.util.Random;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

/**
 * @author RamanaGorle
 * 
 *         program 9
 *
 */
public class ProducerConsumer {

	private static BlockingQueue<Integer> bq = new ArrayBlockingQueue<>(10);

	/**
	 * @param args
	 * @throws InterruptedException
	 */
	public static void main(String[] args) throws InterruptedException {

		Thread t1 = new Thread(new Runnable() {

			@Override
			public void run() {
				try {
					producer();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}

		});

		Thread t2 = new Thread(new Runnable() {

			@Override
			public void run() {
				try {
					consumer();
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

	public static void producer() throws InterruptedException {
		Random r = new Random();
		while (true) {
			bq.put(r.nextInt(100));
		}
	}

	public static void consumer() throws InterruptedException {
		Random r = new Random();
		while (true) {
			Thread.sleep(100);
			if (r.nextInt(10) == 0) {
				Integer v = bq.take();
				System.out.println("Taken value: " + v + " Queue size is: " + bq.size());
			}
		}
	}
}
