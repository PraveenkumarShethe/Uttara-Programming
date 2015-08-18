package com.manju.onholdinterviews;

public final class FinalTest {
	
	/**
	 * Final Field can be initialized either declaration
	 * or with in in the constructor (Only one way we can initialize;
	 */
	public  final int i;
	
	public FinalTest() {
		i=10;
	}
	
	public FinalTest(int k) {
		i=k;
	}
	
	
	public  void manu()
	{
		
	//	i=10;
		
		System.out.println("manu"+i);
	}

}
