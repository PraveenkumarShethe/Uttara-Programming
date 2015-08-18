package com.manju.java.threads4;

import java.util.concurrent.BlockingQueue;

import com.manju.java.nestedclasses.Test;

public class MyPoolThread extends Thread{
	BlockingQueue taskQueues=null;
	private boolean       isStopped = false;

	public MyPoolThread(BlockingQueue taskQueue){
		taskQueues=taskQueue;
	}

	@Override
	public void run() {
		//System.out.println("Statrted");
		while(!isStopped()){
		      try{
		    	  
		    	  //peek retrives but dnt delete
		    	  //poll retreives and deletes
		        Runnable runnable = (Runnable) taskQueues.poll();
		        if(null!=runnable){
		        System.out.println("peek "+taskQueues.size() +"  "+runnable.toString());
		        runnable.run();
		        }
		      } catch(Exception e){
		        e.printStackTrace();
		      }
		    }
		// TODO Auto-generated method stub
		
	}
	
	// cant be overide final stop method
	public synchronized void stopManually(){
	    isStopped = true;
	    this.interrupt(); //break pool thread out of dequeue() call.
	  }

	  public synchronized boolean isStopped(){
	    return isStopped;
	  }
	
	public static void main(String[] args){
		MyThreadPool myPoolThread=new MyThreadPool(10, 15);
		for(int i=0;i<30;i++){
			Thread t=new Thread(new TestThread());
			t.setName("Test Thread :  "+i);
			//System.out.println("i "+i);
			myPoolThread.execute(t);
		//	t.start();
			
		}
	}

}
