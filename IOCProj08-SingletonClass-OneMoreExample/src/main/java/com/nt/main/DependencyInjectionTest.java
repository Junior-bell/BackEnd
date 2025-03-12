package com.nt.main;

import java.time.LocalDateTime;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nt.Config.AppConfig;
import com.nt.sbeans.WishMessageGenerator;

public class DependencyInjectionTest {

	public static void main(String[] args) {
		//create IOC container
		AnnotationConfigApplicationContext ctx=new AnnotationConfigApplicationContext(AppConfig.class);
		
		//getting the target spring beans
		WishMessageGenerator generator=ctx.getBean("wmg",WishMessageGenerator.class);
		WishMessageGenerator generator1=ctx.getBean("wmg",WishMessageGenerator.class);
		WishMessageGenerator generator2=ctx.getBean("wmg",WishMessageGenerator.class);
		
		//printing this beans and comparing if they singleton class beans or not 
		System.out.println(generator.hashCode()+" "+generator1.hashCode()+" "+generator2.hashCode());
		System.out.println("generator==generator1?"+(generator==generator1));// all objects gives same hashcodes
		System.out.println("generator1==generator2?"+(generator1==generator2));// gives true in output as all hashcodes are same
		
		System.out.println("--------------------------");
		LocalDateTime ldt1=ctx.getBean("ldt",LocalDateTime.class);
		LocalDateTime ldt2=ctx.getBean("ldt",LocalDateTime.class);
		System.out.println(ldt1.hashCode()+" "+ldt2.hashCode());
		System.out.println("-----------------");
		
		LocalDateTime ldt3=ctx.getBean("ldt",LocalDateTime.class);
		LocalDateTime ldt4=ctx.getBean("ldt",LocalDateTime.class);
		System.out.println(ldt3.hashCode()+" "+ldt4.hashCode());
		
	
		ctx.close();
		
		
	}
}
