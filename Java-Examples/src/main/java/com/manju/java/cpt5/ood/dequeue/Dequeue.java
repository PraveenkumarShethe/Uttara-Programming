package com.manju.java.cpt5.ood.dequeue;

public interface Dequeue<T> {

	void addFirst(T ele); // Add head

	void addLast(T ele);  // Add from tail

	T removeFirst(T ele); // Remove from head

	T removeLast(T ele); // Remove from last

	T getFirst(T ele); // get First element

	void getLast(T ele); // get Last element
}
