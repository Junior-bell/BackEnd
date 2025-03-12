package com.nt.client;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nt.config.AppConfig;
import com.nt.sbeans.CheckVotingEligibility;

public class SpringBeanLifeCycleTest {
	public static void main(String[] args) {
		//creating container
		AnnotationConfigApplicationContext ctx=new AnnotationConfigApplicationContext(AppConfig.class);
		//get target bean class obj ref
	CheckVotingEligibility check= ctx.getBean("voter",CheckVotingEligibility.class);
		
		//invoke business logic
		try {
			String result=check.checkEligibility();
			System.out.println(result);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		ctx.close();
	}
}
