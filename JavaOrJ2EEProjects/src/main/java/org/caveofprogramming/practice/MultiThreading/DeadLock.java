/**
 * 
 */
package org.caveofprogramming.practice.MultiThreading;

import java.util.Random;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author RamanaGorle
 *
 *         Program 13
 */
public class DeadLock {

	/**
	 * @param args
	 * @throws InterruptedException
	 */
	public static void main(String[] args) throws InterruptedException {
		final Runner3 r = new Runner3();

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

class Runner3 {
	private Account a1 = new Account();
	private Account a2 = new Account();

	private Lock lock1 = new ReentrantLock();
	private Lock lock2 = new ReentrantLock();

	private void acquireLocks(Lock firstLock, Lock secondLock) {
		// Solution for deadlock
		while (true) {
			boolean gotFirstLock = false;
			boolean gotSecondLock = false;

			try {
				gotFirstLock = firstLock.tryLock();
				gotSecondLock = secondLock.tryLock();
			} finally {
				if (gotFirstLock && gotSecondLock)
					return;
				if (gotFirstLock)
					firstLock.unlock();
				if (gotSecondLock)
					secondLock.unlock();
			}
		}
	}

	public void firstThread() throws InterruptedException {
		Random r = new Random();
		for (int i = 0; i < 10000; i++) {
			acquireLocks(lock1, lock2);

			try {
				Account.transfer(a1, a2, r.nextInt(100));
			} finally {
				lock1.unlock();
				lock2.unlock();
			}
		}

	}

	public void secondThread() throws InterruptedException {
		Random r = new Random();
		for (int i = 0; i < 10000; i++) {
			acquireLocks(lock2, lock1);

			try {
				Account.transfer(a2, a1, r.nextInt(100));
			} finally {
				lock1.unlock();
				lock2.unlock();
			}
		}
	}

	public void finished() {
		System.out.println("Account 1 balance:  " + a1.getBalance());
		System.out.println("Account 2 balance:  " + a2.getBalance());
		System.out.println("Total balance:  " + (a1.getBalance() + a2.getBalance()));
	}
}

class Account {
	private int balance = 10000;

	public void deposit(int deposit) {
		balance += deposit;
	}

	public void withdraw(int withdraw) {
		balance -= withdraw;
	}

	public int getBalance() {
		return balance;
	}

	public static void transfer(Account ac1, Account ac2, int money) {
		ac1.withdraw(money);
		ac2.deposit(money);
	}
}