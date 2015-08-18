package com.manju.spring.jbcc;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;

@Configuration
@Scope(proxyMode=ScopedProxyMode.INTERFACES)
public class AppConfig {

	@Bean
	public MyserviceImpl myServiceBean(){
		return new MyserviceImpl();
	}
	
	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx=new AnnotationConfigApplicationContext(AppConfig.class);
		//ctx.refresh();
		MyserviceImpl m=ctx.getBean(MyserviceImpl.class);
		m.print();
	}

}
