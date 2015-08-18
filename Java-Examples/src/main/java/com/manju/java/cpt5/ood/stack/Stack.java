package com.manju.java.cpt5.ood.stack;

public interface Stack<T> {
	
	void push(T e);
	T pop();
	T top();
	int getSize();
	boolean isEmpty();

}
