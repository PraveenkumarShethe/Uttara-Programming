package com.manju.tecnomen.annoatations;
/**
 * Annotation type is very similar to an interface with little difference.
 	We attach ‘@’ just before interface keyword.
 	Methods will not have parameters.
 	Methods will not have throws clause.
 	Method return types are restricted to primitives, String, Class, enums, annotations, and arrays of the preceding types.
 	We can assign a default value to method.

 */

/**
 * Meta Annotations
 
Annotations itself is meta information then what is meta annotations? As you have rightly guessed, 
it is information about annotation. When we annotate a annotation type then it is called meta annotation. 
For example, we say that this annotation can be used only for methods.

 */

/**
 * Annotation Types
 1.Documented
 When a annotation type is annotated with @Documented then wherever this annotation is used those elements should be documented using Javadoc tool.
 2.Inherited
 This meta annotation denotes that the annotation type can be inherited from super class. When a class is annotated with annotation of type that is annotated with Inherited, then its super class will be queried till a matching annotation is found.
 3.Retention
 This meta annotation denotes the level till which this annotation will be carried. When an annotation type is annotated with meta annotation Retention, RetentionPolicy has three possible values:
 
@Retention(RetentionPolicy.RUNTIME)public @interface Developer {  String value();} 
Class
 When the annotation value is given as ‘class’ then this annotation will be compiled and included in the class file.
 Runtime
 The value name itself says, when the retention value is ‘Runtime’ this annotation will be available in JVM at runtime. We can write custom code using reflection package and parse the annotation. I have give an example below.
 Source
 This annotation will be removed at compile time and will not be available at compiled class.
 
4.Target
 This meta annotation says that this annotation type is applicable for only the element (ElementType) listed. Possible values for ElementType are, CONSTRUCTOR, FIELD, LOCAL_VARIABLE, METHOD, PACKAGE, PARAMETER, TYPE.

 */


/**
 * ‘My’ definition for marker interface
 

“An interface is called a marker interface when it is provided as a handle by java interpreter to mark a class so that
 it can provide special behaviour to it at runtime and they do not have any method declarations”.

 */


import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@Documented
public @interface Developer {
	
	String value() default "[manju]";
	String value1() default "[manju]";

}
