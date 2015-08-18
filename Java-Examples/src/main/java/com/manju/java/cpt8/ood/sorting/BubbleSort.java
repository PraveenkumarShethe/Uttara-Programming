package com.manju.java.cpt8.ood.sorting;

/**
 * First element compares with second if any out of order swap , then compare second
 * and third if any mismatch then swap this continues till end of the array , as a result the
 * final array in first iteration will have last two elements as sorted 
 * Next iteration continues as same
 * @author manjugm
 *
 */

public class BubbleSort {
	
	/**
	 * Bubble sort is a sorting algorithm that operates by going through the list to be sorted repeatedly while comparing pairs of 
	 * elements that are adjacent. If a pair of elements is in the wrong order they are swapped to place them in the correct order. 
	 * This traversal is repeated until no further swaps are required.



	 * @param a
	 */
//complexity of O(n2) '

	static void bubbleSort2(int[] a) {
		
		for(int i=0;i<a.length-1;i++){
			for(int j=0;j<a.length-1-i;j++){
				if(a[j]<a[j+1]){
					int tmp=a[j];
					a[j]=a[j+1];
					a[j+1]=tmp;
				}
			}
		}
		}
	
	static void bubbleSort(int[] a) {
		boolean flag = true;
		while (flag) {

			flag = false;
			for (int i = 0; i < a.length - 1; i++) {
				if (a[i] > a[i + 1]) {
					int temp = a[i];
					a[i] = a[i + 1];
					a[i + 1] = temp;
					flag = true;
				}

			}

		}

	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int a[]={11, 9, 5, 3, 6, 2, 8, 10,0};
	//	bubbleSort(a);
		bubbleSort2(a);
		for(int m=0;m<a.length;m++){
			System.out.println("After Sorting --"+a[m]);
		}
		

	}

}
