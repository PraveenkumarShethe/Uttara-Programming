package com.manju.java.annotation1;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

public class MethodAnnotedClass {
	
	 
    public static void main(String[] args) {
    }
 
    @Override
    @MethodInfo(author = "Manju", comments = "Main method", date = "Nov 5 2013", revision = 1, authours = { "manjuj","srikanth","chandra" })
    public String toString() {
        return "Overriden toString method";
    }
 
    @Deprecated
    @MethodInfo(comments = "deprecated method", date = "Nov 17 2012", authours = {  "manjuj","srikanth","chandra"  })
    public static void oldMethod() {
        System.out.println("old method, don't use it.");
    }
 
    @SuppressWarnings({ "unchecked", "deprecation" })
    @MethodInfo(author = "Pankaj", comments = "Main method", date = "Nov 17 2012", revision = 10, authours = {  "manjuj","srikanth","chandra" })
    public static void genericsTest() throws FileNotFoundException {
        List l = new ArrayList();
        l.add("abc");
        oldMethod();
    }

}
