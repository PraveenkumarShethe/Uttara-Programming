package com.manju.thread.deadlock;

public class NumberUtility {
	
	
	boolean oddprinted;
	
	public synchronized void printEvenNo(int even)
	{
		try{
			while(oddprinted==false){
				wait();
			}
		}catch (Exception e) {
			// TODO: handle exception
		}
		System.out.println("The Even Number is --"+even);
		oddprinted=false;
		notifyAll();
	}
	
	public synchronized void printOddNo(int odd)
	{
		try{
			while(oddprinted==true)
			{
			wait();
			}
		}catch (Exception e) {
			// TODO: handle exception
		}
		System.out.println("The Odd Number is --"+odd);
		oddprinted=true;
		notifyAll();
	}

	
}
