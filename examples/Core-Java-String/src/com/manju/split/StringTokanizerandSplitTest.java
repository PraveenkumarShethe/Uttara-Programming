package com.manju.split;

import java.util.StringTokenizer;

public class StringTokanizerandSplitTest {

	/*
	 * String.split() returns an array (String[]) and Tokenizer returns one
	 * token at a time.
	 * Regular expression as delimeter in split not in tokenizer (only string);
	 * Tokenizer wont consider blank string but spilt will do,
	 */
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		StringTokenizer st = new StringTokenizer("This,is,,Test", ",");
		while (st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
		System.out.println("***********************");
		String tst = "This,is,,Test";
		String[] strArr = tst.split(",");
		for (String st1 : strArr)
			System.out.println(st1);

		String names = "Jeffrey;Moses;Rahul;Sachin;;Dravid";
		StringTokenizer Tok = new StringTokenizer(names, ";");
		System.out.println("Number of tokens: " + Tok.countTokens());
		while (Tok.hasMoreElements())
			System.out.println(Tok.nextElement());
		
		

		for (String st1 : names.split(";"))
			System.out.println(st1);
		
		System.out.println("MMMMMMM");

	}
	
	


}
