package com.mkyong.common;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.mail.SimpleMailMessage;

public class App 
{
    public static void main( String[] args )
    {
    	 ApplicationContext context = new ClassPathXmlApplicationContext("Spring-Mail.xml");
    	 SimpleMailMessage mm=new SimpleMailMessage();
    	 
    	 
      //  mm.setSubject("Manju---");
    	// String[] to={"manjugm@gmail.com","manjunatha.muniyappa@tecnotree.com"};
    	 String to="manjunatha.muniyappa@tecnotree.com";
    	mm.setFrom("manju@gmail.com");
    	mm.setTo(to);
    	//mm.setText("mmm");
    	MailMail mm1 = (MailMail) context.getBean("mailMail");
    	mm1.setSimpleMailMessage(mm);
    //	mm1.sendMail("manj","mmmm");
       // mm1.sendMail("Yong Mook Kim", "This is text content");
        mm1.sendMailWithOutAtatchement("MMMMM", "MMMMMMM");
    }
}
