/**
 * 
 */
package org.caveofprogramming.practice.MultiThreading;

import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/**
 * @author RamanaGorle
 *
 *Program 16
 */
public class InterruptingThreads {

	/**
	 * @param args
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException {
		System.out.println("Starting...");
		ExecutorService executor = Executors.newCachedThreadPool();

		Future<?> future = executor.submit(new Callable<Void>() {

			@Override
			public Void call() throws Exception {
				Random r = new Random();

				for(int i=0;i<1E8;i++) {
					if(Thread.currentThread().isInterrupted()) {
						System.out.println("Interrupted..");
						break;
					}
					Math.sin(r.nextDouble());
				}

				
				return null;
			}

		});
		executor.shutdown();
		
		Thread.sleep(500);
		
		//executor.shutdownNow();
		future.cancel(true);
		
		executor.awaitTermination(1, TimeUnit.DAYS);
		
		System.out.println("Finished");
	}

}
