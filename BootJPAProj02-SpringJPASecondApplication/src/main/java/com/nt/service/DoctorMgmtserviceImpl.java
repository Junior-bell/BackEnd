package com.nt.service;



import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.entity.Doctor;
import com.nt.repository.IDoctorRepo;
@Service("doctorService")
public class DoctorMgmtserviceImpl implements IDoctorService {

	@Autowired
	private IDoctorRepo DoctorRepo;
	
	@Override
	public long fetchDoctorsCount() {
		return DoctorRepo.count();
	}
	
	@Override
    public boolean checkDoctorAvailability(Integer id)
    {
		return DoctorRepo.existsById(id);
		
    }
	
	@Override
	public Iterable<Doctor> showAllDoctors(){
		return DoctorRepo.findAll();
	}
	
	@Override
	public Iterable<Doctor> showAllDoctorsByIds(Iterable<Integer> ids)
	{
		return DoctorRepo.findAllById(ids);
		
	}
	@Override
	public Doctor showDoctorById(Integer id)
	{
		Doctor Dutydoctor=new Doctor();
		Dutydoctor.setSpecialization("duty doctor");
       Doctor doctor=DoctorRepo.findById(id).orElseThrow(()->new IllegalArgumentException("Invalid Doctor id"));
		return doctor;
		/*public Doctor showDoctorById(Integer id)
		 * {
		 * Optional<Doctor> opt=doctorRepo.findById(id);
		 * if(opt.isPresent)
		 * {
		 * return opt.get();
		 * else
		 * throw new IllegalArgumentException("Invalid Doctor id");
		 * } */
	
	}
	public String RegisterOrUpdateDoctor(Doctor doctor)
	{
		//load doctor object
		Optional<Doctor> opt=DoctorRepo.findById(doctor.getDocid());
		if(opt.isPresent())
		{
			DoctorRepo.save(doctor);//for update obj objection
			return doctor.getDocid()+"Doctor details are found and updated";
			//doctor details are found and updated
			 
			
		}
		else
			return "Doctor is saved with the id value"+DoctorRepo.save(doctor).getDocid();//For save object Operation
		
	}//Method
	
	public String deleteDoctorbyID(Integer id)
	{
		
		//Load object
		Optional<Doctor> opt=DoctorRepo.findById(id);
		if(opt.isPresent())
		{
			DoctorRepo.deleteById(id);
			return id+"Doctor is deleted";
		}
		else
		{
			return id+"Doctor not found for deletion";
		}
		
	}
	
	@Override
	public String deleteDoctor(Doctor doctor)
	{
		//load object class
		Optional<Doctor> doc=DoctorRepo.findById(doctor.getDocid());
		if(doc.isPresent())
		{
			return doctor.getDocid()+"Doctor not found";
		}
		else
		{
			DoctorRepo.delete(doc.get());
			return doctor.getDocid()+"Doctor found and deleted";		
		}
	}
 
}	
