package com.manju.java.threads1;

public class ProducerConsumerThreadTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		ProducerConsumer pc=new ProducerConsumer();
		ProducerThread producerThread=new ProducerThread(pc);
		producerThread.setName("Producer");
		producerThread.start();
		System.out.println("Manju");
		Thread coThread=new Thread(new ConsumerThread(pc));
		coThread.setName("Consumer");
		coThread.start();
		Thread nonSync=new Thread(new DefaultThread(pc));
		nonSync.setName("Nin Synchronized:");
		nonSync.start();
		
		// TODO Auto-generated method stub

	}

}
