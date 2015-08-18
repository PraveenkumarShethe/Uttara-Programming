package com.manju.tecnomen.semaphore;

import java.util.Random;

public class SemaphoreABC {
	protected static final BinarySemaphore binarySemaphore0 = new BinarySemaphore(0);
	protected static final BinarySemaphore binarySemaphore1 = new BinarySemaphore(1);
	protected static final CountingSemaphore countingSemaphore = new CountingSemaphore(0);
	protected static final Random random = new Random();

	public static void main(String args[]) throws InterruptedException {
		new Thread(new ProcessA()).start();
		new Thread(new ProcessB()).start();
		new Thread(new ProcessC()).start();
		Thread.sleep(9000);
		System.exit(0);
	}
}