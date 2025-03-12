package com.nt.main;
import com.nt.config.AppConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nt.sbeans.WishMessageGenerator;

public class DependencyInjectionTest {
public static void main(String[] args) {
	//creating a IOC container
	AnnotationConfigApplicationContext ctx=new AnnotationConfigApplicationContext(AppConfig.class);
	/*get target spring bean class obj from ioc container
	Object obj=ctx.getBean("wmg");//here obj(object reference variable) is referring to wishMessageGenerator class obj
	//typecasting to wish message generator.
	WishMessageGenerator generator=(WishMessageGenerator)obj;*/
	
	WishMessageGenerator generator=ctx.getBean("wmg",WishMessageGenerator.class);//get bean from target class
	String result=generator.showWishMessage("shivam");//call method named wishMessage from target class having string parameter.
	System.out.println(result);//print out the result; good morning/good evening/good night.+user(shivam)
	ctx.close();//closing the container.
}
}
