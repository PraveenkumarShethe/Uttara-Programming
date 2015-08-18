package com.manju.scannerformatter;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

/*
 * Objects of type Scanner are useful for breaking down formatted input into tokens and translating individual tokens according to their data type.
 */
public class ScanXan{
	public static void main(String[] args) {
		Scanner scan=null;
		 double sum = 0;

		try {
			scan=new Scanner(new BufferedReader(new FileReader("scanner.txt")));
			//scan.useDelimiter("");
			 while (scan.hasNext()) {
	               // System.out.println(scan.next());
	                if (scan.hasNextDouble()) {
	                	double kk=scan.nextDouble();
	                    sum += kk;
	                    System.out.println(kk);
	                } else {
	                    scan.next();
	                }   

	            }

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Sum "+sum);
	}
	

}
