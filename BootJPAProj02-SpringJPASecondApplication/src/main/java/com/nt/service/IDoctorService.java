package com.nt.service;



import com.nt.entity.Doctor;

public interface IDoctorService {

	public long fetchDoctorsCount();
	public boolean checkDoctorAvailability(Integer id);
	public Iterable<Doctor> showAllDoctors();
	public Iterable<Doctor> showAllDoctorsByIds(Iterable<Integer> ids);
	public Doctor showDoctorById(Integer id);
	public String RegisterOrUpdateDoctor(Doctor doctor);
	public String deleteDoctorbyID(Integer id);
	public String deleteDoctor(Doctor doctor);
	
}
