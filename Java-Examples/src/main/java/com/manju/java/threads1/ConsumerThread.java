package com.manju.java.threads1;

public class ConsumerThread implements Runnable {

	ProducerConsumer pc;
	public ConsumerThread( ProducerConsumer prcr){
		pc=prcr;
	}
	
	
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	@Override
	public void run() {

		try {
			while (true) {
				//System.out.println("Consumer RUN");
				String message = pc.getMessage();
				System.out.println("Got message: " + message);
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
