package com.manju.java.cpt6.ood.arraylist;

public class ArrayList<T> implements List<T> {

	private T[] list;
	static int INIT_CAPACITY=5;
	private int size=0;

	public ArrayList() {
		this(INIT_CAPACITY);

	}

	public ArrayList(int cap) {

		list=(T[]) new Object[cap];
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/*// TODO Auto-generated method stub
		java.util.List<String> mm=new java.util.ArrayList<>(19);
		mm.add(0, "Manju");
		System.out.println(mm.get(10));*/
		
		ArrayList<Integer> list=new ArrayList<>();
		list.add(0, 1);
		list.add(1, 2);
		list.add(2, 3);
		list.add(3, 4);
		list.add(4, 4);
		list.add(5, 5);
		list.add(6, 6);
		//System.out.println(list.size());
		list.remove(6);
		//System.out.println(list.size());
		
		for(int i=0;i<list.size();i++){
			System.out.println(list.get(i));
		}

	}
	
	private boolean chekIndex(int index , int size){
		if(index>size) throw new IndexOutOfBoundsException();
		
		return true;
		
	}
	
	private void checkAlmostFull(int curSize){
		if((size/INIT_CAPACITY)*100>=80){
			INIT_CAPACITY=INIT_CAPACITY+INIT_CAPACITY;
			T[] temp=list;
			list=(T[]) new Object[INIT_CAPACITY];
			for(int i=0;i<size;i++){
				list[i]=temp[i];
			}
			System.out.println(size +"Cureent size : resized    "+list.length);
			
		}
		
	}
	
	/*private void checkAlmostEmpty(int curSize){
		if((size/INIT_CAPACITY)*100<=80){
			INIT_CAPACITY=INIT_CAPACITY+INIT_CAPACITY;
			T[] temp=list;
			list=(T[]) new Object[INIT_CAPACITY];
			for(int i=0;i<size;i++){
				list[i]=temp[i];
			}
			System.out.println(size +"Cureent size : resized    "+list.length);
			
		}
		
	}*/


	@Override
	public int size() {
		// TODO Auto-generated method stub
		return size;
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void add(int index, T e) throws IndexOutOfBoundsException {
		chekIndex(index,size());
		checkAlmostFull(size());
		if(list[index]==null){
			list[index]=e;
			size++;
		}
		else set(index,e);
			
	
	}

	@Override
	public T get(int index) throws IndexOutOfBoundsException {
		// TODO Auto-generated method stub
		return list[index];
	}

	@Override
	public T remove(int index) throws IndexOutOfBoundsException {
		chekIndex(index,size());
		
		size--;
		return list[index];
	}

	@Override
	public void set(int index, T e) throws IndexOutOfBoundsException {
		list[index]=e;
		// TODO Auto-generated method stub

	}

}
