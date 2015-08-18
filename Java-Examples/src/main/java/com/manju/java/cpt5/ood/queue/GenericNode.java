package com.manju.java.cpt5.ood.queue;

public class GenericNode<T> {

	T element;
	GenericNode<T> next;
	public GenericNode() {
		// TODO Auto-generated constructor stub
	}
	
	public GenericNode(T ele,GenericNode<T> node) {
		element=ele;
		next=node;
	}

}
