package com.nt.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.entity.Doctor;
import com.nt.repository.IDoctorRepo;
@Service("doctorService")
public class DoctorMgmtserviceImpl implements IDoctorService {

	@Autowired
	private IDoctorRepo DoctorRepo;
	
	@Override
	public String registerAllDoctors(List<Doctor> list)
	{
		Iterable<Doctor> it=DoctorRepo.saveAll(list);
		return list.size()+"doctor are registered";
		
	}
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
	
	public Iterable<Doctor> showAllDoctorsByIds(Iterable<Integer> ids)
	{
		return DoctorRepo.findAllById(ids);
		
	}
 
}
