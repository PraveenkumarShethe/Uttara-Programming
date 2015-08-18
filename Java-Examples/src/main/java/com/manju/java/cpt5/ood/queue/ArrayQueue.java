package com.manju.java.cpt5.ood.queue;

public class ArrayQueue<T> implements Queue<T>{
	//front <---  1 <-- 2 <-- 3 <-- rear
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ArrayQueue<Integer> arrayQueue=new ArrayQueue<>();
		arrayQueue.offer(1);
		arrayQueue.offer(2);
		arrayQueue.offer(3);
		arrayQueue.offer(4);
		arrayQueue.offer(5);
		arrayQueue.offer(6);
System.out.println(arrayQueue.poll());
System.out.println(arrayQueue.poll());

System.out.println("Size "+arrayQueue.getSize());

System.out.println(arrayQueue.poll());
System.out.println(arrayQueue.poll());
System.out.println(arrayQueue.poll());
System.out.println(arrayQueue.poll());
System.out.println(arrayQueue.poll());
System.out.println(arrayQueue.poll());
System.out.println(arrayQueue.rear + " rear : front  "+arrayQueue.rear);
arrayQueue.offer(7);
System.out.println(arrayQueue.rear + " rear : front  "+arrayQueue.rear);
arrayQueue.offer(8);
System.out.println(arrayQueue.poll());
System.out.println(arrayQueue.poll());



System.out.println(arrayQueue.rear + " rear : front  "+arrayQueue.rear);

	}
	
	final static int CAPACITY=6;
	int rear=0;
	int front=0;
	
	T[] ele;
	
	public ArrayQueue(){
		this(CAPACITY);
	}
	
	public ArrayQueue(int cap){
		ele=(T[]) new Object[cap];
	}

	@Override
	public boolean offer(T e) {
		// TODO Auto-generated method stub
		if(getSize()==CAPACITY) return false;
		if(getSize()==0)rear=front=0;
		
		ele[rear++]=e;
		
		return true;
	}

	@Override
	public void add(T e) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public T remove() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public T poll() {
		if(getSize()==0) return null;
		
		T e=ele[front];
		ele[front]=null;
		front++;
		return e;
		
	}

	@Override
	public T element() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public T peek() {
		// TODO Auto-generated method stub
		return ele[front];
	}

	@Override
	public int getSize() {
		// TODO Auto-generated method stub
	
		return (rear-front);
	}

}
