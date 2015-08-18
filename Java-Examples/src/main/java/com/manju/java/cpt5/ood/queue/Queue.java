package com.manju.java.cpt5.ood.queue;

public interface Queue<T> {
	
	// insert element from rear end  front <---  1 <-- 2 <-- 3 <-- rear
	boolean offer(T e); // inserts the specified element into this queue if it is possible to do so immediately without violating capacity restrictions.
	void add(T e) throws Exception;
	
	T remove() throws Exception; // remove
	T poll();  // Retrieves and removes the head of this queue, or returns null if this queue is empty.
	
	
	T element() throws Exception;// Retrieves, but does not remove, the head of this queue.
	T peek(); //Retrieves, but does not remove, the head of this queue, or returns null if this queue is empty.
	int getSize();
	

}
