package com.manju.java.cpt5.ood.queue;

public interface GenericQueue<T> {
	
	// insert element from rear end  front <---  1 <-- 2 <-- 3 <-- rear
	boolean offer(GenericNode<T>  e); // inserts the specified element into this queue if it is possible to do so immediately without violating capacity restrictions.
	void add(GenericNode<T> e) throws Exception;
	
	GenericNode<T> remove() throws Exception; // remove
	GenericNode<T> poll();  // Retrieves and removes the head of this queue, or returns null if this queue is empty.
	
	
	GenericNode<T> element() throws Exception;// Retrieves, but does not remove, the head of this queue.
	GenericNode<T> peek(); //Retrieves, but does not remove, the head of this queue, or returns null if this queue is empty.
	int getSize();
	

}
