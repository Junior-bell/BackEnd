package com.nt.runners;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Component;

import com.nt.entity.Doctor;
import com.nt.service.DoctorMgmtserviceImpl;
@Component
public class CommandLineImpl implements CommandLineRunner  {
  
	@Autowired
	private DoctorMgmtserviceImpl service;
	
	@Override
	public void run(String... args) throws Exception {
		
	   try {
			/*
			  service.ShowDoctorBySorting(true, "docName").forEach(System.out::println);
			  System.out.println("--------------------------");
			  service.ShowDoctorBySorting(false,
			  "docName","income").forEach(System.out::println);
			 */
			/*
			 * service.showDoctorsInfoByPageNo(1, 3, true,
			 * "docName").forEach(System.out::println); Page<Doctor>
			 * page=service.showDoctorsInfoByPageNo(2, 3, false, "docName");
			 * System.out.println("page Number:: "+page.getNumber());
			 * System.out.println("pages count:: "+page.getTotalPages());
			 * System.out.println("is it first page::"+page.isFirst());
			 * System.out.println("is is last page::"+page.isLast());
			 * System.out.println("page size::"+page.getSize());
			 * System.out.println("page elements count::"+page.getNumberOfElements());
			 * if(!page.isEmpty()) { List<Doctor> list=page.getContent();
			 * list.forEach(System.out::println); } else {
			 * System.out.println("page not found"); }
			 */
		   System.out.println(service.deleteDoctorInBatch(List.of(678,101)));
	}
	   catch(Exception e)
	   {
		   e.printStackTrace();
		   
	   }
	}

}
