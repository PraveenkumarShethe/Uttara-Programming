package com.manju.java.threads1;

public class DefaultThread implements Runnable{

	ProducerConsumer pc;
	public DefaultThread(ProducerConsumer pcp){
		pc=pcp;
	}
		

	@Override
	public void run() {
		while (true) {
			//System.out.println("Producer RUN");
		//	Thread.currentThread().interrupt();
		    pc.nonSynchronizedMethod();
		    //sleep(5000);
		}
		
	}

}
