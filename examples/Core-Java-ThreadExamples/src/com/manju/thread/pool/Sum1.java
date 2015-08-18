package com.manju.thread.pool;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;



public class Sum1 implements Callable<String>{

	private static final int NO_OF_THREADS = 3;
	int maxNumber;

	public Sum1(int maxNumber) {
		this.maxNumber = maxNumber;
		// TODO Auto-generated constructor stub
	}

	@Override
	public String call() {
		int sum = 0;
		for (int i = 0; i <= maxNumber; i++) {
			sum += maxNumber;
		}
		// TODO Auto-generated method stub
		return "Thread " + Thread.currentThread().getName()+ " count is " + sum;
	}

	public static void main(String[] args) {
		ExecutorService executorService = Executors
				.newFixedThreadPool(NO_OF_THREADS);
		List<Future<String>> list = new ArrayList<Future<String>>();
		for (int i = 10000; i < 10100; i++) { 
			Callable<String> worker = new Sum1(i);                 // create worker threads         
		Future<String> submit = executorService.submit(worker);      
		// add callables to the work queue       
		list.add(submit); 
		}
		



	 //process the results asynchronously when each thread completes its task    
	for (Future<String> future : list) {    
		try {         
			System.out.println("Thread " + future.get());    
			} catch (InterruptedException e) {           
	e.printStackTrace();        
	
			} catch (ExecutionException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}
} 
	
	
}
