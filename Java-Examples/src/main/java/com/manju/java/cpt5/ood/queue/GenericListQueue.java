package com.manju.java.cpt5.ood.queue;

/**
 * Size restricted queue
 * 
 * @author manjugm
 * 
 * @param <T>
 */
public class GenericListQueue<T> implements GenericQueue<T> {
	// front <--- 1 <-- 2 <-- 3 <-- rear
	/**
	 * @param args
	 */
	
	GenericNode<T> frontNode;
	GenericNode<T> rearNode;// tail node
	
	int size=0;
	public static void main(String[] args) {
		GenericListQueue<Integer> gq=new GenericListQueue<>();
		gq.offer(new GenericNode<>(1,null));
		gq.offer(new GenericNode<>(3,null));
		gq.offer(new GenericNode<>(4,null));
		gq.offer(new GenericNode<>(5,null));
		gq.offer(new GenericNode<>(6,null));
		
		System.out.println("size "+gq.size);
		
		System.out.println(gq.poll().element);
		System.out.println(gq.poll().element);
		
		System.out.println("size "+gq.size);
		
		
	}

	@Override
	public boolean offer(GenericNode<T>  e) {
		if(size==0){
			frontNode=rearNode=null;
			frontNode=rearNode=e;
		}else{
			//frontNode=e;
			rearNode.next=e;
			rearNode=e;
			
		}
		size++;
		
		
		
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void add(GenericNode<T> e) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public GenericNode<T> remove() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public GenericNode<T> poll() {
		if(size==0) return null;
		// TODO Auto-generated method stub
		GenericNode<T> node=frontNode; // get front node
		frontNode=frontNode.next; // position changed to next position
		size--;
		return node;
	}

	@Override
	public GenericNode<T> element() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public GenericNode<T> peek() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getSize() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
}
