package com.manju.tecnomen.annoatations;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
public class TestAnnotation {
  public static void main(String args[]) throws SecurityException,
      ClassNotFoundException {
    for (Method method : Class.forName(
        "com.manju.tecnomen.annoatations.NGMModules").getMethods()) {
      // checks if there is annotation present of the given type Developer
      if (method
          .isAnnotationPresent(com.manju.tecnomen.annoatations.Developer.class)) {
        try {
          // iterates all the annotations available in the method
          for (Annotation anno : method.getDeclaredAnnotations()) {
            System.out.println("Annotation in Method '" + method
                + "' : " + anno);
            Developer a = method.getAnnotation(Developer.class);
            System.out.println(a.value1()+"  -Value- "+a.value());
           
          }
        } catch (Throwable ex) {
          ex.printStackTrace();
        }
      }
    }
  }
}