package com.manju.sorting;

/*
 * Insertion sorting algorithm is similar to bubble sort. But insertion sort is more  
 * efficient than bubble sort because in insertion sort the elements comparisons are less as compare to bubble sort. 
 * In insertion sorting algorithm compare the value until  all the prior elements are lesser than compared value is not found. 
 * This mean that the all previous values are lesser than compared value. This algorithm is more efficient than the bubble sort .
 * Insertion sort is a good choice for small values and for nearly-sorted values. There are more efficient algorithms such as quick sort,
 *  heap sort, or merge sort for large values .
 Positive feature of insertion sorting: 
 1.It is simple to implement 
 2.It is efficient on (quite) small data values 
 3.It is efficient on data sets which are already nearly sorted.
 
The complexity of insertion sorting is O(n) at best case of an already sorted array and  O(n2) at worst case .
 
 */

public class InsertionSorting {
	  public static void main(String a[]){
		   int i;
		   int array[] = {12,9,4,99,120,1,3,10};
		   System.out.println("\n\n RoseIndia\n\n");
		   System.out.println(" Selection Sort\n\n"); 
		   System.out.println("Values Before the sort:\n");  
		   for(i = 0; i < array.length; i++)
		   System.out.print( array[i]+"  ");
		   System.out.println();
		   insertion_srt(array, array.length);  
		   System.out.print("Values after the sort:\n");  
		   for(i = 0; i <array.length; i++)
		   System.out.print(array[i]+"  ");
		   System.out.println(); 
		   System.out.println("PAUSE"); 
		   }
		 
		  public static void insertion_srt(int array[], int n){
		   for (int i = 1; i < n; i++){
		   int j = i;
		   int B = array[i];
		   while ((j > 0) && (array[j-1] > B)){
		   array[j] = array[j-1];
		   j--;
		   }
		   array[j] = B;
		   }
		   }
		 }