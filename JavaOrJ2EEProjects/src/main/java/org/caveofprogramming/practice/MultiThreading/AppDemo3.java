/**
 * 
 */
package org.caveofprogramming.practice.MultiThreading;

/**
 * Ways of implementing multi threading 3
 * 
 * Thread Scheduler is the Operating System service that allocates the CPU time
 * to the available runnable threads. Once we create and start a thread, it’s
 * execution depends on the implementation of Thread Scheduler. Time Slicing is
 * the process to divide the available CPU time to the available runnable
 * threads. Allocation of CPU time to threads can be based on thread priority or
 * the thread waiting for longer time will get more priority in getting CPU
 * time. Thread scheduling can’t be controlled by java, so it’s always better to
 * control it from application itself
 * 
 * @author RamanaGorle
 */
public class AppDemo3 {

	/**
	 * Context Switching is the process of storing and restoring of CPU state so
	 * that Thread execution can be resumed from the same point at a later point of
	 * time. Context Switching is the essential feature for multitasking operating
	 * system and support for multi-threaded environment.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		Thread t1 = new Thread(new Runnable() {

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

		});
		t1.start();
	}

}
