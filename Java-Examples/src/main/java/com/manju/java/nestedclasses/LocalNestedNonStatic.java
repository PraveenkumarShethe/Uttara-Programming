package com.manju.java.nestedclasses;

public class LocalNestedNonStatic {
	
	private int data=50;
	
	public void display(){
		
		final int b=10;
		class Local{
			void msg(){
				System.out.println(b+ " hi  " +data);
			}
		}
		
		Local lo=new Local();
		lo.msg();
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		LocalNestedNonStatic localNestedNonStatic=new LocalNestedNonStatic();
		localNestedNonStatic.display();

	}

}
