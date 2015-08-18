package com.manju.java.generics4;

public class MyWildcardExTest {
	public static void main(String a[]) {

		MyEmployeeUtil<CompAEmp> empA = new MyEmployeeUtil<CompAEmp>(new CompAEmp("Ram", 20000));
		MyEmployeeUtil<CompBEmp> empB = new MyEmployeeUtil<CompBEmp>(new CompBEmp("Krish", 30000));
		MyEmployeeUtil<CompAEmp> empC = new MyEmployeeUtil<CompAEmp>(new CompAEmp("Nagesh", 20000));
		
		
		System.out.println("Is salary same? " + empA.isSalaryEqual(empB));
		System.out.println("Is salary same? " + empA.isSalaryEqual(empC));
		//System.out.println("Is salary same? " + empA.isSalaryEqualT(empB));
		System.out.println("Is salary same? " + empA.isSalaryEqualT(empC));
	
	}

}
