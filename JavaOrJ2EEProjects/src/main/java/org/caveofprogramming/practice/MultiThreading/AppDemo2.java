/**
 * 
 */
package org.caveofprogramming.practice.MultiThreading;

/**
 * Ways of implementing multi threading 2
 * 
 * Every thread has a priority, usually higher priority thread gets precedence
 * in execution but it depends on Thread Scheduler implementation that is OS
 * dependent. We can specify the priority of thread but it doesn’t guarantee
 * that higher priority thread will get executed before lower priority thread.
 * Thread priority is an int whose value varies from 1 to 10 where 1 is the
 * lowest priority thread and 10 is the highest priority thread.
 * 
 * @author RamanaGorle
 */
public class AppDemo2 {

	/**
	 * When we create a Thread in java program, it’s known as user thread. When
	 * there are no user threads running, JVM shutdown the program and quits.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		Thread t1 = new Thread(new Runner2());
		Thread t2 = new Thread(new Runner2());

		t1.start();
		t2.start();
	}

}

class Runner2 implements Runnable {
	/**
	 * There are several ways to achieve thread safety in java – synchronization,
	 * atomic concurrent classes, implementing concurrent Lock interface, using
	 * volatile keyword, using immutable classes and Thread safe classes
	 */
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("Hello " + i);
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}