package com.manju.java.threads1;


public class ProducerThread extends Thread{
	
	ProducerConsumer pc;
	public ProducerThread( ProducerConsumer prcr){
		pc=prcr;
	}
	
	
	
	
	@Override
	public void run() {
		try {
            while (true) {
            	//System.out.println("Producer RUN");
            //	Thread.currentThread().interrupt();
                pc.putMessage("Producer putMessage");
                //sleep(5000);
            }
        } catch (InterruptedException e) {
        }
		
		
	}

}
