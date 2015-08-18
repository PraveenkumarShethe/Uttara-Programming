package com.manju.spring.beantest;

/**
 * PersonTest.java
 * 
 * http://programmingforliving.blogspot.com
 */

 
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.manju.spring.bean.Person;
 
/**
 * @author Jiji_Sasidharan
 */
public class PersonTest {
 
    @Test
    public void test() throws Exception {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("Spring-Bean.xml");
        ctx.getBean("john", Person.class).print();
        ctx.getBean("joy", Person.class).print();
        ctx.getBean("person", Person.class).print();
    }
}