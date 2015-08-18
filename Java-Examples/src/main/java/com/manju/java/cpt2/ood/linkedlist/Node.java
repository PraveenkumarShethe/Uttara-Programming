package com.manju.java.cpt2.ood.linkedlist;

public class Node {

	String element;
	Node next;
	
	public Node(String ele,Node nxt){
		element=ele;
		next=nxt;
	}

	public String getElement() {
		return element;
	}

	public void setElement(String element) {
		this.element = element;
	}

	public Node getNext() {
		return next;
	}

	public void setNext(Node next) {
		this.next = next;
	}
	
	

}
