package com.manju.java.nestedclasses;

public class OuterNonStaticMemberNested {
	
	private int data=20;
	
	public String display(){
		InnerNonStaticMemberNested in=new InnerNonStaticMemberNested();
		in.message();
		return "";
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		OuterNonStaticMemberNested out=new OuterNonStaticMemberNested();
		out.display();
		OuterNonStaticMemberNested.InnerNonStaticMemberNested in=out.new InnerNonStaticMemberNested();
		in.message();
		
	}
	
	
	final class InnerNonStaticMemberNested{
		private int data=30;
		private void message(){
			System.out.println(data +" Data   : "+OuterNonStaticMemberNested.this.data);
		}
		
	}

}
/*
  After Compile above will create class for inner class as beloww
  
  public OuterNonStaticMemberNested$InnerNonStaticMemberNested{
  
  final OuterNonStaticMemberNested$this0; // thats why inner class can access outer class elements directly , no worries about variable modifier.
  
  public OuterNonStaticMemberNested$InnerNonStaticMemberNested(){
  
  this$0=OuterNonStaticMemberNested.this;  // object of outer class
  
  }
 */
 