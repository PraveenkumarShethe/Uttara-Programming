package com.manju.java.threads3;
public class ThreadLocalDemo extends Thread {

	/**
	 * An important benefit of ThreadLocal worth mentioning (from 1.4 JVMs forward), is as an alternative to synchronization,
	 *  to improve scalability in transaction-intensive environments.
	 *   Classes encapsulated in ThreadLocal are automatically thread-safe in a pretty simple way,
	 *   since  it's clear that anything stored in ThreadLocal is not shared between threads
	 * @param args
	 */
	public static void main(String args[]) {

		Thread threadOne = new ThreadLocalDemo();
		threadOne.start();

		Thread threadTwo = new ThreadLocalDemo();
		threadTwo.start();
	}

	@Override
	public void run() {
		// sample code to simulate transaction id
		Context context = new Context();
		context.setTransactionId(getState().name());

		// set the context object in thread local to access it somewhere else
		MyThreadLocal.set(context);

		/* note that we are not explicitly passing the transaction id */
		new BusinessService().businessMethod();
		MyThreadLocal.unset();

	}
}