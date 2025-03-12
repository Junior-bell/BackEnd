package com.nt;

import java.time.LocalDate;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import com.nt.sbeans.SeasonFinder;

@SpringBootApplication
public class BootProj01DependencyInjectionApplication {
	
	@Bean(name="id")
	 LocalDate createDate()
	{
		return LocalDate.now();
	}

	public static void main(String[] args) {
		
	//Calling IOC container
	ApplicationContext	ctx=SpringApplication.run(BootProj01DependencyInjectionApplication.class, args);
	
	//get target spring bean class obj
	SeasonFinder finder=ctx.getBean("sf",SeasonFinder.class);
	// invoke business methods
	String seasonName=finder.findSeason();
	System.out.println("SeasonName::"+seasonName);
	
	//closing the container
	((ConfigurableApplicationContext)ctx).close();
	
	}

}
