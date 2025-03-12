package com.nt.dao;

//Login DAO interface
public interface ILoginDAO {

	public int authenticate(String user,String password);
	public String addUser(String username,String role);
}
