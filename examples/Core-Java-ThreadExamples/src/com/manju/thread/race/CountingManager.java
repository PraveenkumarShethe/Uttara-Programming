package com.manju.thread.race;
public class CountingManager { 
	   
	 public static void main(String[] args) throws InterruptedException { 
	    
	  Counter counter = new Counter(); // create an instance of the Counter 
	  CountingTask task = new CountingTask(counter); // pass the counter to the runnable CountingTask 
	  
	    
	  //Create 10 user threads (non-daemon) from the main thread that share the counter object   
	  Thread thread1 = new Thread(task, "User-1"); 
	  Thread thread2 = new Thread(task, "User-2"); 
	  Thread thread3 = new Thread(new CountingTask( new Counter()), "User-3"); 
	    
	    
	  //start the threads 
	  thread1.start(); 
	  thread2.start(); 
	 thread3.start(); 
	    
	    
	  //observe the racing conditions in the output 
	    
	 } 
	  
	}