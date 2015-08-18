package com.manju.java.threads4;


public class TestThread implements Runnable {

	public TestThread(String name){
		
	}
	public TestThread() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public void run() {
		try {
			//System.out.println("name " +Thread.currentThread().getName());
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
