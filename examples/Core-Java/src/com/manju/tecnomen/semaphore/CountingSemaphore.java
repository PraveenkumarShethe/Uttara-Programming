package com.manju.tecnomen.semaphore;

public class CountingSemaphore {
	private int value = 0;
	private int waitCount = 0;
	private int notifyCount = 0;

	public CountingSemaphore(int initial) {
		if (initial > 0) {
			value = initial;
		}
	}

	public synchronized void waitForNotify() {
		if (value <= waitCount) {
			waitCount++;
			try {
				do {
					wait();
				} while (notifyCount == 0);
			} catch (InterruptedException e) {
				notify();
			} finally {
				waitCount--;
			}
			notifyCount--;
		}
		value--;
	}

	public synchronized void notifyToWakeup() {
		value++;
		if (waitCount > notifyCount) {
			notifyCount++;
			notify();
		}
	}
}