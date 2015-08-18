package com.manju.characterstream;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/*
 * The Java platform stores character values using Unicode conventions. 
 * Character stream I/O automatically translates this internal format to and from the local character set. In Western locales, 
 * the local character set is usually an 8-bit superset of ASCII.
 */

/*
 * All character stream classes are descended from Reader and Writer. 
 * As with byte streams, there are character stream classes that specialize in file I/O: 
 * FileReader and FileWriter
 */

/*
 * Character streams are often "wrappers" for byte streams.
 */

public class CopyCharacters {
	
	public static void main(String[] args) {
		
		FileReader inFile=null;
		FileWriter outFile=null;
		TestTimer timer = new TestTimer("********** CopyCharacters **************");
		try{
			
			inFile=new FileReader("manju-char.txt");
			outFile=new FileWriter("manjuout-char.txt");
			//the int variable holds a character value in its last 16 bits
			int c;
			
			while((c=inFile.read())!=-1)
			{
				outFile.write(c);
			}
			
		}catch (Exception e) {
			e.printStackTrace();
		}finally{
			try {
				outFile.close();
				inFile.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			timer.done();
		}
		
	}
	

}
