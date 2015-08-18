package com.manju.java.pattern1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MatchGrouper {
	
	/**
	 * @param args
	 */
	static void method1(){
		
			// TODO Auto-generated method stub
			String addressAsString="tel:00411483";
			  Pattern p = Pattern.compile("(tel:(?:;target=)?)?(\\+|00)?([0-9a-zA-Z#*\\. ]+)");			  
			  Matcher m = p.matcher(addressAsString);
			  System.out.println("Method 1");
				if(!m.matches()) System.out.println("return null");		
				System.out.println("0  "+m.group(0));
				System.out.println("1  "+m.group(1));
				System.out.println("2  "+m.group(2));
				System.out.println("3  "+m.group(3));
				
		
	}
	
	static void method2(){
		
		// TODO Auto-generated method stub
					String valueExp="[0].411482";
					 // Pattern p = Pattern.compile("(tel:(?:;target=)?)?(\\+|00)?([0-9a-zA-Z#*\\. ]+)");
					 Pattern pattern = Pattern.compile("\\[(\\d+)\\]((\\.\\w+)*)");
					  Matcher m = pattern.matcher(valueExp);
					  System.out.println("Method 2");
						if(!m.matches()) System.out.println("return null");		
						System.out.println("0  "+m.group(0));
						System.out.println("1  "+m.group(1));
						System.out.println("2  "+m.group(2));
						System.out.println("3  "+m.group(3));
						//System.out.println("3  "+m.group(3));
		
	}
	
	public static void main(String[] args) {
		method1();
		method2();
		

	}
	

	

}
