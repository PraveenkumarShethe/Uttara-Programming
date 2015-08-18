package com.manju.java.serialize4;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * FOOD is the non Serializable parent of Fruit. 
 * It is not Serialized and so the constructor has to be called to set any fields which need to be set. 
 * However, SkinFruit,and Banana2 are all Serializable and their fields have been serializable and will be reset. 
 * There is no need to call the constructor.
 * Q8) Are the static variables saved as the part of serialization?

	Ans) No. The static variables belong to the class and not to an object they are not the part of the state of the object so they are not saved as the part of serialized object.
 *
 */

public class Banana2 extends SkinFruit { 
	  private static final long serialVersionUID = 1L;
	  public final String className="Banana2";
	  int size = 42;
	  private static String name="Manju";
	  public Banana2() {
		 //name="Chnaged";
		System.out.println("BANANA2 EXTENDS SKIN FRUIT ( ALREADY SKIN FRUIT IMPLEMENTS SERIALIZABLE )");
	}
	  
	  private void readObject(ObjectInputStream in) throws IOException, ClassNotFoundException {
		    System.out.println(" Desrialize ..........");
		}
	  
	  private void writeObject(ObjectOutputStream out) throws IOException {
		  System.out.println(" Serialize ............."); 
		}

	  // We 
	     public static void main(String [] args) {
System.out.println("Serialize STARTS ");
	       Banana2 b = new Banana2();
	     //  name="Chnaged";
	       FileOutputStream fost;
	       /* try {
	            fost = new FileOutputStream(new File("testbanana.ser"));
	            ObjectOutputStream oostr= new ObjectOutputStream(fost);
	            oostr.writeObject(b);
	            oostr.flush();          
	            oostr.close();
	        } catch (FileNotFoundException e) {
	            e.printStackTrace();
	        }catch (IOException e) {
	            e.printStackTrace();
	        }*/



	        try {
	        	
	            FileInputStream fin= new FileInputStream(new File("testbanana.ser"));
	            ObjectInputStream objin= new ObjectInputStream(fin);
	           Banana2  b1=(Banana2)objin.readObject();
	           System.out.println("name " + b1.name + "Class Name " +b1.className +" restored "+ b1.size + "" );

	        } catch (FileNotFoundException e) {
	            e.printStackTrace();
	        } catch (IOException e) {
	            e.printStackTrace();
	        } catch (ClassNotFoundException e) {
	            e.printStackTrace();
	        }
 


	       //System.out.println("name " + b.name +b.className +" restored "+ b.size + "" );
	     }

}
