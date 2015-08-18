package com.manju.java.cpt6.ood.arraylist;

public interface List<T> {
	
	// get the size of the array
	int size();
	// method to check is it empty list
	boolean isEmpty();
	// insert element at index i by shifting all other element right to after
	void add(int index,T e) throws IndexOutOfBoundsException;
	
	// Return element from array without removing the element
	
	 T get(int index) throws IndexOutOfBoundsException;
	 
	//Remove and Return element from array without removing the element
	 
	 T remove(int index) throws IndexOutOfBoundsException;
	 
	// update element at index i by shifting all other element right to after
	 
	 void set(int index,T e) throws IndexOutOfBoundsException;
		
	

}
