package com.manju.java.generics2;

public class BoundedGenericTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
System.out.println("################################################################");
		BoundedGeneric<C> c=new BoundedGeneric<>(new C());
		c.print();
System.out.println("################################################################");
		BoundedGeneric<B> b=new BoundedGeneric<>(new B());
		b.print();
		
System.out.println("################################################################");
		BoundedGeneric<A> a=new BoundedGeneric<>(new A());
		a.print();
		
		
		System.out.println("################################################################");
		BoundedGeneric<? super A> c1=new BoundedGeneric<A>(new C());
		c1.add(new B());
		c1.print();
	}
}
