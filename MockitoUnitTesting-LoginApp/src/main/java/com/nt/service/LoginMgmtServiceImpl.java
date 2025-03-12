package com.nt.service;

import com.nt.dao.ILoginDAO;
//service implementation class
public class LoginMgmtServiceImpl implements ILoginMgmtService{

	private ILoginDAO dao;
	public LoginMgmtServiceImpl(ILoginDAO dao)
	{
		this.dao=dao;
	}
	@Override
	public boolean login(String user,String pwd)
	{
		if(user.equalsIgnoreCase(" ")||pwd.equalsIgnoreCase(""))
		{
			throw new IllegalArgumentException("Invalid inputs");
		
		
		}//use DAO
		else {
		return true;
			}
	}
	
	public String registerUser(String user,String role)
	{
		if(user.equals("")|| !role.equals(""))
		{
			//use DAO
			dao.addUser(user, role);
			return "user added";
		}
		else
		{
			return "user not added";
		}
	}
}
