package com.manju.java.generics1;

import java.util.Date;

// E and F are type parameter , that means it will accept any kind of primitives for object while instantiating

public class SimpleGenericWithTwoTypePram<E,F> {
	
	private E first;
	private F second;
	
	
	public SimpleGenericWithTwoTypePram(E a1,F a2){
		first=a1;
		second=a2;
	}

	public E getFirst() {
		return first;
	}

	public void setFirst(E first) {
		this.first = first;
	}

	public F getSecond() {
		return second;
	}

	public void setSecond(F second) {
		this.second = second;
	}
	
	public void print(){
		System.out.println(this.first);
		System.out.println(this.second);
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SimpleGenericWithTwoTypePram<String, Date> p1=new SimpleGenericWithTwoTypePram<String, Date>("Today", new Date());
		p1.print();
		
		SimpleGenericWithTwoTypePram<String, String> p2=new SimpleGenericWithTwoTypePram<String, String>("Today", new Date().toGMTString());
		p2.print();


	}
	
	/*
	 *  enums not allowed types parameter
	 * public enum manju<String>{
		
	}*/

}
