package com.manju.overridng;

 class TestOverriding {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	//	SubClass sub=(SubClass) new SuperClass(); // need to add type case at compile time /at run time throws ClassCastException
//		sub.manju1();
		
		SuperClass sup=new SubClass();
		sup.methodA();
		//sup.manju1(); super class throwinf exception so u have to catch
	//	sup.manju5();// manju 5 is static so it will call refernce method not actual method
		
		SubClass sub=new SubClass();
		sub.manju1();
		
	}

}
