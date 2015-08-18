package com.manju.collection;

import java.util.Arrays;

public class ManjuList<E> {
	
	private transient Object[] listHolder=null;
	private static int listSize=10;
	private static int startAt=0;
	
	public ManjuList() {
		listHolder=new Object[listSize];
	}
	
	public void add(E e)
	{
		// add check for list size 
		checkAndIncrSize(startAt);
		listHolder[startAt++]=e;
	}
	
	public void checkAndIncrSize(int actualSize)
	{
		int actualListSize=listHolder.length;
	
		if(actualSize>=actualListSize)
		{System.out.println("actualSize--->"+actualSize);
			int newCapa=actualListSize+10;// here u can use threshold logic
			listHolder = Arrays.copyOf(listHolder, newCapa);
			System.out.println("sdsds--"+listHolder.length);
		}
		
	}
	
	public static void main(String[] args) {
		ManjuList<Integer> d=new ManjuList<Integer>();
		for(int i=0;i<34;i++){
			d.add(i+10);
			System.out.println(""+d.listHolder[i]);
		}
		
	}

}
