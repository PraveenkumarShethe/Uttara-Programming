package com.manju.java.threads7;

import java.util.Date;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ScheduledThreadPool { 
    public static void main(String[] args) throws InterruptedException {
        ScheduledExecutorService scheduledThreadPool = Executors.newScheduledThreadPool(5);
         
         
        //schedule to run after sometime(10 seconds)
        System.out.println("Current Time = "+new Date());
        for(int i=0; i<3; i++){
            Thread.sleep(1000);
            WorkerThread worker = new WorkerThread("do heavy processing");
            //schedule to run after sometime(10 seconds)
          //  scheduledThreadPool.schedule(worker, 10, TimeUnit.SECONDS);
            
            // schedule task to execute at fixed rate
            scheduledThreadPool.scheduleAtFixedRate(worker, 0, 10,
                    TimeUnit.SECONDS);
        }
         
        //add some delay to let some threads spawn by scheduler
        Thread.sleep(30000);
         
        scheduledThreadPool.shutdown();
        while(!scheduledThreadPool.isTerminated()){
            //wait for all tasks to finish
        }
        System.out.println("Finished all threads");
    }
 }
