package com.manju.java.threads4;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class MyThreadPool {

	private BlockingQueue taskQueue = null;
	private List<MyPoolThread> threads=new ArrayList<MyPoolThread>();
	private boolean isStopped=false;
	
	
	public MyThreadPool(int noOfThreads,int maxNoOfTasks){
		taskQueue = new ArrayBlockingQueue(maxNoOfTasks);
		
		
		for(int i=0; i<noOfThreads; i++){
		      threads.add(new MyPoolThread(taskQueue));
		    }
		
		for(MyPoolThread thread : threads){
		      thread.start();
		    }
	}
	
	public  synchronized void execute(Runnable task){
	    if(this.isStopped) throw
	      new IllegalStateException("ThreadPool is stopped");
	    
	    System.out.println("taskQueue "+taskQueue.size()+ "  "+task.toString());
	    this.taskQueue.offer(task);
	  }

	  public synchronized void stop(){
	    this.isStopped = true;
	    for(MyPoolThread thread : threads){
	      thread.stopManually();
	    }
	  }
}
