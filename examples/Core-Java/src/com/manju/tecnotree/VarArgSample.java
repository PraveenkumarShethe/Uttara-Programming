package com.manju.tecnotree;

public class VarArgSample {
	static int sum(int i, int... marks) {
		int total = 0;
		for (int mark : marks) {
			total = total + mark;
		}
		return total;
	}

	public static void main(String[] args) {
		//invoking with variable arguments 
		System.out.println(sum(1, 2, 3));    
		//same invocation using an array   
		int arr[] = {5,3};    
		System.out.println(sum(1, arr));
		//System.out.printf("manju","jbndknhwk","djkbfjkdb");
		System.out.printf( "%25s %n %10s ", "Hello World!", "Java Varargs: Variable Arguments.");

	}
}