package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ImportResource;

import com.nt.sbeans.Vehicle;

@SpringBootApplication
@ComponentScan(basePackages = "com.nt.sbeans")
@ImportResource("com/nt/configs/ApplicationContext.xml")
public class BootProj02DependencyInjectionLooseCouplingApplication {

	public static void main(String[] args) {
		ApplicationContext ctx=SpringApplication.run(BootProj02DependencyInjectionLooseCouplingApplication.class, args);
		
		Vehicle vehicle=ctx.getBean("vehicle",Vehicle.class);
		try {
			vehicle.Journey("hyd", "Aurangabad");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//closing the container
		((ConfigurableApplicationContext) ctx).close();
	}

}
