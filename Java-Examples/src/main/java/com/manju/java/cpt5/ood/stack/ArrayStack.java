package com.manju.java.cpt5.ood.stack;

public class ArrayStack<T> implements Stack<T> {

	T[] elem;
	final static int CAPACITY=3;
	int top=-1;
	
	public ArrayStack(){
		this(CAPACITY);
	}
	
public ArrayStack(int cap){
		elem=(T[]) new Object[cap];
	}
/**
 * Check size if full throw Exception
 * else increase top and add element 
 */
	@Override
	public void push(T e) {
		if(getSize()==CAPACITY){
			System.out.println("Throws Stack Full exception ");
			return;
		}
		elem[++top]=e;
	}

	/**
	 * Check size if 0 throw null
	 * else get top element to temp
	 * make top postion to null
	 * decreament top
	 */
	@Override
	public T pop() {
		if(isEmpty()) return null;
		
		T el=elem[top];
		elem[top]=null;
		top--;
		
		return el;
		
	}

	/**
	 * get the first inserted element without deleting 
	 */
	@Override
	public T top() {
		// TODO Auto-generated method stub
		if(isEmpty()) return null;
		return elem[top];
	}

	@Override
	public int getSize() {
		// TODO Auto-generated method stub
		return top+1;
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return top<0;
	}

	public static void main(String[] args){
		ArrayStack<String> a=new ArrayStack<>();
		a.push("Manju");
		a.push("Manju1");
		System.out.println(a.pop());
		System.out.println(a.pop());
		System.out.println(a.top());
	}
	

}
