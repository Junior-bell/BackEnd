	package com.nt.tests;
	
	import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import com.nt.dao.ILoginDAO;
import com.nt.service.LoginMgmtServiceImpl;
	
	public class LoginTestWithMockitoAnnotations {
		
		@Mock
		private static ILoginDAO LoginDAO;
	
		@InjectMocks //create the service class obj
		private LoginMgmtServiceImpl service;
		
	
		
		@BeforeEach
		public void setUp() {
			MockitoAnnotations.openMocks(this);
		}
		
		@Test
		public void TestLoginWithValidCredentials()
		{
			//provide some functionality for authentication method on the mock DAO object{stub object}
			Mockito.when(LoginDAO.authenticate("raja","rani")).thenReturn(1);
			//perform testing 
			assertTrue(service.login("raja", "rani"));
		}
		
		@Test
		public void TestWithNoCredentials()
		{
			assertThrows(IllegalArgumentException.class,()->service.login("",""));
		}
		
		@Test
		public void testRegisterUserWithSpy() {
			//create the object 
			ILoginDAO LoginDAOSpy=Mockito.spy(ILoginDAO.class);
			//create service class implementation
			LoginMgmtServiceImpl loginservice=new LoginMgmtServiceImpl(LoginDAOSpy);
			
			//invoke the methods
			loginservice.registerUser("shekhar", "sarthak");
			loginservice.registerUser("suresh", "Ratna");
			loginservice.registerUser("sanika", "");
			
			//check the whether the user is called expected no.of times or not
			Mockito.verify(LoginDAOSpy,Mockito.times(1)).addUser("shekhar", "sarthak");
			Mockito.verify(LoginDAOSpy,Mockito.times(1)).addUser("suresh", "Ratna");
			Mockito.verify(LoginDAOSpy,Mockito.times(0)).addUser("sanika", "...");
			
		}
	}
