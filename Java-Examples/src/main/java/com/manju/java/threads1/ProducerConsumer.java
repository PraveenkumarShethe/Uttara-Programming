package com.manju.java.threads1;

import java.util.Vector;

public class ProducerConsumer {
	static final int MAXQUEUE = 5;
	private Vector messages = new Vector();

	// called by producerThread
	synchronized void putMessage(String s) throws InterruptedException { 
		
		
		System.out.println(messages.size()  + Thread.currentThread().getName());
	//	Thread.sleep(100000);
		while (messages.size() == MAXQUEUE) {
			System.out.println("put wait");
			wait();
			//Thread.sleep(10000);
			
			
		}
		wait();
		//Thread.sleep(10000);
		//wait(10000);
		messages.addElement(new java.util.Date().toString());
		System.out.println(s);
		//notify();
		// Later, when the necessary event happens, the thread that is running
		// it calls notify() from a block synchronized on the same object.
	}

	// called by ConsumerThread
	synchronized String getMessage() throws InterruptedException {
		//Thread.interrupted();
		System.out.println(messages.size()  + Thread.currentThread().getName()+"  getMessage");
		//Thread.sleep(100000);
		notify();
		while (messages.size() == 0) {
		/*	System.out.println("get wait");	
			System.out.println("Notyf");			
		*/	wait();// By executing wait() from a synchronized block, a thread
					// gives up its hold on the lock and goes to sleep.
			
			
			
		}
		String message=null;
		for(int i=0;i<messages.size() ;i++){ 
				 message = (String) messages.firstElement();
				 messages.removeElement(message);	
		}
		
		//notify();
		return message;
	}
	
	
	public void nonSynchronizedMethod(){
		System.out.println("no Synchronized ...."+Thread.currentThread().getName());
	}

	
}
