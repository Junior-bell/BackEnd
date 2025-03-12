package com.nt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan
public class BootMvcProj01FirstAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(BootMvcProj01FirstAppApplication.class, args);
	}

}
