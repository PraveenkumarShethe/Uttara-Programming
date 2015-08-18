package com.manju.java.cpt8.ood.sorting;

public class SelectionSort {
	// has an average case time complexity of O(n2)
	
	//equal value. In that sense, selection sort is not a stable algorithm whereas bubble sort is a stable algorithm.

	


			 


public static void selectionSortExample(int a[]){
		
		System.out.println(a.length);
		// 11 9 5 3 6 2 8 10 
		// Compare first with all in inner loop
		//Selection sort is also a sorting algorithm, which starts by finding the minimum element in the list and swapping it with the first element. This process is repeated for the remainder of the list by placing swapped elements in order.


		

		
		for(int i=0;i<a.length;i++){  // index from the second character.
			
			for(int j=i+1;j<a.length;j++){
				
				if(a[i]<a[j]){
					int tem=a[i];
					a[i]=a[j];
					a[j]=tem;
							
				}
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
		int a[]={11, 9, 5, 3, 6, 2, 8, 10,0};
		selectionSortExample(a);

	}

}
