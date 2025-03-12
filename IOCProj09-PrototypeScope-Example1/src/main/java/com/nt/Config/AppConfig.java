package com.nt.Config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.nt.sbeans.Printer;

@Configuration
@ComponentScan(basePackages="com.nt.sbeans")
public class AppConfig {
	@Bean(name="prn1")
	@Scope("prototype")
public Printer CreatePrinter1()
{
   System.out.println("AppConfig.CreatePrinter1()");
   return Printer.getInstace();
}
	
}
