/**
 * 
 */
package org.caveofprogramming.practice.MultiThreading;

/**
 * @author RamanaGorle
 *
 *         Daemon thread is a low priority thread that runs in background to
 *         perform tasks such as garbage collection
 * 
 *         Daemon vs User Threads
 * 
 *         Priority: When the only remaining threads in a process are daemon
 *         threads, the interpreter exits. This makes sense because when only
 *         daemon threads remain, there is no other thread for which a daemon
 *         thread can provide a service. Usage: Daemon thread is to provide
 *         services to user thread for background supporting task.
 */
public class DaemonThread extends Thread {

	/**
	 * They can not prevent the JVM from exiting when all the user threads finish
	 * their execution.
	 * 
	 * JVM terminates itself when all user threads finish their execution
	 * 
	 * If JVM finds running daemon thread, it terminates the thread and after that
	 * shutdown itself. JVM does not care whether Daemon thread is running or not.
	 * 
	 * It is an utmost low priority thread.
	 * 
	 * @param name
	 */
	public DaemonThread(String name) {
		super(name);
	}

	/**
	 * A daemon thread runs in background and doesn’t prevent JVM from terminating.
	 * A child thread created from daemon thread is also a daemon thread.
	 */
	public void run() {
		// Checking whether the thread is Daemon or not
		if (Thread.currentThread().isDaemon()) {
			System.out.println(getName() + " is Daemon thread");
		}

		else {
			System.out.println(getName() + " is User thread");
		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		DaemonThread t1 = new DaemonThread("t1");
		DaemonThread t2 = new DaemonThread("t2");
		DaemonThread t3 = new DaemonThread("t3");

		/**
		 * Setting user thread t1 to Daemon
		 * 
		 * If you call the setDaemon() method after starting the thread, it would throw
		 * IllegalThreadStateException.
		 */
		t1.setDaemon(true);

		// starting first 2 threads
		t1.start();
		t2.start();

		// Setting user thread t3 to Daemon
		t3.setDaemon(true);
		t3.start();

	}

}
