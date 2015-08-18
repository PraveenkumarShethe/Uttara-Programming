package com.manju.tecnomen.semaphore;

public class ProcessB extends SemaphoreABC implements Runnable {
	public void run() {
		while (true) {
			try {
				Thread.sleep(1 + (int) (random.nextDouble() * 800));
				binarySemaphore1.waitForNotify();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			countingSemaphore.waitForNotify();
			System.out.print("B");
			binarySemaphore0.notifyToWakeup();
		}
	}
}