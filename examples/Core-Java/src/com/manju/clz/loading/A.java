package com.manju.clz.loading;
// Observe Constructor Chaining
public  class A {

	private final Object o;
	private final String a;

	public A() {	
		this(new Object());
		System.out.println("Default A");
	
	}

	public A(Object o) {
		this.o = o;
		a="dd";
		System.out.println("Object A");
	}

	public final int a() {
		return 0;
	}

	public  int b(){return 0;};

}