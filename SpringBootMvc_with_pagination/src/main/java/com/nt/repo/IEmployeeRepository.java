package com.nt.repo;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;
import com.nt.model.Employee;

@Repository
public interface IEmployeeRepository extends PagingAndSortingRepository<Employee, Integer> {
}
