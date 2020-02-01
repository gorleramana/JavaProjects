package org.caveofprogramming.practice.MultiThreading;

/**
 * Ways of implementing multi threading 1
 * 
 * @author RamanaGorle
 */
public class AppDemo1 {
	/**
	 * A process is a self contained execution environment and it can be seen as a
	 * program or application whereas Thread is a single task of execution within
	 * the process. Java runtime environment runs as a single process which contains
	 * different classes and programs as processes. Thread can be called lightweight
	 * process. Thread requires less resources to create and exists in the process,
	 * thread shares the process resources.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		Runner1 r1 = new Runner1();
		r1.start();

		Runner1 r2 = new Runner1();
		r2.start();
	}
}

class Runner1 extends Thread {
	/**
	 * Yes, we can call run() method externally of a Thread class but then it will behave like
	 * a normal method. To actually execute it in a Thread, we need to start it
	 * using Thread.start() method
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