package com.manju.thread.join;

public class TaskManager {
	public static void main(String[] args) {
		
		
		RunnableTask task=new RunnableTask();
		
		Thread one=new Thread(task,"one");
		Thread two=new Thread(task,"two");
		Thread three=new Thread(task,"three");
		Thread four=new Thread(task,"four");
		Thread five=new Thread(task,"five");
		Thread six=new Thread(task,"six");
		three.setPriority(10);
		
		try {
			one.start();
			//one.join();// stop main thread until thread one finishes it's work		
			two.start();
			Thread.yield();
			//two.join();
		
			three.start();
			three.join();
			Thread.yield();
	//	three.start();
		//three.join();
		four.start();
		five.start();
		six.start();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	

}
