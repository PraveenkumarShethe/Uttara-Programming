package com.manju.java.nestedclasses;

import com.manju.java.nestedclasses.OuterNonStaticMemberNested.InnerNonStaticMemberNested;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
     OuterNonStaticMemberNested out=new OuterNonStaticMemberNested();
     out.display();
     InnerNonStaticMemberNested in=out.new InnerNonStaticMemberNested();
   //  InnerStaticNestedClass.msg1();
     //in.message();
     //in.message();
     

	}

}
