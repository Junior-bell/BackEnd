package com.nt;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import com.nt.controller.PayOperationsController;
import com.nt.model.Employee;

@SpringBootApplication
public class BootProj03LayeredAppApplication {

	public static void main(String[] args) {
		//get IOC container
	ApplicationContext ctx=SpringApplication.run(BootProj03LayeredAppApplication.class, args);
	//get controller class obj ref
	PayOperationsController controller=ctx.getBean("payroll",PayOperationsController.class);
   
	//invoke the b.method
	try {
		List<Employee> list=controller.showEmployeesByDesgs("CLERK", "MANAGER", "SALESMAN");
		list.forEach(emp->{
			System.out.println(emp);
		});
	}//try
	catch(Exception e) {
		e.printStackTrace();
	  System.err.println("internal Problem--try again::"+e.getMessage());
	}//catch
	//close the container
	((ConfigurableApplicationContext) ctx).close();
	}//main
	

}//class
