package com.manju.java.serialize6;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerialDeserial {
	public static void main(String[] args) {
		try {
			ChangingObject obj = new ChangingObject();
			obj.foo=1;
			//obj.setType(Type.NOTIFICATION);
			// Write it
			ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream("test.foo"));
			os.writeObject(obj);
			os.flush();os.close();

			// Read the object
			ObjectInputStream is = new ObjectInputStream(new FileInputStream("test.foo"));
			ChangingObject objDummy = (ChangingObject)is.readObject();
			System.out.println("objDummy.foo is "+objDummy.foo);

			// Change it
			obj.setType(Type.SECONDARY);
			// Write it
			os = new ObjectOutputStream(new FileOutputStream("test.foo"));
			os.writeObject(obj);
			os.flush();os.close();

			// Read the object
			is = new ObjectInputStream(new FileInputStream("test.foo"));
			objDummy = (ChangingObject)is.readObject();
			System.out.println("objDummy.foo is "+objDummy.getType()); // this returns "1" insted of "2"


		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
