package com.manju.clz.loading;

public class B extends A {

	public B(Object o) {	
		super(o);
		System.out.println("BB");
	}

	

	@Override
	public int b() {
		return 2;
	}

}