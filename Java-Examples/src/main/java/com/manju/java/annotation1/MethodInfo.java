package com.manju.java.annotation1;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Documented
@Retention(RetentionPolicy.CLASS)
@Target(ElementType.METHOD)
@Inherited

public @interface MethodInfo {
	String author()  default "manju";// not allows parameter , no throws class , return type must be primitive or annotation of array of this
	String date();
	int revision() default 1;
	String comments();
	String[] authours();
	

}

