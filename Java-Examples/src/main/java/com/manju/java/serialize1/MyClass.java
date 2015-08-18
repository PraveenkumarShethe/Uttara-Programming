package com.manju.java.serialize1;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
/**
 *  Q7) What happens if an object is serializable but it includes a reference to a non-serializable object?
	Ans- If you try to serialize an object of a class which implements serializable, but the object includes a reference to an non-serializable class then a ‘NotSerializableException’ will be thrown at runtime.
	
	Q8) Are the static variables saved as the part of serialization?

	Ans) No. The static variables belong to the class and not to an object they are not the part of the state of the object so they are not saved as the part of serialized object.
 * @author manjugm
 *
 */

public class MyClass   implements Serializable {
	private static final long serialVersionUID = 1L;
	private NonSerial nonSerial;

	MyClass(NonSerial nonSerial) {
		this.nonSerial = nonSerial;
	}

	public static void main(String[] args) {
		NonSerial nonSer = new NonSerial();
		MyClass c = new MyClass(nonSer);
		try {
			FileOutputStream fs = new FileOutputStream("test1.ser");
			ObjectOutputStream os = new ObjectOutputStream(fs);
			os.writeObject(c);
			os.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		try {
			FileInputStream fis = new FileInputStream("test1.ser");
			ObjectInputStream ois = new ObjectInputStream(fis);
			c = (MyClass) ois.readObject();
			ois.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
