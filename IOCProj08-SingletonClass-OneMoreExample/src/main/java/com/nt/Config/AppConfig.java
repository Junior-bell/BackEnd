package com.nt.Config;

import java.time.LocalDateTime;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
@Configuration
@Scope("singleton")
@ComponentScan(basePackages="com.nt.sbeans")
public class AppConfig {

	@Bean(name ="ldt")
	@Scope("singleton")
	public LocalDateTime createLDT()
	{
		System.out.println("AppConfig.createLDT()");
		return LocalDateTime.now();
	}
	
	@Bean(name="ldt1")
	@Scope("singleton")
	public LocalDateTime createLDT1()
	{
		System.out.println("AppConfig.createLDT()");
		return LocalDateTime.now();
	}
}
