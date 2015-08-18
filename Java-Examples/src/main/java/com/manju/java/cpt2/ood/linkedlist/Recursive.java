package com.manju.java.cpt2.ood.linkedlist;

public class Recursive {
	
	
	public static int recursiveFactorial(int n){
		System.out.println(n);
		if(n==0) return 1;
		else return n* recursiveFactorial(n-1);
			
	}
	
	public static int linearSum(int a[] ,int n){
		System.out.println(n);
		if(n==0) return a[0];
		else return  linearSum(a,n-1) +a[n-1];
			
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(recursiveFactorial(7));
		int a[]={1,2,3,4,5,6,};
		System.out.println(linearSum(a,a.length));
	}

}
