package com.manju.thread.deadlock;

public class DeadLockTest implements Runnable{
	
	public static Object lock1=new Object();
	public static Object lock2=new Object();
	
	public void method1()
	{
		System.out.println("yyyy---"+this.toString());
		synchronized (this) {
			delay(5000);
			System.out.println("Method1 ---"+Thread.currentThread().getName());
			synchronized (lock2) {
				System.out.println(Thread.currentThread().getName()+"  Method 1 excecuting   ....");
			}
		}
	}
	
	public void method2()
	{
		synchronized (lock2) {
			delay(5000);
			System.out.println("Method2 ---"+Thread.currentThread().getName());
			synchronized (this) {
				System.out.println(Thread.currentThread().getName()+"   Method 2 excecuting   ....");
			}
		}
	}
	
	public void delay(long ms)
	{
		try {
			Thread.sleep(ms);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		DeadLockTest ff=new DeadLockTest();
		Thread one=new Thread(new DeadLockTest() ,"one");
		Thread two=new Thread(new DeadLockTest(),"two");
		
		
		one.start();
		//one.run();
		two.start();
		//two.run();
	}

	@Override
	public   void run() {
		method1();
		method2();
		
	}
}
