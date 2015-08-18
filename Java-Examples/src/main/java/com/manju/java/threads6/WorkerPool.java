package com.manju.java.threads6;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;


public class WorkerPool {

	/**
	 * @param args
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException {
		//RejectedExecutionHandler implementation
		TaskRejectionHandler rejectionHandler=new TaskRejectionHandler();
		 //Get the ThreadFactory implementation to use
		ThreadFactory threadFactory = Executors.defaultThreadFactory();
		//ThreadPoolExecutor executorPool =new ThreadPoolExecutor(corePoolSize, maximumPoolSize, keepAliveTime, unit, workQueue, threadFactory, handler);
		// corePoolSize - the number of threads to keep in the pool, even if they are idle, unless allowCoreThreadTimeOut is set
		// maximumPoolSize - the maximum number of threads to allow in the pool
		// keepAliveTime - when the number of threads is greater than the core, this is the maximum time that excess idle threads will wait for new tasks before terminating.
		// unit - the time unit for the keepAliveTime argument
		// workQueue - the queue to use for holding tasks before they are executed. This queue will hold only the Runnable tasks submitted by the execute method.
		// threadFactory - the factory to use when the executor creates a new thread
		// handler - the handler to use when execution is blocked because the thread bounds and queue capacities are reached
		 ThreadPoolExecutor executorPool = new ThreadPoolExecutor(2, 4, 10, TimeUnit.SECONDS, new ArrayBlockingQueue<Runnable>(2), threadFactory, rejectionHandler);
		 //start the monitoring thread
	        MyMonitorThread monitor = new MyMonitorThread(executorPool, 1);
	        Thread monitorThread = new Thread(monitor);
	        monitorThread.start();
	        //submit work to the thread pool
	        for(int i=0; i<10; i++){
	            executorPool.execute(new WorkerThread("cmd"+i));
	        }
	        Thread.sleep(30000);
	        //shut down the pool
	        executorPool.shutdown();
	        //shut down the monitor thread
	        Thread.sleep(5000);
	        monitor.shutdown();
		// TODO Auto-generated method stub

	}
	
	
	
	
	class CustomThreadFactory implements ThreadFactory{

		@Override
		public Thread newThread(Runnable r) {
			ThreadGroup grp=new ThreadGroup("Test");
			Thread t=new Thread(grp,"one");
			return null;
		}
		
	}

}
