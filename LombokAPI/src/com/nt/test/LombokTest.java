package com.nt.test;

import com.nt.service.Customer;

public class LombokTest {
	public static void main(String[] args) {
		Customer c1=new Customer();
		  c1.setCno(101);
		  c1.setCname("Shivam");
		  c1.setCadd("hyd"); c1.setBillAmt(7800);
		  System.out.println(c1.getCno()+" "+c1.getCname());
		  System.out.println(c1);
	}
  
  
}
