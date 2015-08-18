package com.manju.sorting;

/**
 * Bubble sort is also known as exchange sort. Bubble sort is a simplest sorting
 * algorithm. In bubble sort algorithm array is traversed from 0 to the length-1
 * index of the array and compared one element to the next element and swap
 * values in between if the next element is less than the previous element. In
 * other words, bubble sorting algorithm compare two values and put the largest
 * value at largest index. The algorithm follow the same steps repeatedly until
 * the values of array is sorted. In worst-case the complexity of bubble sort is
 * O(n2) and in best-case the complexity of bubble sort is
 * 
 * Code description:
 * 
 * Bubble Sorting is an algorithm in which we are comparing first two values and
 * put the larger one at higher index. Then we take next two values compare
 * these values and place larger value at higher index. This process do
 * iteratively until the largest value is not reached at last index. Then start
 * again from zero index up to n-1 index. The algorithm follows the same steps
 * iteratively unlit elements are not sorted.
 * 
 * Working of bubble sort algorithm:
 * 
 * Say we have an array unsorted A[0],A[1],A[2]................ A[n-1] and A[n]
 * as input. Then the following steps are followed by bubble sort algorithm to
 * sort the values of an array. 1.Compare A[0] and A[1] . 2.If A[0]>A[1] then
 * Swap A[0] and A[1]. 3.Take next A[1] and A[2]. 4.Comapre these values. 5.If
 * A[1]>A[2] then swap A[1] and A[2]
 * ...............................................................
 * ................................................................ at last
 * compare A[n-1] and A[n]. If A[n-1]>A[n] then swap A[n-1] and A[n]. As we see
 * the highest value is reached at position. At next iteration leave value. Then
 * apply the same steps repeatedly on A[0],A[1],A[2]................ A[n-1]
 * elements repeatedly until the values of array is sorted.
 * 
 * In our example we are taking the following array values 12 9 4 99 120 1 3 10
 * 
 * The basic steps followed by algorithm:-
 * 
 * In the first step compare first two values 12 and 9. 12 9 4 99 120 1 3 10
 * 
 * As 12>9 then we have to swap these values Then the new sequence will be 9 12
 * 4 99 120 1 3 10
 * 
 * In next step take next two values 12 and 4 9 12 4 99 120 1 3 10
 * 
 * Compare these two values .As 12>4 then we have to swap these values. Then the
 * new sequence will be 9 4 12 99 120 1 3 10
 * 
 * We have to follow similar steps up to end of array. e.g. 9 4 12 99 120 1 3 10
 * 9 4 12 99 120 1 3 10 9 4 12 99 1 120 3 10 9 4 12 99 1 120 3 10 9 4 12 99 1 3
 * 120 10 9 4 12 99 1 3 10 120
 * 
 * When we reached at last index .Then restart same steps unlit the data is not
 * sorted.
 * 
 * The output of this example will be : 1 3 4 9 10 12 99 120
 * 
 */

public class BubbleSorting {

	public static void main(String a[]) {
		int i;
		int array[] = { 12, 9, 4, 99, 120, 1, 3, 10 };
		System.out.println("Values Before the sort:\n");
		for (i = 0; i < array.length; i++)
			System.out.print(array[i] + "  ");
		System.out.println();
		bubble_srt(array, array.length);
		System.out.print("Values after the sort:\n");
		for (i = 0; i < array.length; i++)
			System.out.print(array[i] + "  ");
		System.out.println();
		System.out.println("PAUSE");
	}

	public static void bubble_srt(int a[], int n) {
		int i, j, t = 0;
		for (i = 0; i < n; i++) {
			for (j = 1; j < (n - i); j++) {
				if (a[j - 1] > a[j]) {
					t = a[j - 1];
					a[j - 1] = a[j];
					a[j] = t;
				}
			}
		}
	}

}
