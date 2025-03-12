package com.nt.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nt.Config.AppConfig;
import com.nt.sbeans.Printer;

public class PrototypeTest {
public static void main(String[] args) {
	

	AnnotationConfigApplicationContext ctx=new AnnotationConfigApplicationContext(AppConfig.class);
		
	Printer p1=ctx.getBean("prn1",Printer.class);
	Printer p2=ctx.getBean("prn1",Printer.class);
	System.out.println(p1.hashCode()+" "+p2.hashCode());

	ctx.close();
}	
}
