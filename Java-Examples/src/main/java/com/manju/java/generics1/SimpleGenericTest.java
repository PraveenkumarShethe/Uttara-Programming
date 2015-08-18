package com.manju.java.generics1;

public class SimpleGenericTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		SimpleGeneric<String> one=null;
		one=new SimpleGeneric<>("String test");
		one.printArgument();
		one.add("ddd");
		one.printArgument();
	}

}
