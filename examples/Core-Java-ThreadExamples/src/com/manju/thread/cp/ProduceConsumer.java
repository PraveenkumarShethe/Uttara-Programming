package com.manju.thread.cp;

public class ProduceConsumer {
	
	private int count;
	public synchronized void consume()
	{
		while(count==0)
		{
			try{
				wait();
			}catch (Exception e) {
				// TODO: handle exception
			}
		}
		count--;
		System.out.println(Thread.currentThread().getName()+" After consuming "+count);
	}
	
	public synchronized void produce()
	{
		count++;
		System.out.println(Thread.currentThread().getName() +"  After Producing "+count);
		notifyAll();
	}

}
