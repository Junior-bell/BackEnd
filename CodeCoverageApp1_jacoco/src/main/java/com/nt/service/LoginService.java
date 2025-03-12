package com.nt.service;
//LoginService.java
public class LoginService {

	public String login(String username, String Password)
	{
		 if((username==null || username.length()==0) ||(Password==null || Password.length()==0))
			 throw new IllegalArgumentException("invalid input");
		 if(username.equalsIgnoreCase("shivam")&& Password.equalsIgnoreCase("wagh"))
			 return "valid credentials";
		 else
		 {
			 return "invalid credentials";
		 }
	}
}
