package com.manju.java.generics3;


/**
 * This class only accepts type parametes as any class
 * which extends class A or class A itself.
 * Passing any other type will cause compiler time error
 */                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               
public class BoundedGeneric<T extends A & M> {
	
	T input;

	public BoundedGeneric() {

	}

	public BoundedGeneric(T param) {
		input=param;
	}
	
	
	
	
	public void print(){
		System.out.println(input);
		input.print();
	}
	
	public void add(T inp){
		input=inp;
		System.out.println(input);
		input.print();
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
