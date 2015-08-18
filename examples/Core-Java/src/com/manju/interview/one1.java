package com.manju.interview;

import java.io.IOException;

public class one1 extends OneSub1 {

	public one1() {
		//super("Lohith"); // Only One constructor can invoke from subclass
		//super.manju();

	//	System.out.println("main Class Constructor");

	}
	
	/**
	 * @param args
	 */
	public  static	void   main(String[] args) {
		// TODO Auto-generated method stub
		one1 on = new one1();
		OneSub1 on1= new OneSub1();
		OneSub1 on2= new one1();

		try {
		
			on1.manju1();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			on2.manju();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//on.manju2();
		//on.manju1();
	}

	@Override
	public Person manju2() {
		System.out.println("manju2");
		// TODO Auto-generated method stub
		return null;

	}
	public static  void manju1()
    {
    	System.out.println("Staic method fdcxvxcvfd");
    }
	@Override
	public void manju() 
	{
		System.out.println("Mawwwnju");
		
	}
	
}
