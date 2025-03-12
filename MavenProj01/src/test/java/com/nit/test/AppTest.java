package com.nit.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.nit.service.App;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    @Test
	public void testsumWithPositives()//test case 1
    {
    	int val1=10;
    	int val2=20;
    	int expected=30;
    	App app=new App();
    	int actual=app.sum(val1,val2);
    	assertEquals(expected, actual);
    }
    @Test
   	public void testsumWithNegatives()//test case 2
       {
       	int val1=-10;
       	int val2=-20;
       	int expected=-30;
       	App app=new App();
       	int actual=app.sum(val1,val2);
       	assertEquals(expected, actual);
       }
    @Test
   	public void testsumWithZeros()//test case 3
       {
       	int val1=0;
       	int val2=0;
       	int expected=0;
       	App app=new App();
       	int actual=app.sum(val1,val2);
       	assertEquals(expected, actual);
       }
}
