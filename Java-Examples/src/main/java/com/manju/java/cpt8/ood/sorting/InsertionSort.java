package com.manju.java.cpt8.ood.sorting;

public class InsertionSort {

public static void insertionSortExample(int a[]){
		
		System.out.println(a.length);
		// 11 9 5 3 6 2 8 10 
		// Compare from right to left and change left to right
		
		for(int i=1;i<a.length;i++){  // index from the second character.
			
			int curr=a[i]; // the current character to be inserted
			int j=i-1; // start comparing with cell left of i
			while(j>=0 && curr < a[j]){ // 
				a[j+1]=a[j];// a[j--]  while a[j] is out of order with curr move a[j] to right and decrement j
				j--;
				a[j+1]=curr;	//  this is the right place to current 			
			}
			
		}
		for(int m=0;m<a.length;m++){
			System.out.println("After Sorting --"+a[m]);
		}
		
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int a[]={11, 9, 5, 3, 6, 2, 8, 10};
		insertionSortExample(a);

	}

}
