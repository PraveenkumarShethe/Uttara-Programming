package com.manju.java.operatars;

public  class IncDecOperators {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		int i=8;
		int j=i++;
		System.out.println("I Value "+i +" J value : "+j);
		int k=++i;
		System.out.println("I Value "+i +" k value : "+k);
		int m=i--;
		System.out.println("I Value "+i +" m value : "+m);
		int n=9+i++;
		System.out.println("I Value "+i +" N value : "+n);
		//assigns 8 to j, 10 to k, 10 to m, 18 to n, and leaves i with value 10.

		/**
		 * I Value 9 J value : 8
		 * I Value 10 k value : 10
	     * I Value 9 m value : 10
		 * I Value 10 N value : 18
		 */

	}
}
