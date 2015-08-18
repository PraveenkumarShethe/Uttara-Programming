package com.manju.thread.race;

public class CountingTask implements Runnable {

	private Counter counter;

	public CountingTask(Counter counter) {
		super();
		this.counter = counter;
	}

	@Override
	public void run() {
		counter.increment();
		Thread thread = Thread.currentThread();		
		System.out.println(thread.getName() + " value is "+ counter.getCount(thread.getName()));
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}