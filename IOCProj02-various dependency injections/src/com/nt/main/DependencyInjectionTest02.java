package com.nt.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nt.config.AppConfig;
import com.nt.sbeans.wishMessageGenerator;

public class DependencyInjectionTest02 {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx=new AnnotationConfigApplicationContext(AppConfig.class);
		wishMessageGenerator result=ctx.getBean("wmg",wishMessageGenerator.class);
		 String wish=result.getMessage("shivam");
		 System.out.println(wish);
		ctx.close();
	}
}
