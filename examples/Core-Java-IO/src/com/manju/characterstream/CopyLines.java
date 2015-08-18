package com.manju.characterstream;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;



/*
 * The CopyLines example invokes BufferedReader.readLine and 
 * PrintWriter.println to do input and output one line at a time.
 */


public class CopyLines {
public static void main(String[] args) {
	
	BufferedReader br=null;
	PrintWriter pw=null;
	TestTimer timer = new TestTimer("********** CopyLines **************");
	try{
		
		br=new BufferedReader(new FileReader("manju-char.txt"));
		pw=new PrintWriter(new FileWriter("manju-char-copyline.txt"));
		
		String l;
		while((l=br.readLine())!=null)
		{
			//System.out.println(l);
			pw.write(l);
		}
		
	}catch (Exception e) {
		try {
			br.close();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		pw.close();// TODO: handle exception
	}finally
	{
		timer.done();
	}
	
	
}
	
	
}
