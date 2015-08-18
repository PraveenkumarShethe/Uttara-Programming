package com.manju.java.cpt2.ood.linkedlist;

public class GenericNode<T> {

	T element;
	GenericNode<T> next;
	
	public GenericNode(T ele,GenericNode<T> nxt){
		element=ele;
		next=nxt;
	}

	public T getElement() {
		return element;
	}

	public void setElement(T element) {
		this.element = element;
	}

	public GenericNode <T> getNext() {
		return next;
	}

	public void setNext(GenericNode<T> next) {
		this.next = next;
	}
	
	

}
