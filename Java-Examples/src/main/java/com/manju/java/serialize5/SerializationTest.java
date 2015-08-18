package com.manju.java.serialize5;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * @author manjugm
 *
 */
public class SerializationTest {

 /**
  * @param args
  * @throws IOException 
  * @throws FileNotFoundException 
  * @throws ClassNotFoundException 
  */
 public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
  ConnectionFactory INSTANCE=ConnectionFactory.getInstance();
  
  //Here I am serializing the connection factory instance
  ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("connFactory.ser"));  
        oos.writeObject(INSTANCE);  
        oos.close();  
        
        //Here I am recreating the instance by reading the serialized object data store
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("connFactory.ser"));  
        ConnectionFactory factory1 = (ConnectionFactory) ois.readObject();  
        ois.close();  
        
        //I am recreating the instance AGAIN by reading the serialized object data store
        ObjectInputStream ois2 = new ObjectInputStream(new FileInputStream("connFactory.ser"));  
        ConnectionFactory factory2 = (ConnectionFactory) ois2.readObject();  
        ois2.close();
        
        //Lets see how we have broken the singleton behavior
        
        System.out.println("Instance reference check->" +factory1.getInstance());
        System.out.println("Instance reference check->" +factory2.getInstance());
        System.out.println("=========================================================");
        System.out.println("Object reference check->"+factory1);
        System.out.println("Object reference check->"+factory2);
 }

}
