package com.nt.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nt.config.AppConfig;
import com.nt.sbeans.SeasonFinder;

public class DependencyInjectionTest01 {
public static void main(String[] args) {
	AnnotationConfigApplicationContext ctx=new AnnotationConfigApplicationContext(AppConfig.class);

	SeasonFinder  season=ctx.getBean("sf",SeasonFinder.class);
    String result=season.FindSeason();
    System.out.println("the current season is: "+result);
    ctx.close();
}
}
