package com.nit.test;
import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTimeout;

import java.time.Duration;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import com.nt.service.BankService;
@DisplayName("testing the bank services")
public class AppTest
{
	private static BankService bankservice;
	
	@BeforeAll
	public static void Setup()
	{
		System.out.println("AppTest.Setup()");
		bankservice=new BankService();
		
	}
	@BeforeEach
	public void beforeTest()
	{
		System.out.println("AppTest.beforeTest()");
	}
	@DisplayName("test with big values")
	@Test
	public void testCalcIntrstAmountWithBigvalues()//case 1
	{
		double expected=288000.0;
		double actual=bankservice.calclIntrstAmount(1200000.0, 2.0, 12.0);
	    assertEquals(expected, actual,1.0f);
	}
	@Test
	@DisplayName("test with small values")
     @Tag("test")
	public void testCalcIntrstAmountWithSmallvalues()//case 2
	{
		double expected=1200.0;
		double actual=bankservice.calclIntrstAmount(10000.0, 1.0, 12.0);
	    assertEquals(expected, actual,0.1f);
	}
	@Test
	@DisplayName("test with small values")
	@Tag("test")
	public void testCalcIntrstAmountWithZeroOrNegativeValues()
	{
		assertThrows(IllegalArgumentException.class,()->{
			bankservice.calclIntrstAmount(120000.0, 0, 0);
		}
		);
	}
	@Test
	public void testCalcIntrstAmountTimer()
	{
		assertTimeout(Duration.ofMillis(30015),()->{
			bankservice.calclIntrstAmount(100000.0,2.0, 12);
		});
	}
	@AfterEach
	public void afterTest()
	{
		System.out.println("AppTest.afterTest()");
	}
	@AfterAll
	public static void teardown()
	{
		System.out.println("AppTest.teardown()");
		bankservice=null;
	}
	
	
}