package com.manju.java.cpt2.ood.linkedlist;


public class LinkedList {
	
	Node head=null;
	int size=1;
	
	public LinkedList() {
		// TODO Auto-generated constructor stub
	}
	
	public LinkedList(Node e,int sze) {
		// TODO Auto-generated constructor stub
		head=e;
		size=sze;
	}
	
	public void add(Node e){
		Node before=head.next;
		//System.out.println(before!=null?before.getElement() :"");
		e.next=before;
		head.next=e;
		
		//e.next=head;
		size++;
		System.out.println(head.next.getElement());
		
		
	}
	public void remove(Node e){
		
	}
	
	public void addFirst(Node e){
		e.next=head;
		head=e;
		size++;
		
	}
	public void addLast(Node e){
		Node lastNode=getLastNode();
		lastNode.next=e;
		size++;
		
		
	}
	public void addAtPosition(Node e, int position){
		
		Node currNode=getNode(position);
		Node prevNode=getNode(position-1);
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
	public Node getNode(int position){
		
		if(position==0) return head;
		
		Node e=head.next;
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
	
	public Node getFirstNode(){
		return getNode(0);
		
	}
	public Node getLastNode(){
		return getNode(size-1);
		
	}
		
	
	

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		LinkedList list=new LinkedList(new Node("head",null),1);
		list.add(new Node("one", null));
		list.add(new Node("two", null));
		list.add(new Node("three", null));
		list.add(new Node("four", null));
		list.addFirst(new Node("manju", null));
		list.addLast(new Node("manjuLast", null));
		list.addAtPosition(new Node("Pos", null),3);
		
		System.out.println("&&&&&&&&&&&&&&&&");
		for(int i=0;i<list.size;i++){
			System.out.println(list.getNode(i).getElement());
		}

	}

}
