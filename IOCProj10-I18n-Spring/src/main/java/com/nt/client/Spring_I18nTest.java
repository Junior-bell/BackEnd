package com.nt.client;

import java.util.Locale;
import java.util.Scanner;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nt.config.AppConfig;

public class Spring_I18nTest {

	public static void main(String[] args) {
		//creating IOC container
		AnnotationConfigApplicationContext ctx=new AnnotationConfigApplicationContext(AppConfig.class);
		
		//read language code and country code from the end user;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your language code");
		String lang=sc.next();
		System.out.println("Enter your country code ");
		String country=sc.next();
		//prepare Locale obj having language code + country code
		Locale locale=new Locale(lang,country);
		
		//read the message from the Local specific properties file using the ctx.getMessage(-) method
		String msg1=ctx.getMessage("welcome.msg", new Object[] {"raja"},locale);
		String msg2=ctx.getMessage("goodbye.msg", new Object[] {},locale);
		String msg3=ctx.getMessage("application.title", new Object[] {},locale);
		String msg4=ctx.getMessage("wish.message",new Object[] {}, locale);
		//display messages
		System.out.println(msg1+"..."+msg2+"..."+msg3+"..."+msg4);
		
		//close the container 
		sc.close();
		ctx.close();
	}
}
