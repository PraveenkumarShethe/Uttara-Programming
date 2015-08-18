package com.manju.java.cpt5.ood.stack;

/**
 * FILO (First In Last Out)
 * @author manjugm
 *
 * @param <T>
 */

public class GenericStackImpl<T> implements GenericStack<T> {
	
	private GenericNode<T> top;
	
	
	private int length;
	private int size;
	
	public GenericStackImpl(){
		this(null,0,0)	;
	}
	public GenericStackImpl(GenericNode<T> e,int lngth,int sz){
		this.top=e;
		length=lngth;
		size=sz;
	}
		
	@Override
	public void push(GenericNode<T> e) {
		if(top==null){
			top=e;
		}else{
			e.next=top;
			top=e;
		}
		length++;
		size++;
		
	}

	@Override
	public GenericNode<T> pop() {
		// TODO Auto-generated method stub
		GenericNode<T> ele=top; // (1->2 ->3 ->4 ->5)
		length--;
		size--;
		top=ele.getNext();
		return ele;
	}

	@Override
	public GenericNode<T> top() {
		// TODO Auto-generated method stub
		return top;
	}

	@Override
	public int getSize() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
	}
 public static void main(String[] args){
	 GenericStack<String> gs=new GenericStackImpl<>();
	 System.out.println("############## Push ###############");
	 gs.push(new GenericNode<>("one",null));
	 gs.push(new GenericNode<>("two",null));
	 gs.push(new GenericNode<>("three",null));
	 gs.push(new GenericNode<>("four",null));
	 
	 System.out.println("############## pop ###############");
	 System.out.println(gs.pop().getElement());
	 System.out.println(gs.pop().getElement());
	 System.out.println(gs.pop().getElement());
	 System.out.println(gs.pop().getElement());
	 
 }

}
