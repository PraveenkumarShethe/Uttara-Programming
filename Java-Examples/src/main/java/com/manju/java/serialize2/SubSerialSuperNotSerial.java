package com.manju.java.serialize2;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
/**
 * Q13) If a class is serializable but its superclass in not , what will be the state of the instance variables inherited  from super class after deserialization?

Ans) The values of the instance variables inherited from superclass will be reset to the values they were given during the original construction of the object as the non-serializable super-class constructor will run.
 * @author manjugm
 *
 */

public class SubSerialSuperNotSerial {
	public static void main(String [] args) { 

        ChildSerializable c = new ChildSerializable(); 
        System.out.println("Before : - " + c.noOfWheels + " "+ c.color); 
        try { 
        FileOutputStream fs = new FileOutputStream("superNotSerail.ser"); 
        ObjectOutputStream os = new ObjectOutputStream(fs); 
        os.writeObject(c); 
        os.close(); 
        } catch (Exception e) { e.printStackTrace(); } 

        try { 
        FileInputStream fis = new FileInputStream("superNotSerail.ser"); 
        ObjectInputStream ois = new ObjectInputStream(fis); 
        c = (ChildSerializable) ois.readObject(); 
        ois.close(); 
        } catch (Exception e) { e.printStackTrace(); } 
        System.out.println("After :- " + c.noOfWheels + " "+ c.color); 
        }



}
