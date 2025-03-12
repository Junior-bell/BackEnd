package com.nt.repo;

import com.nt.model.Employee;

public interface IEmployeeRepository extends org.springframework.data.repository.CrudRepository<Employee, Integer>
{
	
}