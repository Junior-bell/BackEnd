package com.nt.runners;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
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
			 * System.out.println("count of records "+service.fetchDoctorsCount());
			 * System.out.println("201 id doctor exists?:: "+service.checkDoctorAvailability
			 * (201)); Iterable<Doctor> it=service.showAllDoctors();
			 * 
			 * it.forEach(doc->{ System.out.println(doc); }); java 8 feature for-each method
			 * 
			 * it.forEach(doc->System.out.println(doc)); improved for-each method of java 8
			 * 
			 * it.forEach(System.out::println); // static method referencing
			 * 
			 * 
			 * for(Doctor doc:it) { System.out.println(doc);//java 5 enhanced for loop }
			 * 
			 * ((List<Doctor>)it).stream().forEach(System.out::println);
			 */
			/*
			 * service.showAllDoctorsByIds(List.of(125,126,127,128)).forEach(System.out::
			 * println);
			 */
		 Doctor doctor5=new Doctor(129,"kishor borde","dermetalogist",11900000.0D);
		 Doctor doctor6=new Doctor(130,"saee ingale","cardiologist",1350000.0D);
		 List<Doctor> list=List.of(doctor5,doctor6);
		 String msg=service.registerAllDoctors(list);
		 System.out.println(msg);
	   }
	   catch(Exception e)
	   {
		   e.printStackTrace();
		   
	   }
	}

}
