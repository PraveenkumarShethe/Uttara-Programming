package com.manju.java.cpt5.ood.stack;

public interface GenericStack<T> {
	
	void push(GenericNode<T> e);
	GenericNode<T> pop();
	GenericNode<T> top();
	int getSize();
	boolean isEmpty();

}
