/**
 * 
 */
package org.caveofprogramming.practice.MultiThreading;

import java.util.Scanner;

/**
 * This explains why do we need synchronization, to resolve the below problems 
 * 
 * @author RamanaGorle
 * program 4
 *
 */
public class BasicThreadSynchronization {

	/**
	 * Thread 2 is modifying running property 
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		Processor p1 = new Processor();
		p1.start();

		System.out.println("Press return to stop...");

		Scanner sc = new Scanner(System.in);
		sc.nextLine();

		p1.shutDown();
		sc.close();
	}

}
/**
 * Thread 1
 * @author RamanaGorle
 *
 */
class Processor extends Thread {
	private boolean running = true;

	public void run() {
		while (running) {
			System.out.println("Hello");
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	public void shutDown() {
		running = false;
	}
}