package com.nt.config;

import java.time.LocalDateTime;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
@Configuration
@ComponentScan(basePackages="com.nt.sbeans")
public class AppConfig {

	@Bean
	public LocalDateTime createLDT() {
		 LocalDateTime localdateTime=LocalDateTime.now();
		 
		 return localdateTime;
	}
}
