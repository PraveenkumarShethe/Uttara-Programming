package com.manju.java.cpt5.ood.dequeue;

public class ArrayDequeue<T> implements Dequeue<T>{

	int head=0;
	int tail=0;
	final static int CAPACITY=5;
	T[] objs=null;
	
	public ArrayDequeue(){
		this(CAPACITY);
	}
	
	public ArrayDequeue(int cap){
		objs=(T[]) new Object[cap];
		
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	@Override
	public void addFirst(T ele) {
		
		
	}

	@Override
	public void addLast(T ele) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public T removeFirst(T ele) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public T removeLast(T ele) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public T getFirst(T ele) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void getLast(T ele) {
		// TODO Auto-generated method stub
		
	}

}
