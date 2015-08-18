package com.manju.java.generics1;

public class SimpleGeneric<T> {
	
	T input;

	public SimpleGeneric() {

	}

	public SimpleGeneric(T param) {
		input=param;
	}
	
	public void printArgument()
	{
		System.out.println(this.input);;
	}
	
	public void add(T param){
		input=param;
	}

}
