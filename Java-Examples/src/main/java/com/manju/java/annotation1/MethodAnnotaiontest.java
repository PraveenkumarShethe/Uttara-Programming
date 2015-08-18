package com.manju.java.annotation1;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

public class MethodAnnotaiontest {

	/**
	 * @param args
	 */

	public static void main(String[] args) {
		try {
			System.out.println("Enter ");
			for (Method method : MethodAnnotedClass.class.getClassLoader().loadClass(("com.manju.java.annotation1.MethodAnnotedClass")).getMethods()) {
				// checks if MethodInfo annotation is present for the method
				if (method.isAnnotationPresent(com.manju.java.annotation1.MethodInfo.class)) {
					try {
						// iterates all the annotations available in the method
						for (Annotation anno : method.getDeclaredAnnotations()) {
							System.out.println("Annotation in Method '"+ method + "' : " + anno);
						}
						MethodInfo methodAnno = method.getAnnotation(MethodInfo.class);
						if (methodAnno.revision() == 1) {
							System.out.println("Method with revision no 1 = "+ method);
						}
						String[] str=methodAnno.authours();
						for(String author:str){
							System.out.println("##### "+author);
						}

					} catch (Throwable ex) {
						ex.printStackTrace();
					}
				}
			}
		} catch (SecurityException | ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	// TODO Auto-generated method stub

}
