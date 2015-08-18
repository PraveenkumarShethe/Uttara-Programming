package com.manju.thread.join;

import java.util.Date;

public class RunnableTask implements Runnable{

	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName() +" work starts at "+new Date());
		try{
			Thread.sleep(100000);
		}catch (Exception e) {
			// TODO: handle exception
		}
		
		System.out.println(Thread.currentThread().getName() +" ENDDDDDDDDDD"+new Date());
	}

}
