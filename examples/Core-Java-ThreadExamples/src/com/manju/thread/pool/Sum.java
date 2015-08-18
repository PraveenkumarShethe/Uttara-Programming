package com.manju.thread.pool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Sum implements Runnable {

	private static final int NO_OF_THREADS = 3;
	int maxNumber;

	public Sum(int maxNumber) {
		this.maxNumber = maxNumber;
		// TODO Auto-generated constructor stub
	}

	@Override
	public void run() {
		int sum = 0;
		for (int i = 0; i <= maxNumber; i++) {
			sum += maxNumber;
		}
		// TODO Auto-generated method stub
		System.out.println("Thread " + Thread.currentThread().getName()
				+ " count is " + sum);
	}

	public static void main(String[] args) {
		ExecutorService executorService = Executors
				.newFixedThreadPool(NO_OF_THREADS);
		for (int i = 10000; i < 10100; i++) {
			Runnable worker = new Sum(i);
			// create worker threads
			executorService.execute(worker);
			// add runnables to the work queue

		}

		// This will make the executor accept no new threads
		// and finish all existing threads in the queue
		executorService.shutdown();
		// Wait until all threads have completed
		while (!executorService.isTerminated()) {
		}
		System.out.println("Finished all threads");
	}
}
