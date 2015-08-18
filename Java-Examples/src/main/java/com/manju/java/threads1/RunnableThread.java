package com.manju.java.threads1;

public class RunnableThread implements Runnable{

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Thread r1=new Thread(new RunnableThread());
		r1.start();

	}

	@Override
	public void run() {
		System.out.println("Runnable Thread ");
		
	}

}
