package com.manju.bytestream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Programs use byte streams to perform input and output of 8-bit bytes. All
 * byte stream classes are descended from InputStream and OutputStream.
 * 
 * All Other Streams is built on ByteStream
 * @author muniyma
 * 
 */
public class CopyBytes {
	public static void main(String[] args) throws IOException {

		FileInputStream in = null;
		FileOutputStream out = null;

		try {
			File outfile=new File("manjuout.txt");
			if(outfile.exists())
				outfile.delete();
			in = new FileInputStream("manju.txt");
			out = new FileOutputStream("manjuout.txt");
			
			int c;
		// the int variable holds a byte value in its last 8 bits.
/**
 * Here -1 means end of the file.
 */
			while ((c = in.read()) != -1) {
				System.out.println((char)c);
				out.write(c);
			}
		} finally {
			if (in != null) {
				in.close();
			}
			if (out != null) {
				out.close();
			}
		}
	}
}
