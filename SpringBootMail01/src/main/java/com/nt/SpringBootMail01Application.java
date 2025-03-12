package com.nt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import com.nt.service.IpurchaseOrder;
import com.nt.service.PurchaseOrderImpl;

@SpringBootApplication
public class SpringBootMail01Application {

	public static void main(String[] args) {
		ApplicationContext ctx=SpringApplication.run(SpringBootMail01Application.class, args);
		//get service class obj ref
		IpurchaseOrder order=ctx.getBean("PurchaseService",PurchaseOrderImpl.class);
		//invoke bussiness method
		try
		{
			String msg=order.purchase(new String[] {"shirt","Trouser","watch"}, new double[] {5000,6000,7000}, new String[] {"waghshivam322@gmail.com","www.qshivamwagh@gmail.com","waghshivam008@gmail.com"});
			System.out.println(msg);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		finally 
		{
			((ConfigurableApplicationContext) ctx).close();
		}
	}

}
