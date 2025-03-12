package com.nt.runners;

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
		// service.showAllDoctorsByIds(List.of(125,126,127,128,952,953)).forEach(System.out::println);
		
		/*
		 * Doctor doctor=service.showDoctorById(952); System.out.println(doctor);
		 * 
		 * Doctor doc=new Doctor();
		 * doc.setDocid(1015);doc.setDocName("Karan");doc.setIncome(870000.0);doc.
		 * setSpecialization("Cardio");
		 * System.out.println(service.RegisterOrUpdateDoctor(doc));
		 */
		/* System.out.println(service.deleteDoctorbyID(1952)); */
		   Doctor doc=new Doctor();
		   doc.setDocid(2002);doc.setDocName("kartik");
		   System.out.println(service.deleteDoctor(doc));
		   
	}
	   catch(Exception e)
	   {
		   e.printStackTrace();
		   
	   }
	}

}
