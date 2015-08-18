package com.manju.java.cpt5.ood.dequeue;

public class GenericDLNode<T> {
	
	public GenericDLNode(T elem,GenericDLNode<T> nxt,GenericDLNode<T> prv) {
		element=elem;
		nextNode=nxt;
		prevNode=prv;
	}
	
	T element;
	GenericDLNode<T> nextNode;
	GenericDLNode<T> prevNode;
	public T getElement() {
		return element;
	}
	public void setElement(T element) {
		this.element = element;
	}
	public GenericDLNode<T> getNextNode() {
		return nextNode;
	}
	public void setNextNode(GenericDLNode<T> nextNode) {
		this.nextNode = nextNode;
	}
	public GenericDLNode<T> getPrevNode() {
		return prevNode;
	}
	public void setPrevNode(GenericDLNode<T> prevNode) {
		this.prevNode = prevNode;
	}
	
	

	

}
