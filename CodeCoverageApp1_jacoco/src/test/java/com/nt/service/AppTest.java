package com.nt.service;

import static org.junit.Assert.assertEquals;


import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    private LoginService service=new LoginService();
    @Test
    public void TestWithValidCredentials()
    {
    	//get actual result
    	String result=service.login("shivam","wagh");
    	assertEquals("test1","valid credentials",result);
        
    }
    
    @Test
    public void TestWithInValidCredentials()
    {
    	//get actual result
    	String result=service.login("shivam","wagh1");
    	assertEquals("test2","invalid credentials",result);
        
    }
}
