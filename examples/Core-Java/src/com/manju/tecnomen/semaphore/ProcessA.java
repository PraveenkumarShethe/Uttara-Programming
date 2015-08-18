package com.manju.tecnomen.semaphore;

public class ProcessA extends SemaphoreABC implements Runnable {
	public void run() {
		while (true) {
			try {
				Thread.sleep(1 + (int) (random.nextDouble() * 500));
			} catch (InterruptedException e1) {
				e1.printStackTrace();
			}
			System.out.print("A");
			countingSemaphore.notifyToWakeup();
		}
	}
}