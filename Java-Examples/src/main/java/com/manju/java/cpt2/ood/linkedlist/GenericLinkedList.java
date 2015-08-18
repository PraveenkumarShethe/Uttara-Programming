package com.manju.java.cpt2.ood.linkedlist;


public class GenericLinkedList<T> {
	
	GenericNode<T> head=null;
	int size=1;
	
	public GenericLinkedList() {
		// TODO Auto-generated constructor stub
	}
	
	public GenericLinkedList(GenericNode<T> e,int sze) {
		// TODO Auto-generated constructor stub
		head=e;
		size=sze;
	}
	
	public void add(GenericNode<T> e){
		GenericNode<T> before=head.next;
		//System.out.println(before!=null?before.getElement() :"");
		e.next=before;
		head.next=e;
		
		//e.next=head;
		size++;
		System.out.println(head.next.getElement());
		
		
	}
	public void remove(Node e){
		
	}
	
	public void addFirst(GenericNode<T> e){
		e.next=head;
		head=e;
		size++;
		
	}
	public void addLast(GenericNode<T> e){
		GenericNode<T> lastNode=getLastNode();
		lastNode.next=e;
		size++;
		
		
	}
	public void addAtPosition(GenericNode<T> e, int position){
		
		GenericNode<T> currNode=getNode(position);
		GenericNode<T> prevNode=getNode(position-1);
		if(prevNode!=null){
			prevNode.next=e;
			e.next=currNode;
		}else{
			e.next=currNode;
		}
		size++;
		/*e.next=currNode;
		
		//Node currNode=head;
		Node prevNode=head;*/
		
		System.out.println("SSS "+size);
		
		for(int i=1;i<=position;i++){/*	
			System.out.println("g  " +hdNode.getElement());
			if(position==1){
				e.next=hdNode;
				size++;
			}
			else if(i==position){				
				System.out.println("j "+hdNode.getElement());
				e.next=hdNode.next;
				hdNode.next=e;
				size++;
				break;
				//System.out.println(e.getElement() +  position+"   i "+i);
				//return e;
			}
			
			hdNode=hdNode.next;
			//System.out.println(e);
		*/}
		
		
		
		
		
	
		
	}
	public void removeAtposition(Node e,int position){
		
	}
	public GenericNode<T> getNode(int position){
		
		if(position==0) return head;
		
		GenericNode<T> e=head.next;
		//System.out.println("ffffffff  " +e.getElement());
		
		for(int i=1;i<size;i++){
			
			if(i==position){
				//System.out.println(e.getElement() +  position+"   i "+i);
				return e;
			}
			
			
			e=e.next;
			//System.out.println(e);
		}
		return null;
		
		
		
		
	}
	
	public GenericNode<T> getFirstNode(){
		return getNode(0);
		
	}
	public GenericNode<T> getLastNode(){
		return getNode(size-1);
		
	}
		
	
	

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		GenericLinkedList<String> list=new GenericLinkedList<String>(new GenericNode<String>("head",null),1);
		list.add(new GenericNode<String>("one", null));
		//list.add(new GenericNode<Integer>(1, null));
		list.add(new GenericNode<String>("three", null));
		list.add(new GenericNode<String>("four", null));
		list.addFirst(new GenericNode<String>("manju", null));
		list.addLast(new GenericNode<String>("manjuLast", null));
		list.addAtPosition(new GenericNode<String>("Pos", null),3);
		
		System.out.println("&&&&&&&&&&&&&&&&");
		for(int i=0;i<list.size;i++){
			System.out.println(list.getNode(i).getElement());
		}

	}

}
