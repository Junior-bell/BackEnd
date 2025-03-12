package com.nt.client;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.env.Environment;

import com.nt.config.AppConfig;
import com.nt.sbeans.PersonalInfo;

public class PropertiesFileTest {

	public static void main(String[] args) {
		//create IOC container
		AnnotationConfigApplicationContext ctx=new AnnotationConfigApplicationContext(AppConfig.class);
		// getting spring bean class obj ref
		PersonalInfo info=ctx.getBean("pinfo",PersonalInfo.class);
		//printing the info
		System.out.println(info);
		
		//to access environmental objects
           Environment env=ctx.getEnvironment();
           System.out.println("os.name:::"+env.getProperty("os.name"));
		
		
		//closing the container
		ctx.close();
	}
}
