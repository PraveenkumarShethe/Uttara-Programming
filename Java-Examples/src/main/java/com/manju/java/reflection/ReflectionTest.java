package com.manju.java.reflection;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.Arrays;

public class ReflectionTest {

	// get Class object using reflection
	/**
	 * We can get Class of an object using three methods – through static
	 * variable class, using getClass() method of object and
	 * java.lang.Class.forName(String fullyClassifiedClassName). For primitive
	 * types and arrays, we can use static variable class. Wrapper classes
	 * provide another static variable TYPE to get the class.
	 */
	/**
	 * 
	 * @param args
	 */

	static void getClassObjectUsingReflection() {
		// Get Class using reflection
		Class<?> concreteClass = ConcreteClass.class;
		concreteClass = new ConcreteClass(5).getClass();
		try {
			// below method is used most of the times in frameworks like JUnit
			// Spring dependency injection, Tomcat web container
			// Eclipse auto completion of method names, hibernate, Struts2 etc.
			// because ConcreteClass is not available at compile time
			concreteClass = Class
					.forName("com.manju.java.reflection.ConcreteClass");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		System.out.println(concreteClass.getCanonicalName()); // prints
																// com.journaldev.reflection.ConcreteClass

		// for primitive types, wrapper classes and arrays
		Class<?> booleanClass = boolean.class;
		System.out.println(booleanClass.getCanonicalName()); // prints boolean

		Class<?> cDouble = Double.TYPE;
		System.out.println(cDouble.getCanonicalName()); // prints double

		Class<?> twoDStringArray = String[][].class;
		System.out.println(twoDStringArray.getCanonicalName()); // prints
																// java.lang.String[][]
	}

	// Get Super class
	/**
	 * getSuperclass() method on a Class object returns the super class of the
	 * class. If this Class represents either the Object class, an interface, a
	 * primitive type, or void, then null is returned. If this object represents
	 * an array class then the Class object representing the Object class is
	 * returned.
	 */

	static void getSuperclassOfClassUsingReflection() {
		Class<?> superClass;
		try {
			superClass = Class.forName("com.manju.java.reflection.ConcreteClass").getSuperclass();
			System.out.println(superClass); // prints
											// "class com.journaldev.reflection.BaseClass"
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// System.out.println(superClass); // prints
		// "class com.journaldev.reflection.BaseClass" check difference

		System.out.println(Object.class.getSuperclass()); // prints "null"
		System.out.println(String[][].class.getSuperclass());// prints
																// "class java.lang.Object"
	}

	// Get Public Member Classes
	/**
	 * getClasses() method of a Class representation of object returns an array
	 * containing Class objects representing all the public classes, interfaces
	 * and enums that are members of the class represented by this Class object.
	 * This includes public class and interface members inherited from
	 * superclasses and public class and interface members declared by the
	 * class. This method returns an array of length 0 if this Class object has
	 * no public member classes or interfaces or if this Class object represents
	 * a primitive type, an array class, or void.
	 */

	static void getMemberClassesUsingReflection() {
		Class<?>[] memberClasses;
		try {
			memberClasses = Class.forName("com.manju.java.reflection.ConcreteClass").getClasses();
			for (Class<?> c : memberClasses)
				System.out.println(c.getCanonicalName());
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	// Get Declared Classes
	/**
	 * getDeclaredClasses() method returns an array of Class objects reflecting
	 * all the classes and interfaces declared as members of the class
	 * represented by this Class object. The returned array doesn’t include
	 * classes declared in inherited classes and interfaces.
	 */

	static void getDeclaredClassesUsingReflection() {
		Class<?>[] memberClasses;
		try {
			memberClasses = Class.forName("com.manju.java.reflection.ConcreteClass").getDeclaredClasses();
			for (Class<?> c : memberClasses)
				System.out.println(c.getCanonicalName());

			System.out.println(Arrays.toString(memberClasses));
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	// Get Declaring Class
	/**
	 * getDeclaringClass() method returns the Class object representing the
	 * class in which it was declared.
	 */

	static void getDeclaringClassUsingReflection() {
		try {
			Class<?> innerClass = Class.forName("com.manju.java.reflection.ConcreteClass$ConcreteClassDefaultClass");

			System.out.println(innerClass.getDeclaringClass().getCanonicalName());
			System.out.println(innerClass.getEnclosingClass().getCanonicalName());
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	// Get Package Name

	static void getPackageNameOfClassUsingReflection() {
		try {
			
			System.out.println(Class.forName("com.manju.java.reflection.BaseInterface").getPackage().getName());
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
// Get Class Modifier
	
	static void getClassModifierUsingReflection() {
		try {
			Class<?> concreteClass = Class.forName("com.manju.java.reflection.ConcreteClass");
			System.out.println(concreteClass.getModifiers());
			System.out.println(Modifier.toString(concreteClass.getModifiers())); //prints "public"
			System.out.println(Class.forName("com.manju.java.reflection.BaseInterface").getModifiers());
			System.out.println(Modifier.toString(Class.forName("com.manju.java.reflection.BaseInterface").getModifiers()));


		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	//Get Type Parameters
	/**
	 * getTypeParameters() returns the array of TypeVariable if there are any Type parameters associated with the class. 
	 * The type parameters are returned in the same order as declared.
	 * @param args
	 */
	
	static void getTypeParameterForClassUsingReflection(){
		try{
		TypeVariable<?>[] typeParameters = Class.forName("java.util.HashMap").getTypeParameters();
		for(TypeVariable<?> t : typeParameters)
		System.out.println(t.getName()+",");
		}catch(ClassNotFoundException e){
			e.printStackTrace();
		}
		
		//Get Implemented Interfaces
		
		try{
			System.out.println("Get Implemented Interfaces HasMap");
			Type[] interfaces = Class.forName("java.util.HashMap").getGenericInterfaces();
			for (Type c : interfaces)
				System.out.println(c.toString());
			//prints "1"
			System.out.println(Arrays.toString(interfaces));
			//prints "[interface java.util.Map, interface java.lang.Cloneable, interface java.io.Serializable]"
			System.out.println(Arrays.toString(Class.forName("java.util.HashMap").getInterfaces()));
			}catch(ClassNotFoundException e){
				e.printStackTrace();
			}
		
		//Get All Public Methods
		
		
		try{
			/**
			 * getMethods() method returns the array of public methods of the Class including public methods of it’s superclasses and super interfaces.
			 */
			System.out.println("Get All Public Methods ConcreteClass");
			Method[] publicMethods = Class.forName("com.manju.java.reflection.ConcreteClass").getMethods();
			for (Method method : publicMethods)
				System.out.println(method.toString());
			//prints public methods of ConcreteClass, BaseClass, Object
			System.out.println(Arrays.toString(publicMethods));
			}catch(ClassNotFoundException e){
				e.printStackTrace();
			}
		
		//Get All Public Constructors
		
		
		try{
			/**
			 * etConstructors() method returns the list of public constructors of the class reference of object.
			 */
			System.out.println("Get All  Public Constructors ConcreteClass");
			//Get All public constructors
			Constructor<?>[] publicConstructors = Class.forName("com.manju.java.reflection.ConcreteClass").getConstructors();
			for (Constructor<?> method : publicConstructors)
				System.out.println(method.toString());
			//prints public constructors of ConcreteClass
			
			}catch(ClassNotFoundException e){
				e.printStackTrace();
			}
		
		//Get All Public Fields
		
		
		
		try{
			/**
			 * getFields() method returns the array of public fields of the class including public fields of it’s super classes and super interfaces.
			 */
			System.out.println("Get All Public getFields ConcreteClass");
			
			//Get All public fields
			Field[] publicFields = Class.forName("com.manju.java.reflection.ConcreteClass").getFields();
			for (Field method : publicFields)
				System.out.println(method.toString());
			//prints public fields of ConcreteClass, it's superclass and super interfaces
			System.out.println(Arrays.toString(publicFields));
			
			}catch(ClassNotFoundException e){
				e.printStackTrace();
			}
		
		
		//Get All Annotations	
		try{
			/**
			 * getAnnotations() method returns all the annotations for the element, we can use it with class, fields and methods also. 
			 * Note that only annotations available with reflection are with retention policy of RUNTIME,
			 */
			System.out.println("Get All Annotations	");
			java.lang.annotation.Annotation[] annotations = Class.forName("com.manju.java.reflection.ConcreteClass").getAnnotations();
			for (Annotation method : annotations)
				System.out.println(method.toString());
			
			//prints [@java.lang.Deprecated()]
			System.out.println(Arrays.toString(annotations));
			}catch(ClassNotFoundException e){
				e.printStackTrace();
			}
		
		
	
		
	}
	
	
	
	static void reflectionForFields(){
		
		
		
		
	}
	
	

	public static void main(String[] args) {
		System.out.println("###############  getClassObjectUsingReflection   ##################");
		// getClassObjectUsingReflection();
		System.out.println("###############  getSuperclassOfClassUsingReflection   ##################");
		// getSuperclassOfClassUsingReflection();
		System.out.println("###############  getMemberClassesUsingReflection   ##################");
		// getMemberClassesUsingReflection();
		System.out.println("###############  getDeclaredClassesUsingReflection   ##################");
		// getDeclaredClassesUsingReflection();
		System.out.println("###############  getDeclaringClassUsingReflection   ##################");
		// getDeclaringClassUsingReflection();
		System.out.println("###############  getPackageNameOfClassUsingReflection   ##################");
		// getPackageNameOfClassUsingReflection();
		System.out.println("###############  getClassModifierUsingReflection   ##################");
		//getClassModifierUsingReflection();
		System.out.println("###############  getClassModifierUsingReflection   ##################");
		  getTypeParameterForClassUsingReflection();


	}

}
