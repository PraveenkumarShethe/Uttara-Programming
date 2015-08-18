package com.manju.java.threads6;

import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadPoolExecutor;

public class TaskRejectionHandler implements RejectedExecutionHandler{

	/*
	 * RejectedExecutionHandler implementation to handle the jobs that can’t fit in the worker queue.
	 * @see java.util.concurrent.RejectedExecutionHandler#rejectedExecution(java.lang.Runnable, java.util.concurrent.ThreadPoolExecutor)
	 */
	@Override
	public void rejectedExecution(Runnable r, ThreadPoolExecutor arg1) {
		
		System.out.println("Rejected Task ........"+r.toString());
	}

}
