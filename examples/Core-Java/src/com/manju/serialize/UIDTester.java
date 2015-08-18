package com.manju.serialize;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class UIDTester {
	public static void main(String... strings) throws Exception {
		File file = new File("out.ser");
		
		FileOutputStream fos = new FileOutputStream(file);
		ObjectOutputStream oos = new ObjectOutputStream(fos);

		SerializeMe serializeMe = new SerializeMe(1);
		oos.writeObject(serializeMe);
		oos.close();

		FileInputStream fis = new FileInputStream(file);
		ObjectInputStream ois = new ObjectInputStream(fis);

		SerializeMe dto = (SerializeMe) ois.readObject();
		System.out.println("MAnju " +dto.getManju()+" data : " + dto.getData());
		System.out.println("Manju1 " +dto.getManju1()+" data : " + dto.getData());
		ois.close(); 
	}
}
