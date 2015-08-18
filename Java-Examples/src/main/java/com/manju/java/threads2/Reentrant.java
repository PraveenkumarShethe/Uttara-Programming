package com.manju.java.threads2;

public class Reentrant implements Runnable{

	  public synchronized void a() {
			b();
			System.out.println("here I am, in a()");
		    }
		    public synchronized void b() {
		    	try {
		    		//a();
					Thread.sleep(1);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			System.out.println("here I am, in b()");
		    }
	@Override
	public void run() {
		
		a();
		
	}
	public static void main(String[] args){
		Reentrant r=new Reentrant();
		Thread t1=new Thread(r);
		t1.start();
		Thread t2=new Thread(r);
		t2.start();
	}

}
