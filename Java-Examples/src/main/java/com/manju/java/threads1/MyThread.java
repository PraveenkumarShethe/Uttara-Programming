package com.manju.java.threads1;

public class MyThread extends Thread{

	/**
	 * @param args
	 */
	
	/*public void start(){
		System.out.println("jjj");
	}*/
	
	public void run(){
		System.out.println("Run");
	}
	
	public static void main(String[] args) {
		MyThread my=new MyThread();
		try {
			my.start();
			my.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
