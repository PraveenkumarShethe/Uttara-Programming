package com.manju.java.cpt2.ood.linkedlist;

public class Fibonacci {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int count=10;
		
		int start=0;
		int next=1;
		System.out.println(start +""+ next);
		for(int i=0 ;i<count;i++){
			
			int nextNum=start+next;
			start=next;
			next=nextNum;
			System.out.println(" "+nextNum);
		}

	}

}
