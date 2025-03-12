package com.nt.tests;

import static org.junit.Assert.assertTrue;

import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import com.nt.dao.ILoginDAO;
import com.nt.service.ILoginMgmtService;
import com.nt.service.LoginMgmtServiceImpl;

public class LoginTestWithMockito {

	private static ILoginMgmtService Loginservice;
	private static ILoginDAO loginDAO;
	
	@BeforeAll
	public void setUp()
	{
		//mock the LoginDAO
		loginDAO=Mockito.mock(ILoginDAO.class);
	    System.out.println("Mock object class name::"+loginDAO.getClass());
	    //create service class obj
	    Loginservice=new LoginMgmtServiceImpl(loginDAO);
	}
	
	@Test
	public void testLoginWithValidCredentials()
	{
		//provide some functionality for authentication method on the mock DAO
		Mockito.when(loginDAO.authenticate("raja", "rani")).thenReturn(1);
		//perform testing
		assertTrue(Loginservice.login("raja", "rani"));
	}
	
	public void testLoginWithNoCredentials()
	{
		assertThrows(IllegalArgumentException.class,()->Loginservice.login("", ""));
	}
	
	@Test
	public void testRegisterUserWithSpy()
	{
		//create spy object
		ILoginDAO loginDAOSpy=Mockito.spy(ILoginDAO.class);
		//create service class object
		ILoginMgmtService LoginService=new LoginMgmtServiceImpl(loginDAOSpy);
		LoginService.registerUser("raja", "rani");
		LoginService.registerUser("suresh", "ratna");
		LoginService.registerUser("ramesh", "aarti");
		
		//check whether addUser(--,--) is called expected no. of times
		Mockito.verify(loginDAOSpy,Mockito.times(1)).addUser("raja", "admin");
		Mockito.verify(loginDAOSpy,Mockito.times(1)).addUser("suresh"	, "customer");
		Mockito.verify(loginDAOSpy,Mockito.never()).addUser("Ramesh", "Aarti");
		Mockito.verify(loginDAOSpy,Mockito.times(0)).addUser("Jani"	, "");
		
	}
	@AfterAll
	public static void clearDown()
	{
		loginDAO=null;
		Loginservice=null;
	}
}	
