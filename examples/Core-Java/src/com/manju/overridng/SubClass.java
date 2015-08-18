package com.manju.overridng;
/*
 *  1) Cannot Reduce the Visibility of the inherited method from SuperCalss
 *  2) Private method can be ovveride , ie we can private methods other than owner.
 *  3) Final methods can be ovveride
 *  4) Cannot reduce the Priorty of the Exception Hiearchy
 * 
 */

public class SubClass  extends SuperClass{
	
	int x=4;
	public SubClass()
	{
		
	}

	public SubClass(int x)
	{
		super(x);
	}
	
	public void methodA()
	{
		System.out.println("Sub Class B "+x);
	}
	
	private void manju()
	{
	System.out.println("1S");	
	}
	
	
	public void manju1() 
	{
		System.out.println("2S");	
	}
	
	protected void manju2(){
		System.out.println("3S");
	}

	protected void manju3(){
		System.out.println("4S");
	}
	
	/*
	 * Cannot ovveride Final Method 
	 * final void manju4()
	{
		System.out.println("5S");
		
	}*/
	
	static void manju5()
	{
		System.out.println("6S");
	}
	

	void manju6()
	{
		System.out.println("6S");
	}

}
