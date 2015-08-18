package com.manju.java.threads2;

/*
 * up vote 0 down vote
	

There is a main thread which starts the four customs threads you created t1,t2,t3 and t4. Now when join()
method is invoked on a thread and no argument(time) is supplied(which makes it 0 by default meaning maximum wait time is forever) then the calling thread will wait for the thread on which join was invoked to terminate.

When t1.start() is called it's corresponding run() method is invoked by the JVM. Since waitsFor argument is null for t1 it will simply terminate by printing it's name. 
Since you are adding sleep t2,t3,t4 would be started by the time t1 completes it's sleep. Now t2 will wait for t1 to terminate as we are calling join on t1 from t2. Similarly t3 will wait for t2 and t4 will wait for t3. So youe execution will go t1->t2->t3->t4.

However if t1 terminates before t2 calls join on it, join will simply return because at that point(when t2 calls join on t1) isAlive() will be false.

 */

public class ThreadJoinExample extends Thread{
	
	
	private String name;
    private int sleepTime;
    private Thread waitsFor;
    
    public ThreadJoinExample(String name,int sleepTime, Thread waitsFor){
    	setName(name);
    	this.name=name;
    	this.sleepTime=sleepTime;
    	this.waitsFor=waitsFor;
    }
    public void run(){

      //  System.out.print("["+name+" ");
    	System.out.println("<-- "+name );
        try { 
        	Thread.sleep(sleepTime); }
        catch(InterruptedException ie) { }

        //System.out.print(name+"? ");

        if (!(waitsFor == null))
        try { 
        	System.out.println(Thread.currentThread().getName() +" $$$  "+waitsFor.getName() + " $$$$$  "+ waitsFor.isAlive());
        	waitsFor.join(); // current thread will wait till this thread completes its task.
        	//Thread.yield();
        	
        }
        catch(InterruptedException ie) { }

        //System.out.print(name+"] ");
        System.out.println(name +" -->");
    }

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		ThreadJoinExample t1=new ThreadJoinExample("one" , 1000,null);
		ThreadJoinExample t2=new ThreadJoinExample("two" , 1000,t1);
		ThreadJoinExample t3=new ThreadJoinExample("three" , 1000,t2);
		ThreadJoinExample t4=new ThreadJoinExample("four" , 1000,t3);
		ThreadJoinExample t5=new ThreadJoinExample("five" , 1000,t4);
		ThreadJoinExample t6=new ThreadJoinExample("six" , 1000,t5);
		t1.start();
		t4.start();
		try {
			System.out.println(t6.isAlive());
			t4.join(); // syso for 2 wont print until t4 completes task if its alive  / main thread in java mail 
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("2");
		//t1.start();
		System.out.println("3");
		t2.start();
		System.out.println("4");
		t3.start();
		System.out.println("5");
		t5.start();
		System.out.println("6");
		t6.start();
		System.out.println("7");
		
		
	}

}
