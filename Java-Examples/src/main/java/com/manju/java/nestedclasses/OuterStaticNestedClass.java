package com.manju.java.nestedclasses;

public class OuterStaticNestedClass {
	
	private static int a=100;
	private int b=10;
	
	
	static class InnerStaticNestedClass{
		void msg(){
			System.out.println(a +" not static method ");;
		}
		
		private static void msg1(){
			System.out.println(a +"  static method ");;
		}
	}
	
	void display(){
		
		InnerStaticNestedClass.msg1();
	}
	
	public static void main(String[] args) {
		OuterStaticNestedClass out=new OuterStaticNestedClass();
		InnerStaticNestedClass in=new InnerStaticNestedClass();
		in.msg();
		out.display();
	}

}
