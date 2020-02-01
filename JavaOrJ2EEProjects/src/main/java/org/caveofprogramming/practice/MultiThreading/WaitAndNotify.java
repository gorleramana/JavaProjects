/**
 * 
 */
package org.caveofprogramming.practice.MultiThreading;

import java.util.Scanner;

/**
 * @author RamanaGorle
 *
 *         Program 10
 *
 *         In Java every Object has a monitor and wait, notify methods are used
 *         to wait for the Object monitor or to notify other threads that Object
 *         monitor is free now. There is no monitor on threads in java and
 *         synchronization can be used with any Object, that’s why it’s part of
 *         Object class so that every class in java has these essential methods
 *         for inter thread communication
 */
public class WaitAndNotify {

	/**
	 * @param args
	 * @throws InterruptedException
	 */
	public static void main(String[] args) throws InterruptedException {

		final Processor4 p = new Processor4();

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

class Processor4 {
	public void produce() throws InterruptedException {
		synchronized (this) {
			System.out.println("Producer thread is running...");
			wait();
			System.out.println("Resumed..");
		}
	}

	public void consume() throws InterruptedException {
		Scanner sc = new Scanner(System.in);
		/**
		 * Thread sleep() and yield() methods work on the currently executing thread. So
		 * there is no point in invoking these methods on some other threads that are in
		 * wait state. That’s why these methods are made static so that when this method
		 * is called statically, it works on the current executing thread and avoid
		 * confusion to the programmers who might think that they can invoke these
		 * methods on some non-running threads.
		 */
		Thread.sleep(2000);
		/**
		 * When a Thread calls wait() on any Object, it must have the monitor on the
		 * Object that it will leave and goes in wait state until any other thread call
		 * notify() on this Object. Similarly when a thread calls notify() on any
		 * Object, it leaves the monitor on the Object and other waiting threads can get
		 * the monitor on the Object. Since all these methods require Thread to have the
		 * Object monitor, that can be achieved only by synchronization, they need to be
		 * called from synchronized method or block.
		 */
		synchronized (this) {
			System.out.println("Waiting for return key to be pressed...");
			sc.nextLine();
			System.out.println("Return key pressed..");
			notify();
			Thread.sleep(2000);
		}
		sc.close();
	}
}