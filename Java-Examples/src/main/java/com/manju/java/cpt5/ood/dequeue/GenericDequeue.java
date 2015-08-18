package com.manju.java.cpt5.ood.dequeue;

public interface GenericDequeue<T> {

	void addFirst(GenericDLNode<T> ele); // Add head

	void addLast(GenericDLNode<T> ele);  // Add from tail

	GenericDLNode<T> removeFirst(); // Remove from head

	GenericDLNode<T> removeLast(); // Remove from last

	GenericDLNode<T> getFirst(); // get First element

	GenericDLNode<T>  getLast(); // get Last element
	
	int getSize();
	
	
	/**
	 * 
	 */
	
	// offerFirst(e);
	// offerLast(e);
	// pollFirst(e);
	// pollLast(e);
	// peekFirst(e);
	// peakLast(e);
}

