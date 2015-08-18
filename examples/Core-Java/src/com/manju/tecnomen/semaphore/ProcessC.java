package com.manju.tecnomen.semaphore;

public class ProcessC extends SemaphoreABC implements Runnable {
	public void run() {
		while (true) {
			try {
				Thread.sleep(1 + (int) (random.nextDouble() * 800));
				binarySemaphore0.waitForNotify();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			countingSemaphore.waitForNotify();
			System.out.print("C");
			binarySemaphore1.notifyToWakeup();
		}
	}
}