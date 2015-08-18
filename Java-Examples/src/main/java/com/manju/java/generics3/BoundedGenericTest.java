package com.manju.java.generics3;

public class BoundedGenericTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
System.out.println("################################################################");
		BoundedGeneric<?> c=new BoundedGeneric<C>(new C());
		c.print();
System.out.println("################################################################");
		BoundedGeneric<B> b=new BoundedGeneric<B>(new B());
		b.print();
		
System.out.println("################################################################");
		BoundedGeneric<C> a=new BoundedGeneric<C>(new C());
		a.print();
		
		
		
	}
}
