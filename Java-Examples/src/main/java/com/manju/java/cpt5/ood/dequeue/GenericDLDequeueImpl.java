package com.manju.java.cpt5.ood.dequeue;

public class GenericDLDequeueImpl<T> implements GenericDequeue<T>{

	private GenericDLNode<T> head;
	private GenericDLNode<T> tail;
	int size=0;
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		GenericDLDequeueImpl<String> gdq=new GenericDLDequeueImpl<>();
		gdq.addFirst(new GenericDLNode<String>("one", null, null));
		gdq.addFirst(new GenericDLNode<String>("two", null, null));
		gdq.addLast(new GenericDLNode<String>("three", null, null));
		
		System.out.println(gdq.removeFirst().getElement());
		System.out.println(gdq.removeLast().getElement());
		System.out.println(gdq.removeLast().getElement());
		System.out.println(gdq.removeFirst().getElement());
		System.out.println(gdq.removeFirst().getElement());

	}

	@Override
	public void addFirst(GenericDLNode<T> ele) {
		if(head==null){
			head=tail=ele;
		}else{
			ele.nextNode=head;
		    head=ele;
		}
		size++;
	}

	@Override
	public void addLast(GenericDLNode<T> ele) {
		if(tail==null){
			tail=head=ele;
			//tail.prevNode=head;
		}
		
		ele.prevNode=tail;
		tail=ele;
		size++;
		
	}

	@Override
	public GenericDLNode<T> removeFirst() {
		// TODO Auto-generated method stub
		if(getSize()<=0) return new GenericDLNode("NO MORE", null,null);;
		GenericDLNode<T> ele =head;
		head=head.nextNode;
		size--;
		return ele;
	}

	@Override
	public GenericDLNode<T> removeLast() {
		if(getSize()<=0) return null;
		GenericDLNode<T> ele =tail;
		tail=tail.prevNode;
		size--;
		return ele;
	}

	@Override
	public GenericDLNode<T> getFirst() {
		// TODO Auto-generated method stub
		return head;
	}

	@Override
	public GenericDLNode<T>  getLast() {
		
		return tail;
		
	}

	@Override
	public int getSize() {
		// TODO Auto-generated method stub
		return size;
	}

}
