package com.manju.spring.impor;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import(B.class)
public class B {
	
	public @Bean B b(){
		System.out.println("B");
		return null;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx=new AnnotationConfigApplicationContext(B.class);
		

	}

}
