/**
 * 
 */
package org.caveofprogramming.practice.MultiThreading;

import java.util.Scanner;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author RamanaGorle
 *
 *         Program 12
 */
public class ReEntrantLocks {

	/**
	 * @param args
	 * @throws InterruptedException
	 */
	public static void main(String[] args) throws InterruptedException {
		final Runner r = new Runner();

		Thread t1 = new Thread(new Runnable() {

			@Override
			public void run() {
				try {
					r.firstThread();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}

		});

		Thread t2 = new Thread(new Runnable() {

			@Override
			public void run() {
				try {
					r.secondThread();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}

		});

		t1.start();
		t2.start();

		t1.join();
		t2.join();

		r.finished();
	}

}

class Runner {
	private int count = 0;
	private Lock lock = new ReentrantLock();
	private Condition cd = lock.newCondition();

	private void increment() {
		for (int i = 0; i < 10000; i++)
			count++;
	}

	public void firstThread() throws InterruptedException {
		lock.lock();
		System.out.println("Waiting...");
		cd.await();
		System.out.println("Woken up...");

		try {
			increment();
		} finally {
			lock.unlock();
		}

	}

	public void secondThread() throws InterruptedException {
		lock.lock();
		Thread.sleep(1000);

		System.out.println("Press return key..");
		Scanner sc = new Scanner(System.in);
		sc.nextLine();
		System.out.println("Return key pressed..");
		sc.close();
		cd.signal();

		try {
			increment();
		} finally {
			lock.unlock();
		}
	}

	public void finished() {
		System.out.println("Total count: " + count);
	}
}