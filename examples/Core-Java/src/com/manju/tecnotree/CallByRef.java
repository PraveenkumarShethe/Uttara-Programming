package com.manju.tecnotree;

public class CallByRef {
	 int x=0;
	 int y=0;
	public CallByRef()
	{
		
	}
	
	public CallByRef(int x,int y)
	{
		this.x=x;
		this.y=y;
	}
	// alter object on method operations
    public static void badSwap(CallByRef one,CallByRef two)
    {
    	one=null;
    //	one.x=50;
    	//one.y=50;
    	CallByRef m=one;
    	//m.x=188;
    	//one.x=888;
    	//two=new CallByRef(333,444);
    	//System.out.println(two.x);
    	
    }
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		CallByRef orig=new CallByRef();
		CallByRef origt=new CallByRef();
		System.out.println("orig.x  "+orig.x  +"  orig.y "+ orig.y);
		System.out.println("origt.x  "+origt.x  +"  origt.y "+ origt.y);
		System.out.println("After Swap ");
		badSwap(orig,origt);
		System.out.println("orig.x  "+orig.x  +"  one.y "+ orig.y);
		System.out.println("origt.x  "+origt.x  +"  origt.y "+ origt.y);
		
		
		

	}

}
